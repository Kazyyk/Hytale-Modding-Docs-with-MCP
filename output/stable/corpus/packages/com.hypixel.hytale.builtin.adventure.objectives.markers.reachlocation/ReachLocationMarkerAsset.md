# ReachLocationMarkerAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation | Implements: JsonAssetWithMap

public class ReachLocationMarkerAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ReachLocationMarkerAsset>>

Implements `JsonAssetWithMap`.

## Fields

- protected AssetExtraInfo.Data data
- protected String id
- protected String name
- protected float radius

## Methods

- public static AssetStore<String, ReachLocationMarkerAsset, DefaultAssetMap<String, ReachLocationMarkerAsset>> getAssetStore()
- public static DefaultAssetMap<String, ReachLocationMarkerAsset> getAssetMap()
- public String getId()
- public float getRadius()
- public String getName()
- @Override public String toString()

Also in this package: EnsureNetworkSendable, EntityAdded, ReachLocationMarker, ReachLocationMarkerSystems, Ticking

Complete API:
  public static AssetStore<String,ReachLocationMarkerAsset,DefaultAssetMap<String,ReachLocationMarkerAsset>> getAssetStore()
  public static DefaultAssetMap<String,ReachLocationMarkerAsset> getAssetMap()
  public String getId()
  public float getRadius()
  public String getName()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ReachLocationMarkerAsset> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ReachLocationMarkerAsset,DefaultAssetMap<String,ReachLocationMarkerAsset>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected String name
protected float radius
