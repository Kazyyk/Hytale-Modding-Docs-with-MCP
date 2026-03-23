# FarmingSystems

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming

public class FarmingSystems

Container class for all farming-related ECS systems. Contains static inner classes that handle soil lifecycle, farm block initialization, crop growth ticking, coop management, and data migration. Registered as systems by FarmingPlugin during setup.

## Inner Classes

- CoopResidentEntitySystem | class | Handles coop resident entity add/remove events on `EntityStore`.
- CoopResidentTicking | class | Ticks coop residents, removing those marked for despawn.
- MigrateFarming | class | Deprecated migration system converting old FarmingBlockState to FarmingBlock.
- OnCoopAdded | class | Schedules coop block ticks when a coop block entity is added.
- OnFarmBlockAdded | class | Initializes farming state when a FarmingBlock component is added.
- OnSoilAdded | class | Schedules soil decay ticks when a TilledSoilBlock is added.
- Ticking | class | Main block-tick system for farming, soil, and coop blocks in `ChunkStore`.

## Private Methods

- private static boolean hasCropAbove(@Nonnull BlockChunk blockChunk, int x, int y, int z)
- private static boolean updateSoilDecayTime(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull TilledSoilBlock soilBlock, @Nullable BlockType blockType)

Also in this package: CoopResidentEntitySystem, CoopResidentTicking, FarmingPlugin, FarmingUtil, MigrateFarming, OnCoopAdded, OnFarmBlockAdded, OnSoilAdded, Ticking

Complete API:
  private static boolean hasCropAbove(BlockChunk blockChunk, int x, int y, int z)
  private static boolean updateSoilDecayTime(CommandBuffer<ChunkStore> commandBuffer, TilledSoilBlock soilBlock, BlockType blockType)
