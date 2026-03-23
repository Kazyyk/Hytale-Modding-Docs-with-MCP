# NStage

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages

public interface NStage

Contract for all generation pipeline stages. Each stage declares its input buffer types with spatial bounds, output buffer types, a human-readable name, and a `run` method that executes on a worker thread with access to typed buffer views.

## Methods

- void run(@Nonnull NStage.Context var1)
- @Nonnull Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull List<NBufferType> getOutputTypes()
- @Nonnull String getName()

## Inner Types

### Context


public static final class Context

- @Nonnull public Map<NBufferType, NBufferBundle.Access.View> bufferAccess
- @Nonnull public WorkerIndexer.Id workerId


public Context(@Nonnull Map<NBufferType, NBufferBundle.Access.View> bufferAccess, @Nonnull WorkerIndexer.Id workerId)

Known implementors: NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NPropStage, NTerrainStage, NTestPropStage, NTestTerrainStage, NTintStage

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NPropStage, NTerrainStage, NTestPropStage, NTestTerrainStage, NTintStage

Complete API:
  void run(NStage.Context var1)
  Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  List<NBufferType> getOutputTypes()
  String getName()
