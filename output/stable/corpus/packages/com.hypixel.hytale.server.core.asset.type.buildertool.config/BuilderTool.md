# BuilderTool

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, BuilderTool>>, NetworkSerializable<BuilderToolState>

public class BuilderTool implements JsonAssetWithMap<String, DefaultAssetMap<String, BuilderTool>>, NetworkSerializable<BuilderToolState>

Asset defining a builder tool with configurable arguments and optional brush data. Tools are loaded from JSON and associated with items via BuilderToolData. Supports runtime argument updates, item metadata serialization, and network packet conversion.

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

Also in this package: ArgData, BlockTypeListAsset, BrushData, BuilderToolData, PrefabListAsset, PrefabReference, PrefabRootDirectory, Values

Complete API:
  public static DefaultAssetMap<String,BuilderTool> getAssetMap()
  public static BuilderTool getActiveBuilderTool(Player player)
  public String getId()
  public String getBrushConfigurationCommand()
  public boolean isBrush()
  public BrushData getBrushData()
  public Map<String,ToolArg> getArgs()
  public MapProvidedMapCodec<Object,ToolArg> getArgsCodec()
  private Map<String,Object> getDefaultToolArgs(ItemStack itemStack)
  private BrushData.Values getDefaultBrushArgs(ItemStack itemStack)
  public BuilderTool.ArgData getItemArgData(ItemStack itemStack)
  public ItemStack createItemStack(String itemId, int quantity, BuilderTool.ArgData argData)
  public ItemStack updateArgMetadata(ItemStack itemStack, BuilderToolArgGroup group, String id, String value)
  public BuilderToolState toPacket()
  public String toString()

Fields:
public static final String TOOL_DATA_KEY
public static final KeyedCodec<BrushData.Values> BRUSH_DATA_KEY_CODEC
public static final BuilderTool DEFAULT
public static final AssetBuilderCodec<String,BuilderTool> CODEC
private static DefaultAssetMap<String,BuilderTool> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected boolean isBrush
protected String brushConfigurationCommand
protected BrushData brushData
protected Map<String,ToolArg> args
protected Map<String,Object> defaultToolArgs
private MapProvidedMapCodec<Object,ToolArg> argsCodec
private SoftReference<BuilderToolState> cachedPacket
