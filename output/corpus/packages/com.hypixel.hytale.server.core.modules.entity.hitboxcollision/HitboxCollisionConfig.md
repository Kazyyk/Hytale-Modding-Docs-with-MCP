# HitboxCollisionConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.hitboxcollision

public class HitboxCollisionConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.HitboxCollisionConfig>

## Constants

- public static final int NO_HITBOX

## Fields

- private static AssetStore<String, HitboxCollisionConfig, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>> ASSET_STORE
- public static final int NO_HITBOX
- protected AssetExtraInfo.Data data
- protected String id
- protected CollisionType collisionType
- protected float softOffsetRatio

## Methods

- public static AssetStore<String, HitboxCollisionConfig, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>> getAssetStore()
- public static IndexedLookupTableAssetMap<String, HitboxCollisionConfig> getAssetMap()
- public HitboxCollisionConfig(String id)
- public HitboxCollisionConfig()
- public String getId()
- public CollisionType getCollisionType()
- public float getSoftOffsetRatio()
- public com.hypixel.hytale.protocol.HitboxCollisionConfig toPacket()
- public String toString()
