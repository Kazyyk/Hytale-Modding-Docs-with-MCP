# PlayerPermissionChangeEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.permissions | Implements: IEvent<Void>

public abstract class PlayerPermissionChangeEvent implements IEvent<Void>

## Fields

- @Nonnull private final UUID playerUuid

## Constructors

- protected PlayerPermissionChangeEvent(@Nonnull UUID playerUuid)

## Methods

- @Nonnull public UUID getPlayerUuid()

## Inner Types

- `PlayerPermissionChangeEvent.GroupAdded`
- `PlayerPermissionChangeEvent.GroupRemoved`
- `PlayerPermissionChangeEvent.PermissionsAdded`
- `PlayerPermissionChangeEvent.PermissionsRemoved`

Known subclasses: GroupAdded, GroupRemoved, PermissionsAdded, PermissionsRemoved, PlayerGroupEvent

Also in this package: Added, Added, GroupAdded, GroupPermissionChangeEvent, GroupRemoved, PermissionsAdded, PermissionsRemoved, PlayerGroupEvent, Removed, Removed

Complete API:
  public UUID getPlayerUuid()

Fields:
private final UUID playerUuid
