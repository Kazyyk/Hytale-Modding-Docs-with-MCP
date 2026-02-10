---
title: ComponentRegistryProxy
kind: class
package: com.hypixel.hytale.component
api_surface: true
extends: ~
implements:
  - IComponentRegistry<ECS_TYPE>
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - ecs
  - registry
  - component
  - plugin-scoped
  - system
  - resource
  - event
---

**Package:** `com.hypixel.hytale.component`

```java
public class ComponentRegistryProxy<ECS_TYPE> implements IComponentRegistry<ECS_TYPE>
```

A plugin-scoped proxy for registering ECS components, resources, systems, and events. Obtained via [`PluginBase.getEntityStoreRegistry()`](PluginBase.md) (for entity-scoped registrations) or [`PluginBase.getChunkStoreRegistry()`](PluginBase.md) (for chunk-scoped registrations).

All registrations made through this proxy are tracked with unregister callbacks that fire when the plugin shuts down. This ensures that plugins cannot leak ECS registrations into the global registry after they are unloaded. However, during full server shutdown, the cleanup is skipped -- the internal `if (!shutdown)` check bypasses unregistration when the entire server is tearing down, since the registries are about to be destroyed anyway.

## Constructor

```java
public ComponentRegistryProxy(List<BooleanConsumer> registrations, ComponentRegistry<ECS_TYPE> registry)
```

Constructed internally by `PluginBase`. The `registrations` list accumulates unregister callbacks. The `registry` is the underlying `ComponentRegistry` (either `EntityStore.REGISTRY` or `ChunkStore.REGISTRY`).

## Registration API

### Component Registration

```java
@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
```

Registers a component type with a factory supplier. The `tClass` identifies the component class. The `supplier` creates default instances when a component is added to an entity. Returns a [ComponentType](ComponentType.md) handle used for all subsequent component access.

```java
@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
```

Registers a component type with a string identifier and codec for serialization. The `id` is used for JSON-based configuration and persistence. The `codec` handles reading and writing the component from/to JSON.

### Resource Registration

```java
@Nonnull
public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
```

Registers a store-level resource type with a factory supplier. Resources are singleton data attached to the store itself, not to individual entities. Examples include spatial indices, global counters, and shared lookup tables.

```java
@Nonnull
public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
```

Registers a store-level resource type with a string identifier and codec for serialization.

### Spatial Resource Registration

```java
@Nonnull
public ResourceType<ECS_TYPE, SpatialResource<Ref<ECS_TYPE>, ECS_TYPE>> registerSpatialResource(@Nonnull Supplier<SpatialStructure<Ref<ECS_TYPE>>> supplier)
```

Registers a spatial resource -- a specialized resource that provides spatial indexing over entity refs. The `supplier` creates the underlying `SpatialStructure` (e.g., a spatial hash grid or octree). This enables efficient spatial queries like "find all entities within radius R of position P."

### System Registration

```java
@Nonnull
public <T extends ISystem<ECS_TYPE>> SystemType<ECS_TYPE, T> registerSystemType(@Nonnull Class<? super T> systemTypeClass)
```

Registers a system type. Systems are the "S" in ECS -- they contain the logic that operates on entities matching a query. The returned `SystemType` handle is used to reference the system in scheduling and dependency declarations.

```java
public void registerSystem(@Nonnull ISystem<ECS_TYPE> system)
```

Registers a system instance. The system must have been created from a `SystemType` registered via `registerSystemType()`. This adds the system to the store's tick pipeline.

### System Group Registration

```java
@Nonnull
public SystemGroup<ECS_TYPE> registerSystemGroup()
```

Registers a system group. Groups allow multiple systems to be ordered relative to each other as a unit. Systems within a group execute in registration order; groups themselves can be ordered relative to other groups.

### Event Type Registration

```java
@Nonnull
public <T extends EcsEvent> EntityEventType<ECS_TYPE, T> registerEntityEventType(@Nonnull Class<? super T> eventTypeClass)
```

Registers an entity-level ECS event type. Entity events target a specific entity (dispatched via `Store.invoke(ref, event)`). Returns an `EntityEventType` handle.

```java
@Nonnull
public <T extends EcsEvent> WorldEventType<ECS_TYPE, T> registerWorldEventType(@Nonnull Class<? super T> eventTypeClass)
```

