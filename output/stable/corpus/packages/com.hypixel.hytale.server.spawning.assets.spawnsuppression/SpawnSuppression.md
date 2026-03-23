# SpawnSuppression

Type: class | Package: com.hypixel.hytale.server.spawning.assets.spawnsuppression | Implements: JsonAssetWithMap

public class SpawnSuppression implements JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,SpawnSuppression> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,SpawnSuppression,IndexedAssetMap<String,SpawnSuppression>> ASSET_STORE
- private AssetExtraInfo.Data data
- protected String id
- protected double radius
- protected String[] suppressedGroups
- protected int[] suppressedGroupIds
- protected boolean suppressSpawnMarkers

## Methods

- public static AssetStore<String,SpawnSuppression,IndexedAssetMap<String,SpawnSuppression>> getAssetStore()
- public static IndexedAssetMap<String,SpawnSuppression> getAssetMap()
- public String getId()
- public double getRadius()
- public int[] getSuppressedGroupIds()
- public boolean isSuppressSpawnMarkers()
- @Nonnull @Override public String toString()
