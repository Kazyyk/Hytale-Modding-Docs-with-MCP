# BlockPlaceUtils

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction

public class BlockPlaceUtils

Utility class implementing block placement logic. Handles item consumption, event dispatching (`PlaceBlockEvent`), environment restrictions, prefab placement, filler block propagation, block state initialization, physics marking, connected block updates, and failure recovery (returning items to inventory).

## Static Methods


public static void placeBlock(@Nonnull Ref<EntityStore> ref, @Nonnull ItemStack itemStack, @Nullable String blockTypeKey, @Nonnull ItemContainer itemContainer, @Nonnull Vector3i placementNormal, @Nonnull Vector3i blockPosition, @Nonnull BlockRotation blockRotation, @Nullable Inventory inventory, byte activeSlot, boolean removeItemInHand, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<ChunkStore> chunkStore, @Nonnull ComponentAccessor<EntityStore> entityStore)

Full block placement method: validates position (y 0-319), dispatches `PlaceBlockEvent`, removes item from inventory (in Adventure mode), validates block type, handles prefab lists, attempts placement, and manages success/failure outcomes.


public static boolean canPlaceBlock(@Nonnull BlockType blockType, @Nonnull String placedBlockTypeKey)

Returns `true` if the given block type key matches the block type or any of its placement override block IDs (wall, floor, ceiling).
