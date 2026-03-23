# FarmingUtil

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming

public class FarmingUtil

Utility class containing the core farming tick logic and harvest methods. Called by FarmingSystems.Ticking and FarmingSystems.OnFarmBlockAdded to advance crop growth, and by HarvestCropInteraction to process harvests.

## Constants

- private static final int MAX_SECONDS_BETWEEN_TICKS
- private static final int BETWEEN_RANDOM

## Methods

- public static void tickFarming(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull BlockChunk blockChunk, @Nonnull BlockSection blockSection, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, @Nonnull FarmingBlock farmingBlock, int x, int y, int z, boolean initialTick)
- public static boolean harvest(@Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull BlockType blockType, int rotationIndex, @Nonnull Vector3i blockPosition)
- @Nullable public static CapturedNPCMetadata generateCapturedNPCMetadata(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> entityRef, String npcNameKey)
- protected static boolean harvest0(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull BlockType blockType, int rotationIndex, @Nonnull Vector3i blockPosition)
- protected static void giveDrops(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Vector3d origin, @Nonnull BlockType blockType)

## Behavior

`tickFarming` advances a farming block through its configured stage pipeline. For each stage, it computes the duration (randomized from the stage's `Rangef`), applies all growth modifiers (fertilizer, light, water) as multipliers, and either advances to the next stage or schedules a future tick. When a stage completes, `stages[nextStage].apply(...)` is called to apply the visual/structural change (block type swap, prefab placement, spread, etc.). The tick caps at `MAX_SECONDS_BETWEEN_TICKS + BETWEEN_RANDOM` seconds of real-time game ticks to prevent unbounded catch-up.

`harvest` delegates to `harvest0`, which drops items via `BlockHarvestUtils.getDrops` and either transitions to the `stageSetAfterHarvest` stage set or breaks the block entirely.

Also in this package: CoopResidentEntitySystem, CoopResidentTicking, FarmingPlugin, FarmingSystems, MigrateFarming, OnCoopAdded, OnFarmBlockAdded, OnSoilAdded, Ticking

Complete API:
  public static void tickFarming(CommandBuffer<ChunkStore> commandBuffer, BlockChunk blockChunk, BlockSection blockSection, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, FarmingBlock farmingBlock, int x, int y, int z, boolean initialTick)
  public static boolean harvest(World world, ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, BlockType blockType, int rotationIndex, Vector3i blockPosition)
  public static CapturedNPCMetadata generateCapturedNPCMetadata(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> entityRef, String npcNameKey)
  protected static boolean harvest0(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, BlockType blockType, int rotationIndex, Vector3i blockPosition)
  protected static void giveDrops(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Vector3d origin, BlockType blockType, HarvestingDropType harvestingDropType)

Fields:
private static final int MAX_SECONDS_BETWEEN_TICKS
private static final int BETWEEN_RANDOM
