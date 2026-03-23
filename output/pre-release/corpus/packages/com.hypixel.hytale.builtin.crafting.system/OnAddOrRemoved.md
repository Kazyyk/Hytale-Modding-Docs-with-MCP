# OnAddOrRemoved

Type: class | Package: com.hypixel.hytale.builtin.crafting.system | Extends: RefSystem

public static class OnAddOrRemoved extends RefSystem

ECS system that handles bench block entity lifecycle. On add, checks if the block type has a valid bench configuration; on remove, closes all open windows and drops stored upgrade items as item entities.

Also in this package: BenchSystems, CraftingHolderSystem, CraftingRefSystem, CraftingTickingSystem, PlayerCraftingSystems, ProcessingBenchLifecycle, ProcessingBenchTick

Complete API:
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
private final ComponentType<ChunkStore,BenchBlock> benchBlockComponentType
private final Query<ChunkStore> query
