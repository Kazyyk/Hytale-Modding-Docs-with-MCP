# KillFeedEvent.Display

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage.event | Extends: CancellableEcsEvent

public static final class KillFeedEvent.Display extends CancellableEcsEvent

A cancellable ECS event dispatched on the dying entity as the final step of kill feed generation. Controls which players receive the kill feed message and what icon is displayed. If cancelled, no packets are sent.

## Constructor


public Display(@Nonnull Damage damage, @Nullable String icon, @Nonnull List<PlayerRef> broadcastTargets)

Creates the display event with the killing damage, an optional death icon, and the list of players to broadcast to.

## Methods


@Nonnull
public List<PlayerRef> getBroadcastTargets()

Returns the mutable list of players who will receive the kill feed message.


@Nonnull
public Damage getDamage()

Returns the Damage event that caused the kill.


@Nullable
public String getIcon()

Returns the kill feed icon identifier, or `null`.


public void setIcon(@Nullable String icon)

Sets the kill feed icon identifier.

## Related Types

- KillFeedEvent -- parent class
- DeathSystems.KillFeed -- dispatches this event
- Damage -- reads `DEATH_ICON` meta key for the default icon

Also in this package: DecedentMessage, KillFeedEvent, KillerMessage

Complete API:
  public List<PlayerRef> getBroadcastTargets()
  public Damage getDamage()
  public String getIcon()
  public void setIcon(String icon)

Fields:
private final Damage damage
private String icon
private final List<PlayerRef> broadcastTargets
