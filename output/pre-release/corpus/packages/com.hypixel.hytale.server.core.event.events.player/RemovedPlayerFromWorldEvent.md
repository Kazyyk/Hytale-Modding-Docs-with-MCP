# RemovedPlayerFromWorldEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: java.lang.Object | Implements: IEvent

public class RemovedPlayerFromWorldEvent implements IEvent<String>

Fired after a player entity has been removed from a world. Provides access to the entity holder, the world it was removed from, and the leave message. Listeners can suppress the broadcast leave message or replace it.

## Constructors


public RemovedPlayerFromWorldEvent(@Nonnull Holder<EntityStore> holder, @Nonnull World world, @Nullable Message leaveMessage)

## Methods


@Nonnull
public Holder<EntityStore> getHolder()

Returns the entity holder for the removed player.


@Nonnull
public World getWorld()

Returns the world the player was removed from.


public boolean shouldBroadcastLeaveMessage()

Returns whether the leave message should be broadcast to other players.


public void setBroadcastLeaveMessage(boolean broadcastLeaveMessage)

Sets whether to broadcast the leave message.


@Nullable
public Message getLeaveMessage()

Returns the leave message, or `null` if none.


public void setLeaveMessage(@Nullable Message leaveMessage)

Replaces the leave message.

## Related Types

- `AddPlayerToWorldEvent` -- the counterpart event for player addition
- `World` -- the world the player was removed from
- `EntityStore` -- store type parameter
