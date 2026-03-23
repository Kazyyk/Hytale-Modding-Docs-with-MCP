# KillFeedEvent.DecedentMessage

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage.event | Extends: CancellableEcsEvent

public static final class KillFeedEvent.DecedentMessage extends CancellableEcsEvent

A cancellable ECS event dispatched on the dying entity during kill feed generation. Allows systems listening on the victim to set a custom display message or cancel the kill feed entry for the decedent. If cancelled, no kill feed message is sent.

## Constructor


public DecedentMessage(@Nonnull Damage damage)

Creates the event with the killing damage.

## Methods


public Damage getDamage()

Returns the Damage event that caused the kill.


public void setMessage(@Nullable Message message)

Sets the victim's display message for the kill feed.


@Nullable
public Message getMessage()

Returns the victim's display message, or `null` if not set.

## Related Types

- KillFeedEvent -- parent class
- DeathSystems.KillFeed -- dispatches this event
- Damage -- the killing damage

Also in this package: Display, KillFeedEvent, KillerMessage

Complete API:
  public Damage getDamage()
  public void setMessage(Message message)
  public Message getMessage()

Fields:
private final Damage damage
private Message message
