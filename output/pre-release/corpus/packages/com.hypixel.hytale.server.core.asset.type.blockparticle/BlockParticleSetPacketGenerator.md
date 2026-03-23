# BlockParticleSetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockparticle | Extends: DefaultAssetPacketGenerator

public class BlockParticleSetPacketGenerator extends DefaultAssetPacketGenerator<String, BlockParticleSet>

Generates init, update, and remove network packets for `BlockParticleSet` assets.

## Methods

- generateInitPacket(DefaultAssetMap<String, BlockParticleSet> assetMap, Map<String, BlockParticleSet> assets) | ToClientPacket | Instance method.
- generateUpdatePacket(Map<String, BlockParticleSet> loadedAssets) | ToClientPacket | Instance method.
- generateRemovePacket(Set<String> removed) | ToClientPacket | Instance method.

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,BlockParticleSet> assetMap, Map<String,BlockParticleSet> assets)
  public ToClientPacket generateUpdatePacket(Map<String,BlockParticleSet> loadedAssets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
