# NBiomeDistanceStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NBiomeDistanceStage implements NStage

Computes per-pixel minimum distance to the nearest different biome for each position within a configurable radius. Scans surrounding buffers, resolving per-voxel biome IDs when a buffer contains multiple biomes. Produces `BiomeDistanceEntries` objects recording all nearby biome distances.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()
