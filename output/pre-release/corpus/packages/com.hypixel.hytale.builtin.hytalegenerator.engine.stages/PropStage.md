# PropStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages | Implements: Stage

public class PropStage implements Stage

A Stage that places props (trees, rocks, vegetation, entities) into the world. Reads biome, biome-distance, and material buffers as input, and writes to material and entity output buffers. For each biome present in the output area, iterates over the biome's `PropRuntime` entries matching this stage's runtime index. Each `PropDistribution` distributes (position, prop) pairs via a pipe, and the prop's `generate` method modifies the material and entity output spaces. Prop placement is constrained to voxels belonging to the correct biome and respects biome edge distance.

## Fields

- public static final double DEFAULT_BACKGROUND_DENSITY
- @Nonnull public static final Class<CountedPixelBuffer> biomeBufferClass
- @Nonnull public static final Class<Integer> biomeClass
- @Nonnull public static final Class<SimplePixelBuffer> biomeDistanceBufferClass
- @Nonnull public static final Class<BiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
- @Nonnull public static final Class<VoxelBuffer> materialBufferClass
- @Nonnull public static final Class<Material> materialClass
- @Nonnull public static final Class<EntityBuffer> entityBufferClass
- @Nonnull private final ParametrizedBufferType biomeInputBufferType
- @Nonnull private final ParametrizedBufferType biomeDistanceInputBufferType
- @Nonnull private final ParametrizedBufferType materialInputBufferType
- @Nullable private final BufferType entityInputBufferType
- @Nonnull private final ParametrizedBufferType materialOutputBufferType
- @Nonnull private final BufferType entityOutputBufferType
- @Nonnull private final Bounds3i materialInputBounds_bufferGrid
- @Nonnull private final Bounds3i materialInputBounds_voxelGrid
- @Nonnull private final Bounds3i biomeInputBounds_bufferGrid
- @Nonnull private final Bounds3i positionsBounds_voxelGrid
- @Nonnull private final Bounds3i positionsBounds_bufferGrid
- @Nonnull private final String stageName
- @Nonnull private final MaterialCache materialCache
- @Nonnull private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData
- private final int runtimeIndex

## Constructors

- public PropStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType biomeDistanceInputBufferType, @Nonnull ParametrizedBufferType materialInputBufferType, @Nullable BufferType entityInputBufferType, @Nonnull ParametrizedBufferType materialOutputBufferType, @Nonnull BufferType entityOutputBufferType, @Nonnull MaterialCache materialCache, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerData, int runtimeIndex)

## Methods

- @Nonnull private static Bounds3i toInputBounds_voxelGrid(@Nonnull Bounds3i readBounds_voxelGrid, @Nonnull Bounds3i writeBounds_voxelGrid)
- @Nonnull private static Bounds3i toPositionsBounds_voxelGrid(@Nonnull Bounds3i writeBounds_voxelGrid)
- @Override public void run(@Nonnull Stage.Context context)
- @Nonnull @Override public Map<BufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull @Override public List<BufferType> getOutputTypes()
- @Nonnull @Override public String getName()
