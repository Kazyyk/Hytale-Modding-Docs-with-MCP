# WorldGenModifier

Type: class | Package: com.hypixel.hytale.builtin.worldgen.modifier | Extends: java.lang.Object | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, WorldGenModifier>>

public class WorldGenModifier implements JsonAssetWithMap<String, DefaultAssetMap<String, WorldGenModifier>>

Asset type for data-driven modifications to world-gen-v1 assets. Contains a priority, target configuration, and a map of event types to operations.

Also in this package: EventHandler, Modifier, PriorityEntry, Target

Complete API:
  public String getId()
  public Target getTarget()
  public Op[] getOperations(EventType type)

Fields:
public static final BuilderCodec<WorldGenModifier> CODEC
public static final AssetBuilderCodec<String,WorldGenModifier> ASSET_CODEC
public static final DefaultAssetMap<String,WorldGenModifier> ASSET_MAP
private static final String UNKNOWN_ID
protected String id
protected AssetExtraInfo.Data data
protected EventPriority priority
protected Target target
protected Map<EventType,Op[]> content
