# NPCGroup

Type: class | Package: com.hypixel.hytale.builtin.tagset.config | Implements: JsonAssetWithMap, TagSet

public class NPCGroup implements JsonAssetWithMap, TagSet

## Fields

- public static final AssetBuilderCodec<String,NPCGroup> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,NPCGroup,IndexedLookupTableAssetMap<String,NPCGroup>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected String[] includedGroupTags
- protected String[] excludedGroupTags
- protected String[] includedRoles
- protected String[] excludedRoles

## Methods

- public static AssetStore<String,NPCGroup,IndexedLookupTableAssetMap<String,NPCGroup>> getAssetStore()
- public static IndexedLookupTableAssetMap<String,NPCGroup> getAssetMap()
- public String getId()
- @Override public String[] getIncludedTagSets()
- @Override public String[] getExcludedTagSets()
- @Override public String[] getIncludedTags()
- @Override public String[] getExcludedTags()

Complete API:
  public static AssetStore<String,NPCGroup,IndexedLookupTableAssetMap<String,NPCGroup>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,NPCGroup> getAssetMap()
  public String getId()
  public String[] getIncludedTagSets()
  public String[] getExcludedTagSets()
  public String[] getIncludedTags()
  public String[] getExcludedTags()

Fields:
public static final AssetBuilderCodec<String,NPCGroup> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,NPCGroup,IndexedLookupTableAssetMap<String,NPCGroup>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected String[] includedGroupTags
protected String[] excludedGroupTags
protected String[] includedRoles
protected String[] excludedRoles
