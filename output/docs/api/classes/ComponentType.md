---
title: ComponentType
kind: class
package: com.hypixel.hytale.component
api_surface: true
extends: ~
implements:
  - Comparable<ComponentType<ECS_TYPE, ?>>
  - Query<ECS_TYPE>
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - ecs
  - component
  - type
  - query
  - registry
---

**Package:** `com.hypixel.hytale.component`

```java
public class ComponentType<ECS_TYPE, T extends Component<ECS_TYPE>> implements Comparable<ComponentType<ECS_TYPE, ?>>, Query<ECS_TYPE>
```

A type-safe key that identifies a specific component within the ECS. Every component class registered with the system has a corresponding `ComponentType` instance. This instance is used to get, add, and remove components on entities via [Store](Store.md), and also serves as the simplest form of `Query` for system matching.

`ComponentType` instances are created exclusively through [ComponentRegistryProxy.registerComponent()](ComponentRegistryProxy.md) -- plugin code does not instantiate them directly.

## Static Fields

```java
@Nonnull
public static final ComponentType[] EMPTY_ARRAY = new ComponentType[0]
```

Shared empty array constant. Used by internal APIs to avoid allocating empty arrays.

## Methods

### Registry Access

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

Returns the `ComponentRegistry` that this type is registered in. There is one `ComponentRegistry` per store type (`EntityStore.REGISTRY`, `ChunkStore.REGISTRY`).

### Type Class

```java
@Nonnull
public Class<? super T> getTypeClass()
```

Returns the Java class that this component type represents. This is the class passed to `registerComponent()` at registration time. The `? super T` bound allows registration with a supertype class for polymorphic component access.

### Index

```java
public int getIndex()
```

Returns the numeric index assigned to this component type within its registry. The index is a dense, auto-incrementing integer starting from zero. It is used internally for archetype bitmask operations and array-indexed component storage. Plugin code typically does not need this value.

## Query Interface

`ComponentType` implements `Query<ECS_TYPE>`, which means a `ComponentType` can be passed directly anywhere a `Query` is expected. This is a key design insight: a single component type IS a query.

```java
public boolean test(@Nonnull Archetype<ECS_TYPE> archetype)
```

Returns `true` if the given archetype contains this component type. Equivalent to `archetype.contains(this)`. This is how the ECS system pipeline determines which archetype chunks a system should process.

```java
public boolean requiresComponentType(ComponentType<ECS_TYPE, ?> componentType)
```

Returns `true` if this query requires the given component type -- i.e., returns `this.equals(componentType)`. For a single `ComponentType` query, the only required type is itself.

### What This Means for Systems

When you register a system with a query, you are specifying which archetypes the system operates on. Because `ComponentType` implements `Query`, you can pass a component type directly as a system's query:

```java
// A system that processes all entities with a HealthComponent
systemType.getQuery()  // returns ComponentType<EntityStore, HealthComponent>
```

This system will match every archetype that contains the health component, regardless of what other components the archetype has. For more complex queries (requiring multiple components, excluding components), composite `Query` implementations are used.

## Ordering

`ComponentType` implements `Comparable<ComponentType<ECS_TYPE, ?>>`. Ordering is by `getIndex()`, which ensures a canonical ordering for archetype signatures and deterministic iteration order.

## Usage

`ComponentType` instances are typically stored as static fields or plugin instance fields:

```java
// During setup, via ComponentRegistryProxy
private ComponentType<EntityStore, HealthComponent> HEALTH_TYPE;

@Override
protected void setup() {
    ComponentRegistryProxy<EntityStore> registry = getEntityStoreRegistry();
    HEALTH_TYPE = registry.registerComponent(HealthComponent.class, HealthComponent::new);
}

// Later, during gameplay
HealthComponent health = store.getComponent(ref, HEALTH_TYPE);
if (health != null) {
    health.setCurrentHp(health.getCurrentHp() - damage);
}
```

## Related Types

- [Store](Store.md) -- uses `ComponentType` as the key for `getComponent()`, `addComponent()`, `removeComponent()`
- [Ref](Ref.md) -- entity reference passed alongside `ComponentType` for component access
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- creates `ComponentType` instances via `registerComponent()`
- [PluginBase](PluginBase.md) -- provides `getEntityStoreRegistry()` and `getChunkStoreRegistry()`
- `Component` -- base class for all ECS component data
- `ComponentRegistry` -- the underlying registry that stores all component types for a store type
- `Query` -- interface for archetype matching; `ComponentType` is the simplest implementation
- `Archetype` -- groups entities by component signature; matched against queries
- [SystemType](SystemType.md) -- the system-side counterpart to `ComponentType`; identifies system classes within a registry
- `ISystem` -- ECS systems that declare queries to select which entities they process
