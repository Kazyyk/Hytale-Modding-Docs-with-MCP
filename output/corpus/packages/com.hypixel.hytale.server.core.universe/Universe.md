# Universe

Type: class | Package: com.hypixel.hytale.server.core.universe | Extends: JavaPlugin | Implements: IMessageReceiver, MetricProvider

public class Universe extends JavaPlugin implements IMessageReceiver, MetricProvider

The central singleton managing the server universe. Handles world creation, loading, and removal; player connection lifecycle; player storage; plugin management; and server backup operations. Maintains maps of connected players and loaded worlds.

## Methods


public static Universe get()

Returns the singleton instance.


@Nonnull
public ComponentType<EntityStore, PlayerRef> getPlayerRefComponentType()


public int getPlayerCount()


@Nonnull
public Map<String, World> getWorlds()
