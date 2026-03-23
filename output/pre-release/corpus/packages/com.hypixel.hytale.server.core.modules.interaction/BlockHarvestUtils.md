# BlockHarvestUtils

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction

public class BlockHarvestUtils

Utility class implementing the core block harvesting, breaking, and drop logic. Handles tool-quality matching, damage calculation, durability loss, block health tracking, environment restrictions, filler block propagation, sound effects, particle spawning, and item drop generation.

## Static Methods


@Nullable
public static ItemToolSpec getSpecPowerDamageBlock(@Nullable Item item, @Nullable BlockType blockType, @Nullable ItemTool tool)

Resolves the tool spec that can damage the given block type. Returns `null` if no matching spec exists or the tool quality is insufficient.


public static double calculateDurabilityUse(@Nonnull Item item, @Nullable BlockType blockType)

Calculates the durability loss for an item when damaging a block, accounting for block-type-specific durability loss overrides.


public static boolean performBlockDamage(@Nonnull Vector3i targetBlock, @Nullable ItemStack itemStack, @Nullable ItemTool tool, float damageScale, int setBlockSettings, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull ComponentAccessor<ChunkStore> chunkStore)

Applies damage to a block at the given position. May break the block if health reaches zero.


public static boolean performBlockDamage(@Nullable LivingEntity entity, @Nullable Ref<EntityStore> ref, @Nonnull Vector3i targetBlockPos, @Nullable ItemStack itemStack, @Nullable ItemTool tool, @Nullable String toolId, boolean matchTool, float damageScale, int setBlockSettings, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<EntityStore> entityStore, @Nonnull ComponentAccessor<ChunkStore> chunkStore)

Full block damage method with entity context, tool matching, environment checks, event dispatching (`DamageBlockEvent`), sound/particle effects, and durability loss.


public static void performBlockBreak(@Nullable Ref<EntityStore> ref, @Nullable ItemStack heldItemStack, @Nonnull Vector3i targetBlock, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<EntityStore> entityStore, @Nonnull ComponentAccessor<ChunkStore> chunkStore)

Breaks a block at the given position, handling filler blocks, dispatching `BreakBlockEvent`, and spawning drops.


@Deprecated
public static void naturallyRemoveBlockByPhysics(@Nonnull Vector3i blockPosition, @Nonnull BlockType blockType, int filler, int setBlockSettings, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<EntityStore> entityStore, @Nonnull ComponentAccessor<ChunkStore> chunkStore)

Removes a block due to physics (gravity, support loss). Resolves the appropriate drop type (physics, breaking, soft, or harvest).


public static void naturallyRemoveBlock(@Nonnull Vector3i blockPosition, @Nullable BlockType blockType, int filler, int quantity, String itemId, String dropListId, int setBlockSettings, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<EntityStore> entityStore, @Nonnull ComponentAccessor<ChunkStore> chunkStore)

Core block removal method: resolves filler blocks, plays break sounds, removes the block, spawns item drops, and updates connected blocks.


public static boolean shouldPickupByInteraction(@Nullable BlockType blockType)

Returns `true` if the block type supports harvest-style pickup.


public static void performPickupByInteraction(@Nonnull Ref<EntityStore> ref, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType, int filler, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull ComponentAccessor<EntityStore> entityStore, @Nonnull ComponentAccessor<ChunkStore> chunkStore)

Performs a harvest pickup: removes the block and adds the harvest drops directly to the player's inventory.


@Nonnull
public static List<ItemStack> getDrops(@Nonnull BlockType blockType, int quantity, @Nullable String itemId, @Nullable String dropListId)

Resolves the item drops for a block break, combining explicit item IDs and drop list randomization.

Also in this package: BlockInteractionUtils, BlockPlaceUtils, IInteractionSimulationHandler, InteractionModule, InteractionSimulationHandler, Interactions

Complete API:
  public static ItemToolSpec getSpecPowerDamageBlock(Item item, BlockType blockType, ItemTool tool)
  public static double calculateDurabilityUse(Item item, BlockType blockType)
  public static boolean performBlockDamage(Vector3i targetBlock, ItemStack itemStack, ItemTool tool, float damageScale, int setBlockSettings, Ref<ChunkStore> chunkReference, CommandBuffer<EntityStore> commandBuffer, ComponentAccessor<ChunkStore> chunkStore)
  public static boolean performBlockDamage(LivingEntity entity, Ref<EntityStore> ref, Vector3i targetBlockPos, ItemStack itemStack, ItemTool tool, String toolId, boolean matchTool, float damageScale, int setBlockSettings, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  public static void performBlockBreak(Ref<EntityStore> ref, ItemStack heldItemStack, Vector3i targetBlock, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  public static void performBlockBreak(Ref<EntityStore> ref, ItemStack heldItemStack, Vector3i targetBlock, int setBlockSettings, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  public static void performBlockBreak(World world, Vector3i blockPosition, BlockType targetBlockTypeKey, ItemStack heldItemStack, int dropQuantity, String dropItemId, String dropListId, int setBlockSettings, Ref<EntityStore> ref, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  public static void naturallyRemoveBlockByPhysics(Vector3i blockPosition, BlockType blockType, int filler, int setBlockSettings, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  public static void naturallyRemoveBlock(Vector3i blockPosition, BlockType blockType, int filler, int quantity, String itemId, String dropListId, int setBlockSettings, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  public static boolean shouldPickupByInteraction(BlockType blockType)
  public static void performPickupByInteraction(Ref<EntityStore> ref, Vector3i targetBlock, BlockType blockType, int filler, Ref<ChunkStore> chunkReference, ComponentAccessor<EntityStore> entityStore, ComponentAccessor<ChunkStore> chunkStore)
  protected static void removeBlock(Vector3i blockPosition, BlockType blockType, int setBlockSettings, Ref<ChunkStore> chunkReference, ComponentAccessor<ChunkStore> chunkStore)
  public static List<ItemStack> getDrops(BlockType blockType, int quantity, String itemId, String dropListId)
