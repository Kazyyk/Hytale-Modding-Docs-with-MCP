# KillFeedEvent.KillerMessage

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage.event | Extends: CancellableEcsEvent

public static final class KillFeedEvent.KillerMessage extends CancellableEcsEvent

A cancellable ECS event dispatched on the killer entity during kill feed generation. Allows systems listening on the killer to set a custom display message or cancel the kill feed entirely. If cancelled, no kill feed message is sent.

## Constructor


public KillerMessage(@Nonnull Damage damage, @Nonnull Ref<EntityStore> targetRef)

Creates the event with the killing damage and a reference to the killed entity.

## Methods


@Nonnull
public Damage getDamage()

Returns the Damage event that caused the kill.


@Nonnull
public Ref<EntityStore> getTargetRef()

Returns the reference to the killed entity.


public void setMessage(@Nullable Message message)

Sets the killer's display message for the kill feed.


@Nullable
public Message getMessage()

Returns the killer's display message, or `null` if not set.

## Related Types

- KillFeedEvent -- parent class
- DeathSystems.KillFeed -- dispatches this event
- Damage -- the killing damage
