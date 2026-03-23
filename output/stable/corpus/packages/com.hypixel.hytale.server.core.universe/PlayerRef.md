# PlayerRef

Type: class | Package: com.hypixel.hytale.server.core.universe | Implements: Component<EntityStore>, MetricProvider, IMessageReceiver

public class PlayerRef implements Component<EntityStore>, MetricProvider, IMessageReceiver

Represents a connected player's server-side reference. Acts as the bridge between the network layer (`PacketHandler`), the entity system (`Ref<EntityStore>`), and player-facing features. Tracks UUID, username, language, transform, chunk tracker, hidden players, and metrics.

## Methods


@Nonnull
public static ComponentType<EntityStore, PlayerRef> getComponentType()


@Nullable
public Ref<EntityStore> addToStore(@Nonnull Store<EntityStore> store)


@Nonnull
public Holder<EntityStore> removeFromStore()


public boolean isValid()


@Nullable
public Ref<EntityStore> getReference()


@Nonnull
public UUID getUuid()


@Nonnull
public String getUsername()


@Nonnull
public PacketHandler getPacketHandler()


@Nonnull
public ChunkTracker getChunkTracker()


@Nonnull
public HiddenPlayersManager getHiddenPlayersManager()


@Nonnull
public String getLanguage()


public void setLanguage(@Nonnull String language)


public void referToServer(@Nonnull String host, int port)

Sends a referral packet directing the client to connect to another server.


public void referToServer(@Nonnull String host, int port, @Nullable byte[] data)


@Override
public void sendMessage(@Nonnull Message message)

Also in this package: Universe, WorldLoadCancelledException

Complete API:
  public static ComponentType<EntityStore,PlayerRef> getComponentType()
  public Ref<EntityStore> addToStore(Store<EntityStore> store)
  public void addedToStore(Ref<EntityStore> ref)
  public Holder<EntityStore> removeFromStore()
  public boolean isValid()
  public Ref<EntityStore> getReference()
  public Holder<EntityStore> getHolder()
  public T getComponent(ComponentType<EntityStore,T> componentType)
  public UUID getUuid()
  public String getUsername()
  public PacketHandler getPacketHandler()
  public ChunkTracker getChunkTracker()
  public HiddenPlayersManager getHiddenPlayersManager()
  public String getLanguage()
  public void setLanguage(String language)
  public Transform getTransform()
  public UUID getWorldUuid()
  public Vector3f getHeadRotation()
  public void updatePosition(World world, Transform transform, Vector3f headRotation)
  public void replaceHolder(Holder<EntityStore> holder)
  public Component<EntityStore> clone()
  public MetricResults toMetricResults()
  public void referToServer(String host, int port)
  public void referToServer(String host, int port, byte[] data)
  public void sendMessage(Message message)

Fields:
public static final MetricsRegistry<PlayerRef> METRICS_REGISTRY
public static final MetricsRegistry<PlayerRef> COMPONENT_METRICS_REGISTRY
private static final HytaleLogger LOGGER
private final UUID uuid
private final String username
private final PacketHandler packetHandler
private final ChunkTracker chunkTracker
private final HiddenPlayersManager hiddenPlayersManager
private String language
private Ref<EntityStore> entity
private Holder<EntityStore> holder
private UUID worldUuid
private Transform transform
private Vector3f headRotation
