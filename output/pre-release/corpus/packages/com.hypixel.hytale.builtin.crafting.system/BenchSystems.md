# BenchSystems

Type: class | Package: com.hypixel.hytale.builtin.crafting.system

public class BenchSystems

Container class for crafting bench ECS systems. Contains static helper `dropUpgradeItems()` for spawning item entities when benches are removed.

Also in this package: CraftingHolderSystem, CraftingRefSystem, CraftingTickingSystem, OnAddOrRemoved, PlayerCraftingSystems, ProcessingBenchLifecycle, ProcessingBenchTick

Complete API:
  private static void dropUpgradeItems(CommandBuffer<ChunkStore> commandBuffer, BlockType type, BenchBlock benchBlock, int rotation, int x, int y, int z)
