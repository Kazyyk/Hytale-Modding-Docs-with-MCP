# PlayerGroupEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.permissions | Extends: PlayerPermissionChangeEvent

public class PlayerGroupEvent extends PlayerPermissionChangeEvent

## Fields

- @Nonnull private final String groupName

## Constructors

- public PlayerGroupEvent(@Nonnull UUID playerUuid, @Nonnull String groupName)

## Methods

- @Nonnull public String getGroupName()

## Inner Types

- `PlayerGroupEvent.Added`
- `PlayerGroupEvent.Removed`

Known subclasses: Added, Removed

Also in this package: Added, Added, GroupAdded, GroupPermissionChangeEvent, GroupRemoved, PermissionsAdded, PermissionsRemoved, PlayerPermissionChangeEvent, Removed, Removed

Complete API:
  public String getGroupName()

Fields:
private final String groupName
