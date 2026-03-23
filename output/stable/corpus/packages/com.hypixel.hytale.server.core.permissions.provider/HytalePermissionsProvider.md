# HytalePermissionsProvider

Type: class | Package: com.hypixel.hytale.server.core.permissions.provider | Extends: BlockingDiskFile | Implements: PermissionProvider

public final class HytalePermissionsProvider extends BlockingDiskFile implements PermissionProvider

Implementation of `PermissionProvider`.

## Fields

- DEFAULT_GROUP | String | Static final String field.
- OP_GROUP | String | Static final String field.
- PERMISSIONS_FILE_PATH | String | Static final String field.

## Constructors

- HytalePermissionsProvider() | Creates a new HytalePermissionsProvider instance.

## Methods

- getName() | String | public method.
- addUserPermissions(@Nonnull UUID uuid, @Nonnull Set<String> permissions) | void | public method.
- removeUserPermissions(@Nonnull UUID uuid, @Nonnull Set<String> permissions) | void | public method.
- getUserPermissions(@Nonnull UUID uuid) | Set<String> | public method.
- addGroupPermissions(@Nonnull String group, @Nonnull Set<String> permissions) | void | public method.
- removeGroupPermissions(@Nonnull String group, @Nonnull Set<String> permissions) | void | public method.
- getGroupPermissions(@Nonnull String group) | Set<String> | public method.
- addUserToGroup(@Nonnull UUID uuid, @Nonnull String group) | void | public method.
- removeUserFromGroup(@Nonnull UUID uuid, @Nonnull String group) | void | public method.
- getGroupsForUser(@Nonnull UUID uuid) | Set<String> | public method.
- read(@Nonnull BufferedReader fileReader) | void | protected method.
- write(@Nonnull BufferedWriter fileWriter) | void | protected method.
- create(@Nonnull BufferedWriter fileWriter) | void | protected method.
