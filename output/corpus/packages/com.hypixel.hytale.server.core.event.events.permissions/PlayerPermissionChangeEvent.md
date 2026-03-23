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
