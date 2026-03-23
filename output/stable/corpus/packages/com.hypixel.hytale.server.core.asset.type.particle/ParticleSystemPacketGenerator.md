# ParticleSystemPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle | Extends: DefaultAssetPacketGenerator

public class ParticleSystemPacketGenerator extends DefaultAssetPacketGenerator

## Methods

- @Nonnull @Override public ToClientPacket generateInitPacket(DefaultAssetMap<String,ParticleSystem> assetMap, Map<String,ParticleSystem> assets)
- @Nonnull @Override public ToClientPacket generateUpdatePacket(Map<String,ParticleSystem> loadedAssets)
- @Nonnull @Override public ToClientPacket generateRemovePacket(Set<String> removed)

Also in this package: ParticleSpawnerPacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,ParticleSystem> assetMap, Map<String,ParticleSystem> assets)
  public ToClientPacket generateUpdatePacket(Map<String,ParticleSystem> loadedAssets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
