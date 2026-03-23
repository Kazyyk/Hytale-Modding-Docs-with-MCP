# FarmingSystems.MigrateFarming

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: BlockModule.MigrationSystem

public static class FarmingSystems.MigrateFarming extends BlockModule.MigrationSystem

Deprecated migration system (marked `@Deprecated(forRemoval = true)`). Converts legacy FarmingBlockState data to the current FarmingBlock component format by transferring growth progress, stage set, and spread rate.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdd(...)
- void` / `Query onEntityRemoved(...)
- void` / `Query getQuery(...)

Also in this package: CoopResidentEntitySystem, CoopResidentTicking, FarmingPlugin, FarmingSystems, FarmingUtil, OnCoopAdded, OnFarmBlockAdded, OnSoilAdded, Ticking

Complete API:
  public void onEntityAdd(Holder<ChunkStore> holder, AddReason reason, Store<ChunkStore> store)
  public void onEntityRemoved(Holder<ChunkStore> holder, RemoveReason reason, Store<ChunkStore> store)
  public Query<ChunkStore> getQuery()
