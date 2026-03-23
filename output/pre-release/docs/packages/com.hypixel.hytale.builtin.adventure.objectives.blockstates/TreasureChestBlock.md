---
title: "TreasureChestBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.blockstates"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.blockstates.TreasureChestBlock"
api_surface: false
extends: null
implements: ["Component<ChunkStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "component"
  - "treasure"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.blockstates`

```java
public class TreasureChestBlock implements Component<ChunkStore>
```

ECS component stored on chunk-store block entities that tracks treasure chest state for the objective system. Each instance records which objective and chest UUID the block belongs to, and whether the chest has been opened. Opening a chest dispatches a `TreasureChestOpeningEvent` through the global event bus.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<TreasureChestBlock>` | `CODEC` |
| `protected` | `UUID` | `objectiveUUID` |
| `protected` | `UUID` | `chestUUID` |
| `protected` | `boolean` | `opened` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TreasureChestBlock()` |
| `public` | `TreasureChestBlock(UUID objectiveUUID, UUID chestUUID, boolean opened)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, TreasureChestBlock>` | `getComponentType()` |
| `public` | `boolean` | `canOpen(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `boolean` | `canDestroy(@Nonnull Ref<EntityStore> playerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `onOpen(@Nonnull Ref<EntityStore> ref, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `setOpened(boolean opened)` |
| `public` | `boolean` | `isOpened()` |
| `public` | `void` | `setObjectiveData(UUID objectiveUUID, UUID chestUUID)` |
| `@Nullable @Override public` | `Component<ChunkStore>` | `clone()` |

## Behavior

- `canOpen` returns `true` if the chest is already opened or if the player's UUID is in the objective's active player set. Otherwise the player cannot open it.
- `canDestroy` returns `true` only if the chest has already been opened.
- `onOpen` dispatches a `TreasureChestOpeningEvent` (scoped to the world name) when there are listeners registered and the chest is associated with an objective, then marks the chest as opened.

## Related Types

- `ObjectivePlugin` -- registers this component type under the key `"TreasureChest"`
- [DestroyTreasureConditionInteraction](../com.hypixel.hytale.builtin.adventure.objectives.interactions/DestroyTreasureConditionInteraction.md) -- checks `canDestroy`
- [OpenTreasureContainerInteraction](../com.hypixel.hytale.builtin.adventure.objectives.interactions/OpenTreasureContainerInteraction.md) -- checks `canOpen` and calls `onOpen`
