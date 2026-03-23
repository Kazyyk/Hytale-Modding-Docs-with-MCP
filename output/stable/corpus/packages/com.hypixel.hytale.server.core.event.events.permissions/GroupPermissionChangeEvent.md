# GroupPermissionChangeEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.permissions | Implements: IEvent<Void>

public abstract class GroupPermissionChangeEvent implements IEvent<Void>

## Fields

- @Nonnull private final String groupName

## Constructors

- protected GroupPermissionChangeEvent(@Nonnull String groupName)

## Methods

- @Nonnull public String getGroupName()

## Inner Types

- `GroupPermissionChangeEvent.Added`
- `GroupPermissionChangeEvent.Removed`

Known subclasses: Added, Removed

Also in this package: Added, Added, GroupAdded, GroupRemoved, PermissionsAdded, PermissionsRemoved, PlayerGroupEvent, PlayerPermissionChangeEvent, Removed, Removed

Complete API:
  public String getGroupName()

Fields:
private final String groupName
