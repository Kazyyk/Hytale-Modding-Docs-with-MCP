---
title: "ComponentType"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ComponentType"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Comparable<ComponentType<ECS_TYPE, ?>>"
  - "Query<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class ComponentType<ECS_TYPE, T extends Component<ECS_TYPE>> implements Comparable<ComponentType<ECS_TYPE, ?>>, Query<ECS_TYPE>
```

A typed handle representing a registered component in the ECS. Obtained from [IComponentRegistry.registerComponent()](IComponentRegistry.md). ComponentType serves dual purpose: it is used to access components on entities, and it implements `Query` so it can be used directly as an archetype filter (matching any entity that has this component).

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the concrete component class

## Fields

```java
@Nonnull
public static final ComponentType[] EMPTY_ARRAY = new ComponentType[0];
```

## Methods

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

Returns the owning registry.

```java
@Nonnull
public Class<? super T> getTypeClass()
```

Returns the registered class for this component type.

```java
public int getIndex()
```

Returns the internal index used for array-based lookups in [ArchetypeChunk](ArchetypeChunk.md).

```java
public boolean test(@Nonnull Archetype<ECS_TYPE> archetype)
```

Query implementation: returns `true` if the archetype contains this component type.

```java
public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)
```

Throws `IllegalArgumentException` if this type belongs to a different registry.

```java
public void validate()
```

Throws `IllegalStateException` if this type has been invalidated (unregistered).

## Related Types

- [Component](Component.md) -- the interface all components implement
- [ComponentRegistration](ComponentRegistration.md) -- the full registration record
- [Archetype](Archetype.md) -- a set of ComponentTypes defining an entity shape
- [Store](Store.md) -- uses ComponentType for all component access
