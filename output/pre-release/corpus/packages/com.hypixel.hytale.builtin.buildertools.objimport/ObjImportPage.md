# ObjImportPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.objimport | Extends: InteractiveCustomUIPage

public class ObjImportPage extends InteractiveCustomUIPage<ObjImportPage.PageData>

Full-featured UI page for importing Wavefront OBJ files as voxelized block selections. Provides file path input with an integrated file browser (asset pack mode), sizing controls (height or scale mode), block pattern with weighted random selection, fill mode (solid vs. shell), material/texture support with auto-detection, origin placement options, and axis rotation. The imported mesh is voxelized via `MeshVoxelizer`, copied to the player's clipboard as a `BlockSelection`, and the paste tool is activated.

## Constants

- DEFAULT_BLOCK | String | "Rock_Stone" | Default block type for voxels.
- DEFAULT_HEIGHT | int | 20 | Default target height in blocks.
- MIN_HEIGHT` / `MAX_HEIGHT | int | 1` / `320 | Height range bounds.
- MIN_SCALE` / `MAX_SCALE | float | 0.01F` / `100.0F | Scale range bounds.

## Constructor


public ObjImportPage(@Nonnull PlayerRef playerRef)

## Methods

- build(Ref, UICommandBuilder, UIEventBuilder, Store) | void | Builds the import form with all controls, dropdowns, and the file browser.
- handleDataEvent(Ref, Store, PageData) | void | Handles field changes, browse events, and the import action.

## Inner Types

### MeshRotation (enum)

Axis remapping options for imported meshes.

- NONE | Y-up (no transformation).
- Z_UP_TO_Y_UP | Convert Z-up to Y-up.
- X_UP_TO_Y_UP | Convert X-up to Y-up.

### Origin (enum)

Placement origin for the voxelized result.

- BOTTOM_FRONT_LEFT | Origin at bottom-front-left corner.
- BOTTOM_CENTER | Origin at bottom center.
- CENTER | Origin at center.
- TOP_CENTER | Origin at top center.

### PageData (class)

Codec-backed data class for all form fields, browser events, and the import trigger.

### WeightedBlock (record)

A block ID paired with a probability weight for random selection.

## See Also

- MeshVoxelizer
- ObjParser
- ObjImportCommand

Also in this package: MeshRotation, MeshVoxelizer, MtlMaterial, MtlParser, ObjImportCommand, ObjMesh, ObjParseException, ObjParser, Origin, PageData, TextureSampler, VoxelResult, WeightedBlock

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  private void buildBrowserPage(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void updateStatus(UICommandBuilder commandBuilder)
  private void setError(Message message)
  private void setStatus(Message message)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, ObjImportPage.PageData data)
  private boolean handleBrowserEvent(ObjImportPage.PageData data)
  private void rebuildBrowser()
  private List<ObjImportPage.WeightedBlock> parseBlockPattern(String pattern)
  private int selectRandomBlock(List<ObjImportPage.WeightedBlock> blocks, Random random)
  private void performImport(Ref<EntityStore> ref, Store<EntityStore> store)
  private void loadMaterialData(Path objPath, ObjParser.ObjMesh mesh, BlockColorIndex colorIndex, Map<String,BufferedImage> materialTextures, Map<String,Integer> materialToBlockId, boolean autoDetectTextures)
  private static String findMatchingTexture(Path directory, String materialName)

Fields:
private static final String DEFAULT_BLOCK
private static final int DEFAULT_HEIGHT
private static final int MIN_HEIGHT
private static final int MAX_HEIGHT
private static final float DEFAULT_SCALE
private static final float MIN_SCALE
private static final float MAX_SCALE
private static final String ASSET_PACK_SUB_PATH
private String objPath
private int targetHeight
private boolean useScaleMode
private float scale
private String blockPattern
private boolean fillSolid
private boolean useMaterials
private boolean autoDetectTextures
private String originStr
private ObjImportPage.Origin origin
private String rotationStr
private ObjImportPage.MeshRotation rotation
private Message statusMessage
private boolean isError
private boolean isProcessing
private boolean showBrowser
private final ServerFileBrowser browser
private static final String[] AUTO_DETECT_SUFFIXES
private static final String[] AUTO_DETECT_EXTENSIONS
