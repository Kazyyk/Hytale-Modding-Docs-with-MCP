# FarmingSystems.OnCoopAdded

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: RefSystem<ChunkStore>

public static class FarmingSystems.OnCoopAdded extends RefSystem<ChunkStore>

Listens for CoopBlock entity additions on `ChunkStore`. On add, schedules the next coop tick. On removal (unless unloading), calls `handleBlockBroken` to spawn residents and drop produce.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdded(...)
- void` / `Query onEntityRemove(...)
- void` / `Query getQuery(...)

Also in this package: CoopResidentEntitySystem, CoopResidentTicking, FarmingPlugin, FarmingSystems, FarmingUtil, MigrateFarming, OnFarmBlockAdded, OnSoilAdded, Ticking

Complete API:
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
private final ComponentType<ChunkStore,CoopBlock> coopBlockComponentType
private final Query<ChunkStore> query
