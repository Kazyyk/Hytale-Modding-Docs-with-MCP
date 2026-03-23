# BlockParticleSet

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockparticle.config | Implements: JsonAssetWithMap, NetworkSerializable

public class BlockParticleSet implements JsonAssetWithMap, NetworkSerializable

## Fields

- public static final AssetBuilderCodec<String,BlockParticleSet> CODEC
- private static AssetStore<String,BlockParticleSet,DefaultAssetMap<String,BlockParticleSet>> ASSET_STORE
- public static final ValidatorCache<String> VALIDATOR_CACHE
- protected AssetExtraInfo.Data data
- protected String id
- protected Color color
- protected float scale
- protected Vector3f positionOffset
- protected Direction rotationOffset
- protected Map<BlockParticleEvent,String> particleSystemIds
- private SoftReference<com.hypixel.hytale.protocol.BlockParticleSet> cachedPacket

## Methods

- public static AssetStore<String,BlockParticleSet,DefaultAssetMap<String,BlockParticleSet>> getAssetStore()
- public static DefaultAssetMap<String,BlockParticleSet> getAssetMap()
- @Nonnull public com.hypixel.hytale.protocol.BlockParticleSet toPacket()
- public String getId()
- public Color getColor()
- public float getScale()
- public Vector3f getPositionOffset()
- public Direction getRotationOffset()
- public Map<BlockParticleEvent,String> getParticleSystemIds()
- @Nonnull @Override public String toString()
