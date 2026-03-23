# FlockAsset

Type: abstract class | Package: com.hypixel.hytale.server.flock.config | Extends: java.lang.Object | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>

public abstract class FlockAsset implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>

Abstract base class for flock configuration assets loaded from JSON at path `NPC/Flocks`. Defines the size parameters and role restrictions for flock spawning. Two concrete implementations: RangeSizeFlockAsset (default, size from a min-max range) and WeightedSizeFlockAsset (size from weighted distribution).

## Fields

- MaxGrowSize | int | 8 | Maximum flock size after initial spawning.
- BlockedRoles | String[] | [] | Roles excluded from joining this flock post-spawn.

## Abstract Methods


public abstract int getMinFlockSize()


public abstract int pickFlockSize()

Returns a random flock size based on the asset's configuration.

## Methods


public String getId()


public int getMaxGrowSize()


public String[] getBlockedRoles()


public static AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>> getAssetStore()


public static IndexedLookupTableAssetMap<String, FlockAsset> getAssetMap()

## Related Types

- RangeSizeFlockAsset -- default implementation with min-max range
- WeightedSizeFlockAsset -- weighted distribution implementation
- FlockPlugin -- registers the asset store
- PersistentFlockData -- uses max grow size and blocked roles
