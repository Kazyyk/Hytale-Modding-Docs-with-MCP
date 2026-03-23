# BlockSet

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockset.config | Implements: JsonAssetWithMap, NetworkSerializable

@Deprecated public class BlockSet implements JsonAssetWithMap, NetworkSerializable

## Fields

- public static final AssetBuilderCodec<String,BlockSet> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,BlockSet,IndexedLookupTableAssetMap<String,BlockSet>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected String parent
- protected boolean includeAll
- protected String[] includeBlockTypes
- protected String[] excludeBlockTypes
- protected String[] includeBlockGroups
- protected String[] excludeBlockGroups
- protected String[] includeHitboxTypes
- protected String[] excludeHitboxTypes
- protected String[][] includeCategories
- protected String[][] excludeCategories

## Methods

- public static AssetStore<String,BlockSet,IndexedLookupTableAssetMap<String,BlockSet>> getAssetStore()
- public static IndexedLookupTableAssetMap<String,BlockSet> getAssetMap()
- public String getId()
- public String getParent()
- public boolean isIncludeAll()
- public String[] getIncludeBlockTypes()
- public String[] getExcludeBlockTypes()
- public String[] getIncludeBlockGroups()
- public String[] getExcludeBlockGroups()
- public String[] getIncludeHitboxTypes()
- public String[] getExcludeHitboxTypes()
- public String[][] getIncludeCategories()
- public String[][] getExcludeCategories()
- @Nonnull @Override public String toString()
- @Nonnull public com.hypixel.hytale.protocol.BlockSet toPacket()
