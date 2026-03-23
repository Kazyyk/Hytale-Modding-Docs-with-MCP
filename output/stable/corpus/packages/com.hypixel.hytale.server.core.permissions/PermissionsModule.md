# PermissionsModule

Type: class | Package: com.hypixel.hytale.server.core.permissions | Extends: JavaPlugin

public class PermissionsModule extends JavaPlugin

Server module providing core functionality.

## Fields

- instance | PermissionsModule | Static PermissionsModule field.

## Constructors

- PermissionsModule(@Nonnull JavaPluginInit init) | Creates a new PermissionsModule instance.

## Methods

- get() | PermissionsModule | static public method.
- setup() | void | protected method.
- start() | void | protected method.
- addProvider(@Nonnull PermissionProvider permissionProvider) | void | public method.
- removeProvider(@Nonnull PermissionProvider provider) | void | public method.
- getProviders() | List<PermissionProvider> | public method.
- getFirstPermissionProvider() | PermissionProvider | public method.
- areProvidersTampered() | boolean | public method.
- addUserPermission(@Nonnull UUID uuid, @Nonnull Set<String> permissions) | void | public method.
- removeUserPermission(@Nonnull UUID uuid, @Nonnull Set<String> permissions) | void | public method.
- addGroupPermission(@Nonnull String group, @Nonnull Set<String> permissions) | void | public method.
- removeGroupPermission(@Nonnull String group, @Nonnull Set<String> permissions) | void | public method.
- addUserToGroup(@Nonnull UUID uuid, @Nonnull String group) | void | public method.
- removeUserFromGroup(@Nonnull UUID uuid, @Nonnull String group) | void | public method.
- setVirtualGroups(@Nonnull Map<String, Set<String>> virtualGroups) | void | public method.
- getGroupsForUser(@Nonnull UUID uuid) | Set<String> | public method.
- hasPermission(@Nonnull UUID uuid, @Nonnull String id) | boolean | public method.
- hasPermission(@Nonnull UUID uuid, @Nonnull String id, boolean def) | boolean | public method.
- hasPermission(@Nullable Set<String> nodes, @Nonnull String id) | Boolean | static public method.
