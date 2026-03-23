# FarmingSystems.Ticking

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: EntityTickingSystem<ChunkStore>

public static class FarmingSystems.Ticking extends EntityTickingSystem<ChunkStore>

Main tick system for the farming module operating on `ChunkStore`. Iterates over ticking blocks in each section and dispatches to `FarmingUtil.tickFarming` for farming blocks, `tickSoil` for tilled soil, and `tickCoop` for coop blocks. Soil ticking handles decay timers, watering state, and block type transitions. Coop ticking handles wild NPC capture, resident spawning/despawning based on roam time, produce generation, and interaction state updates.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query tick(...)
- void` / `Query getQuery(...)

Also in this package: CoopResidentEntitySystem, CoopResidentTicking, FarmingPlugin, FarmingSystems, FarmingUtil, MigrateFarming, OnCoopAdded, OnFarmBlockAdded, OnSoilAdded

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  private static void tickSoil(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> blockRef, TilledSoilBlock soilBlock)
  private static void tickCoop(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> blockRef, CoopBlock coopBlock)
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,BlockSection> blockSectionComponentType
private final ComponentType<ChunkStore,ChunkSection> chunkSectionComponentType
private final ComponentType<ChunkStore,FarmingBlock> farmingBlockComponentType
private final ComponentType<ChunkStore,TilledSoilBlock> tilledSoilBlockComponentType
private final ComponentType<ChunkStore,CoopBlock> coopBlockComponentType
private final Query<ChunkStore> query
