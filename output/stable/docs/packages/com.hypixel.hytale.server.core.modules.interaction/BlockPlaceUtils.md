---
title: "BlockPlaceUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.BlockPlaceUtils"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "block"
  - "placement"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

```java
public class BlockPlaceUtils
```

Utility class implementing block placement logic. Handles item consumption, event dispatching (`PlaceBlockEvent`), environment restrictions, prefab placement, filler block propagation, block state initialization, physics marking, connected block updates, and failure recovery (returning items to inventory).

## Static Methods

```java
public static void placeBlock(@Nonnull Ref<EntityStore> ref, @Nonnull ItemStack itemStack, @Nullable String blockTypeKey, @Nonnull ItemContainer itemContainer, @Nonnull Vector3i placementNormal, @Nonnull Vector3i blockPosition, @Nonnull BlockRotation blockRotation, @Nullable Inventory inventory, byte activeSlot, boolean removeItemInHand, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<ChunkStore> chunkStore, @Nonnull ComponentAccessor<EntityStore> entityStore)
```

Full block placement method: validates position (y 0-319), dispatches `PlaceBlockEvent`, removes item from inventory (in Adventure mode), validates block type, handles prefab lists, attempts placement, and manages success/failure outcomes.

```java
public static boolean canPlaceBlock(@Nonnull BlockType blockType, @Nonnull String placedBlockTypeKey)
```

Returns `true` if the given block type key matches the block type or any of its placement override block IDs (wall, floor, ceiling).
