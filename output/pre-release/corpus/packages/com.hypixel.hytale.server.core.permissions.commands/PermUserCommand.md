# PermUserCommand

Type: class | Package: com.hypixel.hytale.server.core.permissions.commands | Extends: AbstractCommandCollection

public class PermUserCommand extends AbstractCommandCollection

Command collection under `perm user` for managing per-user permissions. Users are identified by UUID. Provides `list`, `add`, `remove` for direct permissions and a nested `group` subcommand for group membership management (`group list`, `group add`, `group remove`).

## Subcommands

- list: Lists all permissions for a user across all providers.
- add: Adds permissions to a user by UUID.
- remove: Removes permissions from a user by UUID.
- group: Nested collection: `list`/`add`/`remove` user group membership.

Also in this package: PermCommand, PermGroupAddCommand, PermGroupCommand, PermGroupListCommand, PermGroupRemoveCommand, PermTestCommand, PermUserAddCommand, PermUserGroupAddCommand, PermUserGroupCommand, PermUserGroupListCommand, PermUserGroupRemoveCommand, PermUserListCommand, PermUserRemoveCommand
