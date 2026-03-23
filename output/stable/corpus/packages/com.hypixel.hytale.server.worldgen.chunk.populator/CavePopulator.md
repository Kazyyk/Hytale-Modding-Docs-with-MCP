# CavePopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class CavePopulator

Populates a chunk with cave structures. For each zone that has a cave generator, collects entry points from each `CaveType`'s point generator within the chunk's extended bounds (including the maximum cave size buffer). For qualifying entry points that pass biome matching and height threshold checks, generates cave nodes and pastes cave prefabs using `PrefabPasteUtil`.

Uses `CaveBlockPriorityModifier` for cave node carving and standard priority for prefab placement.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)
