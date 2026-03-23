---
title: "SpawnMinecartInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.interactions"
fqcn: "com.hypixel.hytale.builtin.mounts.interactions.SpawnMinecartInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.interactions`

```java
public class SpawnMinecartInteraction extends SimpleBlockInteraction
```

A block interaction that spawns a minecart entity at the target block. Registered on `Interaction.CODEC` with the key `"SpawnMinecart"` by [MountPlugin](MountPlugin.md).

## Codec

```java
public static final BuilderCodec<SpawnMinecartInteraction> CODEC
```

Extends `SimpleBlockInteraction.CODEC` with documentation `"Spawns a minecart at the target block"` and two additional fields:
- `Model` (`String`) -- the model asset ID for the minecart entity. Validated via `ModelAsset.VALIDATOR_CACHE`.
- `CartInteractions` (`Map<InteractionType, String>`) -- map of interaction types to interaction asset IDs for the spawned cart. Validated via `RootInteraction.VALIDATOR_CACHE`.

## Behavior

```java
@Override
protected void interactWithBlock(
    @Nonnull World world,
    @Nonnull CommandBuffer<EntityStore> commandBuffer,
    @Nonnull InteractionType type,
    @Nonnull InteractionContext context,
    @Nullable ItemStack itemInHand,
    @Nonnull Vector3i targetBlock,
    @Nonnull CooldownHandler cooldownHandler
)
```

1. Creates a new entity holder.
2. Computes the spawn position at the center of the target block.
3. Uses the player's head rotation for initial yaw.
4. If the target block has a `RailConfig`, aligns the minecart to the rail using the `alignToRail` method (snaps position and rotation to the closest rail segment).
5. If no rail config, positions the minecart on top of the block's bounding box.
6. Adds `TransformComponent`, `UUIDComponent`, `ModelComponent`, `PersistentModel`, `BoundingBox`, `Interactable`, `Interactions`, and [MinecartComponent](MinecartComponent.md) to the holder.
7. Spawns the entity via `commandBuffer.addEntity()`.

### Rail Alignment

The private `alignToRail` method iterates consecutive rail point pairs, projects the target position onto each line segment, finds the closest point within 0.8 distance, and aligns position and rotation to match the rail direction.

### simulateInteractWithBlock

No-op.

## Related Types

- [MinecartComponent](MinecartComponent.md) -- the component added to spawned minecarts
- [MountSystems.EnsureMinecartComponents](MountSystems.EnsureMinecartComponents.md) -- ensures supporting components post-spawn
- [MountPlugin](MountPlugin.md) -- registers this interaction
