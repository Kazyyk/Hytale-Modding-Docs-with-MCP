# BlockPlaceUtils

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction

public class BlockPlaceUtils

Utility class implementing block placement logic. Handles item consumption, event dispatching (`PlaceBlockEvent`), environment restrictions, prefab placement, filler block propagation, block state initialization, physics marking, connected block updates, and failure recovery (returning items to inventory).

## Static Methods


public static void placeBlock(@Nonnull Ref<EntityStore> ref, @Nonnull ItemStack itemStack, @Nullable String blockTypeKey, @Nonnull ItemContainer itemContainer, @Nonnull Vector3i placementNormal, @Nonnull Vector3i blockPosition, @Nonnull BlockRotation blockRotation, @Nullable Inventory inventory, byte activeSlot, boolean removeItemInHand, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<ChunkStore> chunkStore, @Nonnull ComponentAccessor<EntityStore> entityStore)

Full block placement method: validates position (y 0-319), dispatches `PlaceBlockEvent`, removes item from inventory (in Adventure mode), validates block type, handles prefab lists, attempts placement, and manages success/failure outcomes.


public static boolean canPlaceBlock(@Nonnull BlockType blockType, @Nonnull String placedBlockTypeKey)

Returns `true` if the given block type key matches the block type or any of its placement override block IDs (wall, floor, ceiling).

Also in this package: BlockHarvestUtils, BlockInteractionUtils, IInteractionSimulationHandler, InteractionModule, InteractionSimulationHandler, Interactions

Complete API:
  public static void placeBlock(Ref<EntityStore> ref, ItemStack itemStack, String blockTypeKey, ItemContainer itemContainer, Vector3i placementNormal, Vector3i blockPosition, BlockRotation blockRotation, Inventory inventory, byte activeSlot, boolean removeItemInHand, Ref<ChunkStore> chunkReference, ComponentAccessor<ChunkStore> chunkStore, ComponentAccessor<EntityStore> entityStore, boolean quickReplace)
  private static void onPlaceBlockFailure(ItemStack itemStack, Inventory inventory, byte activeSlot, Player playerComponent, BlockSection blockSection, Vector3i blockPosition)
  private static void onPlaceBlockSuccess(ItemStack itemStack, WorldChunk worldChunkComponent, Vector3i blockPosition, BlockType blockTypeAsset, RotationTuple targetRotation)
  private static boolean validateBlockToPlace(String blockTypeKey, PlayerRef playerRefComponent)
  private static boolean validateAndPlacePrefab(Vector3i blockPosition, String prefabListAssetId, PlayerRef playerRefComponent, ComponentAccessor<EntityStore> componentAccessor)
  private static boolean tryPlaceBlock(Ref<EntityStore> ref, Vector3i placementNormal, Vector3i blockPosition, String blockTypeKey, RotationTuple rotation, WorldChunk worldChunkComponent, BlockChunk blockChunkComponent, Ref<ChunkStore> chunkReference, ComponentAccessor<ChunkStore> chunkStore, ComponentAccessor<EntityStore> entityStore, boolean quickReplace)
  private static void breakAndDropReplacedBlock(Vector3i blockPosition, WorldChunk worldChunkComponent, Ref<ChunkStore> chunkReference, Ref<EntityStore> ref, ComponentAccessor<ChunkStore> chunkStore, ComponentAccessor<EntityStore> entityStore)
  public static boolean canPlaceBlock(BlockType blockType, String placedBlockTypeKey)

Fields:
private static final HytaleLogger LOGGER
private static final Message MESSAGE_MODULES_INTERACTION_FAILED_ADD_BACK_AFTER_FAILED_PLACE
private static final Message MESSAGE_MODULES_INTERACTION_FAILED_CHECK_BLOCK
private static final Message MESSAGE_MODULES_INTERACTION_FAILED_CHECK_EMPTY
private static final Message MESSAGE_MODULES_INTERACTION_FAILED_CHECK_UNKNOWN
private static final Message MESSAGE_MODULES_INTERACTION_FAILED_CHECK
private static final Message MESSAGE_MODULES_INTERACTION_BUILD_FORBIDDEN
