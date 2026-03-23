# TintStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages | Implements: Stage

public class TintStage implements Stage

A Stage that generates per-column tint values. Reads biome IDs from a `CountedPixelBuffer<Integer>` input and writes tint integers into a `SimplePixelBuffer<Integer>` output. For each (x, z) column, looks up the biome's `TintProvider` and applies it. Falls back to `TintProvider.DEFAULT_TINT` when the provider returns no value.

## Fields

- @Nonnull public static final Class<CountedPixelBuffer> biomeBufferClass
- @Nonnull public static final Class<Integer> biomeClass
- @Nonnull public static final Class<SimplePixelBuffer> tintBufferClass
- @Nonnull public static final Class<Integer> tintClass
- @Nonnull private final ParametrizedBufferType biomeInputBufferType
- @Nonnull private final ParametrizedBufferType tintOutputBufferType
- @Nonnull private final Bounds3i inputBounds_bufferGrid
- @Nonnull private final String stageName
- @Nonnull private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData

## Constructors

- public TintStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType tintOutputBufferType, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerData)

## Methods

- @Override public void run(@Nonnull Stage.Context context)
- @Nonnull @Override public Map<BufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull @Override public List<BufferType> getOutputTypes()
- @Nonnull @Override public String getName()
