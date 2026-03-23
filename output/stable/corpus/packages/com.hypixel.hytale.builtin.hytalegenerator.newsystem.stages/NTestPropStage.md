# NTestPropStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NTestPropStage implements NStage

Test stage that copies input voxel data and places a 5-block-tall column of prop material at a randomly selected scan position where floor and anchor materials match.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NPropStage, NStage, NTerrainStage, NTestTerrainStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  private void placeProp(Vector3i position, NVoxelBufferView<SolidMaterial> view)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()

Fields:
private static final Class<NVoxelBuffer> bufferClass
private static final Class<SolidMaterial> solidMaterialClass
private final int CONTEXT_DEPENDENCY_RANGE_BUFFER_GRID
private final Bounds3i inputBounds_bufferGrid
private final NParametrizedBufferType inputBufferType
private final NParametrizedBufferType outputBufferType
private final SolidMaterial floorMaterial
private final SolidMaterial anchorMaterial
private final SolidMaterial propMaterial
