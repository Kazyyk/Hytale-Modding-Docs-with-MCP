# MigrateCrafting

Type: class | Package: com.hypixel.hytale.builtin.crafting | Extends: BlockModule.MigrationSystem

public static class MigrateCrafting extends BlockModule.MigrationSystem

Block migration system that converts legacy `crafting` and `processingBench` unknown components into their typed `BenchBlock` and `ProcessingBenchBlock` component equivalents.

Also in this package: BenchRecipeRegistry, CraftingPlugin, PlayerAddedSystem

Complete API:
  public void onEntityAdd(Holder<ChunkStore> holder, AddReason reason, Store<ChunkStore> store)
  public void onEntityRemoved(Holder<ChunkStore> holder, RemoveReason reason, Store<ChunkStore> store)
  public Query<ChunkStore> getQuery()
