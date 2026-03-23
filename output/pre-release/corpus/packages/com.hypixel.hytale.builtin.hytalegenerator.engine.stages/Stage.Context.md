# Stage.Context

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages

public static final class Stage.Context

Execution context passed to `Stage.run`. Provides a map of `BufferType` to `BufferBundle.Access.View` for reading inputs and writing outputs, and a `WorkerIndexer.Id` identifying the current worker thread.

## Fields

- @Nonnull public Map<BufferType, BufferBundle.Access.View> bufferAccess
- @Nonnull public WorkerIndexer.Id workerId

## Constructors

- public Context(@Nonnull Map<BufferType, BufferBundle.Access.View> bufferAccess, @Nonnull WorkerIndexer.Id workerId)

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, ColumnData, Entry, EnvironmentStage, PropStage, Stage, TerrainStage, TintStage

Fields:
public Map<BufferType,BufferBundle.Access.View> bufferAccess
public WorkerIndexer.Id workerId
