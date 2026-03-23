# FarmingSystems.OnFarmBlockAdded

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: RefSystem<ChunkStore>

public static class FarmingSystems.OnFarmBlockAdded extends RefSystem<ChunkStore>

Initializes newly added FarmingBlock components. Sets the starting stage set, determines the initial growth progress by matching the current block type against stage data, applies the first stage if no match is found, and triggers the initial farming tick.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdded(...)
- void` / `Query onEntityRemove(...)
- void` / `Query getQuery(...)

Also in this package: CoopResidentEntitySystem, CoopResidentTicking, FarmingPlugin, FarmingSystems, FarmingUtil, MigrateFarming, OnCoopAdded, OnSoilAdded, Ticking

Complete API:
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
private final ComponentType<ChunkStore,FarmingBlock> farmingBlockComponentType
private final Query<ChunkStore> query
