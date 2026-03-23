# ProjectileConfigPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.config | Extends: DefaultAssetPacketGenerator<String, ProjectileConfig>

public class ProjectileConfigPacketGenerator extends DefaultAssetPacketGenerator<String, ProjectileConfig>

Generates network packets for projectile config asset synchronization. Produces `UpdateProjectileConfigs` packets for init, update, and remove operations.

## Methods

- public ToClientPacket generateInitPacket(@Nonnull DefaultAssetMap<String, ProjectileConfig> assetMap, Map<String, ProjectileConfig> assets)
- public ToClientPacket generateUpdatePacket(@Nonnull Map<String, ProjectileConfig> loadedAssets)
- public ToClientPacket generateRemovePacket(@Nonnull Set<String> removed)
