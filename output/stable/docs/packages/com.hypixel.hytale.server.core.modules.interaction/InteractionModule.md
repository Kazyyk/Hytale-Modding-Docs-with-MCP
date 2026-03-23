---
title: "InteractionModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.InteractionModule"
api_surface: true
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "module"
  - "plugin"
  - "combat"
  - "item"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

```java
public class InteractionModule extends JavaPlugin
```

Server plugin responsible for the item interaction system. Registers all interaction types (place block, break block, damage entity, launch projectile, charge, chain, etc.), the root interaction asset store, selector types, knockback types, and the ECS systems that drive interaction execution. Also handles mouse input processing and dispatches `PlayerMouseButtonEvent`/`PlayerMouseMotionEvent`.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `MANIFEST` | `PluginManifest` | Plugin manifest declaring dependency on `EntityModule`. |
| `INTERACTION_TYPE_CODEC` | `EnumCodec<InteractionType>` | Codec for the `InteractionType` enum. |
| `INTERACTION_TYPE_SET_CODEC` | `SetCodec<InteractionType, EnumSet<InteractionType>>` | Codec for sets of `InteractionType`. |

## Static Methods

```java
@Nonnull
public static InteractionModule get()
```

Returns the singleton instance.

## Instance Methods

```java
public void doMouseInteraction(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull MouseInteraction packet, @Nonnull Player playerComponent, @Nonnull PlayerRef playerRefComponent)
```

Processes a mouse interaction packet from a client. Validates the active hotbar slot, resolves the target block/entity, dispatches mouse events, and updates the camera manager state.

```java
@Nonnull
public ComponentType<EntityStore, ChainingInteraction.Data> getChainingDataComponent()
```

Returns the ECS component type for chaining interaction runtime data.

```java
@Nonnull
public ComponentType<EntityStore, Interactions> getInteractionsComponentType()
```

Returns the ECS component type for entity interaction bindings.

```java
@Nonnull
public ComponentType<EntityStore, InteractionManager> getInteractionManagerComponent()
```

Returns the ECS component type for the interaction manager.

```java
@Nonnull
public ComponentType<ChunkStore, PlacedByInteractionComponent> getPlacedByComponentType()
```

Returns the ECS component type tracking which player placed a block.

```java
public ResourceType<ChunkStore, BlockCounter> getBlockCounterResourceType()
```

Returns the resource type for per-chunk block placement counters.

```java
public ComponentType<ChunkStore, TrackedPlacement> getTrackedPlacementComponentType()
```

Returns the ECS component type for tracked block placements.

## Registered Interaction Types

The `setup()` method registers over 50 interaction types with the `Interaction.CODEC` polymorphic codec, including: `Simple`, `PlaceBlock`, `BreakBlock`, `UseBlock`, `DamageEntity`, `LaunchProjectile`, `Charging`, `Chaining`, `Condition`, `Parallel`, `Serial`, `SpawnPrefab`, `Door`, `OpenContainer`, `EquipItem`, `ApplyEffect`, `ApplyForce`, and many more.

## Registered Selector Types

`Horizontal`, `Stab`, `AOECircle`, `AOECylinder`, `Raycast`.

## Registered Knockback Types

`Directional`, `Point`, `Force`.
