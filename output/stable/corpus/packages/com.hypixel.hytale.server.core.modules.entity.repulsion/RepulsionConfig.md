# RepulsionConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.repulsion | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, RepulsionConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.RepulsionConfig>

public class RepulsionConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, RepulsionConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.RepulsionConfig>

Asset-backed repulsion configuration defining radius, minimum force, and maximum force.

Also in this package: EntityTrackerRemove, EntityTrackerUpdate, PlayerSetup, Repulsion, RepulsionConfigPacketGenerator, RepulsionSystems, RepulsionTicker

Complete API:
  public static AssetStore<String,RepulsionConfig,IndexedLookupTableAssetMap<String,RepulsionConfig>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,RepulsionConfig> getAssetMap()
  public String getId()
  public com.hypixel.hytale.protocol.RepulsionConfig toPacket()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,RepulsionConfig> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,RepulsionConfig,IndexedLookupTableAssetMap<String,RepulsionConfig>> ASSET_STORE
public static final int NO_REPULSION
protected AssetExtraInfo.Data data
protected String id
protected float radius
protected float minForce
protected float maxForce
