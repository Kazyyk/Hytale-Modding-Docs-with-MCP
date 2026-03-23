# Stage

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages

public interface Stage

Defines a single step in the staged chunk generation pipeline. Each stage declares its input buffer types with required bounds, output buffer types, and a `run` method that reads from input buffers and writes to output buffers. Implementations: BiomeStage, BiomeDistanceStage, TerrainStage, EnvironmentStage, TintStage, PropStage.

## Inner Types

- Stage.Context | class | Execution context providing buffer access and worker ID

## Methods

- void run(@Nonnull Stage.Context var1)
- @Nonnull Map<BufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull List<BufferType> getOutputTypes()
- @Nonnull String getName()

Known implementors: BiomeDistanceStage, BiomeStage, EnvironmentStage, PropStage, TerrainStage, TintStage

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, ColumnData, Context, Entry, EnvironmentStage, PropStage, TerrainStage, TintStage

Complete API:
  void run(Stage.Context var1)
  Map<BufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  List<BufferType> getOutputTypes()
  String getName()