Registers a store-level (world-level) ECS event type. World events are not targeted at a specific entity (dispatched via `Store.invoke(event)`). Returns a `WorldEventType` handle.

## Registration Summary

| Method | Registers | Returns |
|---|---|---|
| `registerComponent(Class, Supplier)` | Component type with factory | `ComponentType<ECS_TYPE, T>` |
| `registerComponent(Class, String, BuilderCodec)` | Component type with codec | `ComponentType<ECS_TYPE, T>` |
| `registerResource(Class, Supplier)` | Store-level resource with factory | `ResourceType<ECS_TYPE, T>` |
| `registerResource(Class, String, BuilderCodec)` | Store-level resource with codec | `ResourceType<ECS_TYPE, T>` |
| `registerSpatialResource(Supplier)` | Spatial index resource | `ResourceType<ECS_TYPE, SpatialResource<...>>` |
| `registerSystemType(Class)` | System type declaration | `SystemType<ECS_TYPE, T>` |
| `registerSystem(ISystem)` | System instance into tick pipeline | `void` |
| `registerSystemGroup()` | System execution group | `SystemGroup<ECS_TYPE>` |
| `registerEntityEventType(Class)` | Entity-scoped ECS event type | `EntityEventType<ECS_TYPE, T>` |
| `registerWorldEventType(Class)` | Store-scoped ECS event type | `WorldEventType<ECS_TYPE, T>` |

## Plugin Shutdown Behavior

When a plugin shuts down (but the server is still running), the proxy fires all accumulated unregister callbacks in reverse order. This removes the plugin's components, resources, systems, and event types from the underlying `ComponentRegistry`.

During full server shutdown, the `if (!shutdown)` check in the callback logic causes cleanup to be skipped entirely. This is an optimization -- the registry and all stores are about to be destroyed, so individual unregistration is unnecessary work.

## Example

```java
public class MyPlugin extends PluginBase {

    private ComponentType<EntityStore, HealthComponent> HEALTH_TYPE;
    private ComponentType<EntityStore, PositionComponent> POSITION_TYPE;
    private ResourceType<EntityStore, GameTimeResource> GAME_TIME;

    public MyPlugin(PluginInit init) {
        super(init);
    }

    @Override
    public PluginType getType() {
        return PluginType.PLUGIN;
    }

    @Override
    protected void setup() {
        ComponentRegistryProxy<EntityStore> ecs = getEntityStoreRegistry();

        // Register components
        HEALTH_TYPE = ecs.registerComponent(HealthComponent.class, HealthComponent::new);
        POSITION_TYPE = ecs.registerComponent(PositionComponent.class, PositionComponent::new);

        // Register a store-level resource
        GAME_TIME = ecs.registerResource(GameTimeResource.class, GameTimeResource::new);

        // Register a system type and instance
        SystemType<EntityStore, HealthRegenSystem> healthRegenType =
            ecs.registerSystemType(HealthRegenSystem.class);
        ecs.registerSystem(new HealthRegenSystem(healthRegenType, HEALTH_TYPE));

        // Register an entity event type
        EntityEventType<EntityStore, DamageEvent> damageEventType =
            ecs.registerEntityEventType(DamageEvent.class);
    }
}
```

## Related Types

- [PluginBase](PluginBase.md) -- provides `getEntityStoreRegistry()` and `getChunkStoreRegistry()`
- [Store](Store.md) -- the entity container that hosts registered components, resources, and systems
- [ComponentType](ComponentType.md) -- returned by `registerComponent()`, used as key for component access
- [Ref](Ref.md) -- entity reference used with `Store.getComponent(ref, type)`
- `IComponentRegistry` -- interface defining the registration contract
- `ComponentRegistry` -- the underlying global registry that this proxy delegates to
- `Component` -- base class for all ECS component data
- `Resource` -- base class for store-level singleton data
- `ResourceType` -- type-safe key for resource access
- `SpatialResource` -- specialized resource for spatial indexing
- `ISystem` -- base interface for ECS systems
- `SystemType` -- type-safe handle for a registered system
- `SystemGroup` -- execution ordering group for systems
- `EcsEvent` -- base class for ECS events
- `EntityEventType` -- handle for entity-scoped event types
- `WorldEventType` -- handle for store-scoped event types
- `BuilderCodec` -- codec for JSON serialization of components and resources
- `EntityStore` -- concrete store type for game entities
- `ChunkStore` -- concrete store type for chunk-level data
