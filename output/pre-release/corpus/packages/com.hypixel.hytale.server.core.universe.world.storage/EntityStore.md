# EntityStore

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: WorldProvider

public class EntityStore implements WorldProvider

Central manager for entity-level ECS storage. Owns the `Store<EntityStore>`, UUID-to-reference and network-ID-to-reference lookups. Contains `UUIDSystem` and `NetworkIdSystem` inner classes for maintaining those indices.

Also in this package: BufferChunkLoader, BufferChunkSaver, ChunkLoadState, ChunkLoaderSaverSetupSystem, ChunkStorage, ChunkStore, GetChunkFlags, IChunkLoader, IChunkSaver, LoadFuturePacketDataQuerySystem, LoadPacketDataQuerySystem, NetworkIdSystem, UUIDSystem, UnloadPacketDataQuerySystem

Complete API:
  public void start(IResourceStorage resourceStorage)
  public void shutdown()
  public Store<EntityStore> getStore()
  public Ref<EntityStore> getRefFromUUID(UUID uuid)
  public Ref<EntityStore> getRefFromNetworkId(int networkId)
  public int takeNextNetworkId()
  public World getWorld()

Fields:
public static final MetricsRegistry<EntityStore> METRICS_REGISTRY
public static final ComponentRegistry<EntityStore> REGISTRY
public static final CodecKey<Holder<EntityStore>> HOLDER_CODEC_KEY
public static final SystemGroup<EntityStore> SEND_PACKET_GROUP
private final AtomicInteger networkIdCounter
private final World world
private Store<EntityStore> store
private final Map<UUID,Ref<EntityStore>> entitiesByUuid
private final Int2ReferenceMap<Ref<EntityStore>> networkIdToRef
