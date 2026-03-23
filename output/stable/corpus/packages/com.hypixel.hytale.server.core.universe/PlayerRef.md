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
