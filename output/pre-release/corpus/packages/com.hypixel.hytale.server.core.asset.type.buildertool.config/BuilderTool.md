# BuilderTool

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, BuilderTool>>, NetworkSerializable<BuilderToolState>

public class BuilderTool implements JsonAssetWithMap<String, DefaultAssetMap<String, BuilderTool>>, NetworkSerializable<BuilderToolState>

Asset defining a builder tool with configurable arguments and optional brush data. Tools are loaded from JSON and associated with items via `BuilderToolData`. Supports runtime argument updates, item metadata serialization, and network packet conversion.

## Constants

- public static final String TOOL_DATA_KEY
- public static final KeyedCodec<BrushData.Values> BRUSH_DATA_KEY_CODEC
- public static final BuilderTool DEFAULT

## Methods

- public static DefaultAssetMap<String, BuilderTool> getAssetMap()
- public static BuilderTool getActiveBuilderTool(Player player)
- public String getId()
- public String getBrushConfigurationCommand()
- public boolean isBrush()
- public BrushData getBrushData()
- public Map<String, ToolArg> getArgs()
- public MapProvidedMapCodec<Object, ToolArg> getArgsCodec()
- public BuilderTool.ArgData getItemArgData(ItemStack itemStack)
- public ItemStack createItemStack(String itemId, int quantity, BuilderTool.ArgData argData)
- public ItemStack updateArgMetadata(ItemStack itemStack, BuilderToolArgGroup group, String id, String value)
- public BuilderToolState toPacket()

## Inner Types

- BuilderTool.ArgData | record | Holds tool arguments and brush values

Also in this package: ArgData, BlockTypeListAsset, PrefabListAsset, PrefabReference, PrefabRootDirectory

Complete API:
  public static DefaultAssetMap<String,BuilderTool> getAssetMap()
  private static HashSet<String> setMandatoryToolArgs()
  public static BuilderTool getActiveBuilderTool(Player player)
  public String getId()
  public String getBrushConfigurationCommand()
  public boolean isBrush()
  public Map<String,ToolArg> getArgs()
  public MapProvidedMapCodec<Object,ToolArg> getArgsCodec()
  private Map<String,Object> getDefaultToolArgs(ItemStack itemStack)
  public BuilderTool.ArgData getItemArgData(ItemStack itemStack)
  public ItemStack createItemStack(String itemId, int quantity, BuilderTool.ArgData argData)
  public ItemStack updateArgMetadata(ItemStack itemStack, String id, String value)
  public BuilderToolState toPacket()
  public String toString()

Fields:
public static final String TOOL_DATA_KEY
public static final String MATERIAL_KEY
public static final String FAVORITE_MATERIALS_KEY
public static final String WIDTH_KEY
public static final String HEIGHT_KEY
public static final String THICKNESS_KEY
public static final String CAPPED_KEY
public static final String SHAPE_KEY
public static final String ORIGIN_KEY
public static final String ORIGIN_ROTATION_KEY
public static final String ROTATION_AXIS_KEY
public static final String ROTATION_ANGLE_KEY
public static final String MIRROR_AXIS_KEY
public static final String ROTATION_FACE_KEY
public static final String DENSITY_KEY
public static final String SPACING_KEY
public static final String MASK_KEY
public static final String MASK_ABOVE_KEY
public static final String MASK_NOT_KEY
public static final String MASK_BELOW_KEY
public static final String MASK_ADJACENT_KEY
public static final String MASK_NEIGHBOR_KEY
public static final String MASK_COMMANDS_KEY
public static final String USE_MASK_COMMANDS_KEY
public static final String INVERT_MASK_KEY
public static HashSet<String> MASK_ARGS
public static final BuilderTool DEFAULT
public static final AssetBuilderCodec<String,BuilderTool> CODEC
private static DefaultAssetMap<String,BuilderTool> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected boolean isBrush
protected String brushConfigurationCommand
protected Map<String,ToolArg> args
protected Map<String,Object> defaultToolArgs
private MapProvidedMapCodec<Object,ToolArg> argsCodec
private SoftReference<BuilderToolState> cachedPacket
