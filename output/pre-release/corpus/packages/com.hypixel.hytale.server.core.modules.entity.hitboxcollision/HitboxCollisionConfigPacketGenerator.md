# HitboxCollisionConfigPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.hitboxcollision | Extends: AssetPacketGenerator

public class HitboxCollisionConfigPacketGenerator extends AssetPacketGenerator<String, HitboxCollisionConfig, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>>

## Methods

- public ToClientPacket generateInitPacket( @Nonnull IndexedLookupTableAssetMap<String, HitboxCollisionConfig> assetMap, @Nonnull Map<String, HitboxCollisionConfig> assets )
- public ToClientPacket generateUpdatePacket( @Nonnull IndexedLookupTableAssetMap<String, HitboxCollisionConfig> assetMap, @Nonnull Map<String, HitboxCollisionConfig> loadedAssets, @Nonnull AssetUpdateQuery query )
- public ToClientPacket generateRemovePacket( @Nonnull IndexedLookupTableAssetMap<String, HitboxCollisionConfig> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query )
