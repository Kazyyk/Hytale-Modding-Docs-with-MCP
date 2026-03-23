# ProcessingBenchTick

Type: class | Package: com.hypixel.hytale.builtin.crafting.system | Extends: EntityTickingSystem

public static class ProcessingBenchTick extends EntityTickingSystem

ECS ticking system that advances processing bench state each tick. Manages recipe validation, input progress, fuel consumption, output production, block interaction state transitions (default/Processing/ProcessCompleted), and sound event playback.

Also in this package: BenchSystems, CraftingHolderSystem, CraftingRefSystem, CraftingTickingSystem, OnAddOrRemoved, PlayerCraftingSystems, ProcessingBenchLifecycle

Complete API:
  public Query<ChunkStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)

Fields:
private final ComponentType<ChunkStore,ProcessingBenchBlock> componentType
private final ComponentType<ChunkStore,BenchBlock> benchBlockComponentType
private final ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
