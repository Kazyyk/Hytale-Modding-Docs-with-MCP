# ParticleSpawnerPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle | Extends: DefaultAssetPacketGenerator

public class ParticleSpawnerPacketGenerator extends DefaultAssetPacketGenerator

## Methods

- @Nonnull @Override public ToClientPacket generateInitPacket(DefaultAssetMap<String,ParticleSpawner> assetMap, Map<String,ParticleSpawner> assets)
- @Nonnull @Override public ToClientPacket generateUpdatePacket(Map<String,ParticleSpawner> loadedAssets)
- @Nonnull @Override public ToClientPacket generateRemovePacket(Set<String> removed)
