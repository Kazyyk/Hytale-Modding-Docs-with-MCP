# ScriptedBrushAsset

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ScriptedBrushAsset>>

public class ScriptedBrushAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ScriptedBrushAsset>>

JSON-loaded asset representing a scripted brush definition containing an ordered list of `BrushOperation` instances. When loaded into a BrushConfigCommandExecutor, operations are separated into sequential and global categories. Supports nested asset loading via `LoadOperationsFromAssetOperation`.

## Static Methods


public static DefaultAssetMap<String, ScriptedBrushAsset> getAssetMap()


public static ScriptedBrushAsset get(@Nonnull String id)

## Instance Methods


public String getId()


public List<BrushOperation> getOperations()


public void loadIntoExecutor(@Nonnull BrushConfigCommandExecutor executor)

Clears the executor's operations and populates it with this asset's operations, recursively resolving `LoadOperationsFromAssetOperation` references.

Also in this package: BCExecutionStatus, BrushConfig, BrushConfigChunkAccessor, BrushConfigCommandExecutor, BrushConfigEditStore, DataGettingFlags, DataSettingFlags, DebugOutputTarget, HistoryMask

Complete API:
  public static DefaultAssetMap<String,ScriptedBrushAsset> getAssetMap()
  public static ScriptedBrushAsset get(String id)
  public String getId()
  public List<BrushOperation> getOperations()
  public void loadIntoExecutor(BrushConfigCommandExecutor executor)

Fields:
public static final AssetBuilderCodec<String,ScriptedBrushAsset> CODEC
private static DefaultAssetMap<String,ScriptedBrushAsset> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected List<BrushOperation> operations
