---
title: "Entity Component System"
kind: "overview"
package: "com.hypixel.hytale.component"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "ecs"
  - "overview"
  - "components"
  - "archetype"
---

> Package: `com.hypixel.hytale.component`

Hytale uses an archetype-based Entity Component System for game entity and chunk data management. The ECS is generic over an `ECS_TYPE` parameter — the two concrete store types are:

- **`EntityStore`** — For game entities (players, NPCs, mobs, items, projectiles)
- **`ChunkStore`** — For chunk-level data

## Core Concepts

### Components

Components are data classes that implement `Component<ECS_TYPE>`. They hold per-entity data and are stored in archetype chunks for cache-friendly iteration.

### Archetypes

An `Archetype` is an immutable set of `ComponentType`s that defines an entity's component composition. Entities with the same archetype are stored together in the same `ArchetypeChunk`. Adding or removing a component changes the entity's archetype and may move it to a different chunk.

### Stores

A `Store<ECS_TYPE>` is the main entity container. It manages entity storage in archetype chunks, system registration, ticking, event dispatch, and command buffer pooling. Each `World` has its own `EntityStore` and `ChunkStore`.

### Refs

A `Ref<ECS_TYPE>` is a typed pointer to an entity within a `Store`. Contains a volatile index that can be invalidated when the entity is removed. Always check `isValid()` before use.

### Holders

A `Holder<ECS_TYPE>` is an entity data container — a blueprint holding an `Archetype` and array of `Component`s. Used for entity transfer between stores, serialization, and spawning.

## Plugin Registration

```java
public class MyPlugin extends PluginBase {
    private static ComponentType<EntityStore, HealthComponent> HEALTH_TYPE;

    @Override
    protected void setup() {
        // Register a serializable component
        HEALTH_TYPE = getEntityStoreRegistry().registerComponent(
            HealthComponent.class, "myplugin:health", HealthComponent.CODEC);

        // Register a ticking system
        getEntityStoreRegistry().registerSystem(new HealthRegenSystem());

        // Register an entity event handler
        getEntityStoreRegistry().registerSystem(new OnDamageSystem());
    }
}

// Ticking system example
public class HealthRegenSystem extends EntityTickingSystem<EntityStore> {
    @Override
    public Query<EntityStore> getQuery() {
        return MyPlugin.HEALTH_TYPE;
    }

    @Override
    public void tick(float dt, int index, ArchetypeChunk<EntityStore> chunk,
                     Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer) {
        HealthComponent health = chunk.getComponent(index, MyPlugin.HEALTH_TYPE);
        health.regenerate(dt);
    }
}
```

## Registration API

`PluginBase.getEntityStoreRegistry()` returns a `ComponentRegistryProxy<EntityStore>` with these capabilities:

| Method | Description |
|--------|-------------|
| `registerComponent(Class, String id, BuilderCodec)` | Register serializable component |
| `registerComponent(Class, Supplier)` | Register transient component |
| `registerResource(Class, String id, BuilderCodec)` | Register serializable resource |
| `registerResource(Class, Supplier)` | Register transient resource |
| `registerSystem(ISystem)` | Register a system (ticking, event, lifecycle) |
| `registerEntityEventType(Class)` | Register custom entity event type |
| `registerWorldEventType(Class)` | Register custom world event type |
| `registerSystemType(Class)` | Register system type |
| `registerSystemGroup()` | Register system group |

All registrations are automatically unregistered when the plugin shuts down.

## Component Access

Components are accessed through `Store<ECS_TYPE>` (which implements `ComponentAccessor<ECS_TYPE>`):

| Method | Description |
|--------|-------------|
| `getComponent(Ref, ComponentType) → T` | Get component data for an entity |
| `addComponent(Ref, ComponentType, Component)` | Add component to entity |
| `removeComponent(Ref, ComponentType)` | Remove component from entity |
| `addEntity(Holder, AddReason) → Ref` | Add entity to store |
| `removeEntity(Ref, Holder, RemoveReason) → Holder` | Remove entity |
| `getResource(ResourceType) → Resource` | Get store-level resource |
| `invoke(Ref, EcsEvent)` | Dispatch entity-level ECS event |
| `invoke(EcsEvent)` | Dispatch store-level ECS event |

## Resources

Resources implement `Resource<ECS_TYPE>` and are singleton-like per-store data (not per-entity). Used for shared state like spatial indices.

## Command Buffers

Systems cannot directly mutate the store during iteration. Instead, they enqueue mutations into a `CommandBuffer` which is applied after the system finishes:

```java
// Inside a system's tick() or handle() method:
commandBuffer.addEntity(holder, AddReason.SPAWNED);
commandBuffer.removeEntity(ref, RemoveReason.DESTROYED);
commandBuffer.addComponent(ref, componentType, component);
commandBuffer.removeComponent(ref, componentType);
```

## System Types

See [Systems](../systems/index.md) for the full system type hierarchy.

## Related

- **[Systems Overview](../systems/index.md)** — Ticking, event, lifecycle system types
- **[Store](../classes/Store.md)** — Main entity container
- **[Ref](../classes/Ref.md)** — Entity reference
- **[ComponentType](../classes/ComponentType.md)** — Type-safe component handle
- **[ComponentRegistryProxy](../classes/ComponentRegistryProxy.md)** — Plugin registration API
- **[Events](../events/index.md)** — ECS event dispatch
