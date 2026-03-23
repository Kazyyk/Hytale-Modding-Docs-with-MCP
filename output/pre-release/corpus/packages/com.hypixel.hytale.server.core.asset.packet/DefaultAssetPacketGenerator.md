# DefaultAssetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.packet | Extends: SimpleAssetPacketGenerator

public abstract class DefaultAssetPacketGenerator<K, T> extends SimpleAssetPacketGenerator

## Methods

- public abstract ToClientPacket generateInitPacket(DefaultAssetMap<K,T> var1, Map<K,T> var2)
- public abstract ToClientPacket generateUpdatePacket(Map<K,T> var1)
- @Nullable public abstract ToClientPacket generateRemovePacket(Set<K> var1)
- public final ToClientPacket generateUpdatePacket(DefaultAssetMap<K,T> assetMap, Map<K,T> loadedAssets)
- @Nullable public final ToClientPacket generateRemovePacket(DefaultAssetMap<K,T> assetMap, Set<K> removed)

Known subclasses: BlockBreakingDecalPacketGenerator, BlockGroupPacketGenerator, BlockParticleSetPacketGenerator, FieldcraftCategoryPacketGenerator, ItemCategoryPacketGenerator, ItemPlayerAnimationsPacketGenerator, ParticleSpawnerPacketGenerator, ParticleSystemPacketGenerator, ProjectileConfigPacketGenerator, ResourceTypePacketGenerator, TrailPacketGenerator, UnarmedInteractionsPacketGenerator

Also in this package: AssetPacketGenerator, SimpleAssetPacketGenerator

Complete API:
  public abstract ToClientPacket generateInitPacket(DefaultAssetMap<K,T> var1, Map<K,T> var2)
  public abstract ToClientPacket generateUpdatePacket(Map<K,T> var1)
  public abstract ToClientPacket generateRemovePacket(Set<K> var1)
  public final ToClientPacket generateUpdatePacket(DefaultAssetMap<K,T> assetMap, Map<K,T> loadedAssets)
  public final ToClientPacket generateRemovePacket(DefaultAssetMap<K,T> assetMap, Set<K> removed)
