# PrefabPopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class PrefabPopulator

Populates a chunk with prefab structures from biome definitions. Operates in several phases:

1. **Collect biomes** -- gathers all biomes that intersect the chunk (including neighboring regions within the maximum zone extent).
2. **Collect prefab candidates** -- for each biome with a `PrefabContainer`, uses the grid generator to find potential prefab positions, validates biome matching, noise density, height conditions, parent block conditions, and unique prefab exclusion ranges.
3. **Resolve conflicts** -- detects overlapping prefab bounding boxes and removes lower-priority candidates.
4. **Generate** -- pastes surviving candidates and any unique prefabs via `PrefabPasteUtil`.

Uses a thread-local `FastRandom` seeded from world seed and biome ID for deterministic placement.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)
- public void run(int seed, @Nonnull ChunkGeneratorExecution execution)
