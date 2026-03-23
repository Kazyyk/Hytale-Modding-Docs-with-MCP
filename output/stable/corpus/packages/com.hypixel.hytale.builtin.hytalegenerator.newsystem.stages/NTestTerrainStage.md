# NTestTerrainStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NTestTerrainStage implements NStage

Test stage that fills a voxel buffer with ground or empty material based on 3D simplex noise, with a hard cutoff at y=150 and partial cutoff at y=130.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NPropStage, NStage, NTerrainStage, NTestPropStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()

Fields:
private static final Class<NVoxelBuffer> bufferClass
private static final Class<SolidMaterial> solidMaterialClass
private final NParametrizedBufferType outputBufferType
private final SolidMaterial ground
private final SolidMaterial empty
