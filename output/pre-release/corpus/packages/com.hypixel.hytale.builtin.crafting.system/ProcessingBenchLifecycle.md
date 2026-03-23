# ProcessingBenchLifecycle

Type: class | Package: com.hypixel.hytale.builtin.crafting.system | Extends: RefSystem

public static class ProcessingBenchLifecycle extends RefSystem

ECS system that handles processing bench block lifecycle. On add, initializes the bench configuration and sets up input/output/fuel slots. On remove (non-unload), drops all contained items as item entities.

Also in this package: BenchSystems, CraftingHolderSystem, CraftingRefSystem, CraftingTickingSystem, OnAddOrRemoved, PlayerCraftingSystems, ProcessingBenchTick

Complete API:
  public Query<ChunkStore> getQuery()
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)

Fields:
private final ComponentType<ChunkStore,ProcessingBenchBlock> componentType
private final ComponentType<ChunkStore,BenchBlock> benchBlockComponentType
private final ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
