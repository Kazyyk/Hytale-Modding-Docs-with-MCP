# PermissionProvider

Type: interface | Package: com.hypixel.hytale.server.core.permissions.provider

public interface PermissionProvider

Interface defining: `getName()`, `addUserPermissions()`, `removeUserPermissions()`, `getUserPermissions()`....

## Methods

- getName() | String | package-private method.
- addUserPermissions(@Nonnull UUID var1, @Nonnull Set<String> var2) | void | package-private method.
- removeUserPermissions(@Nonnull UUID var1, @Nonnull Set<String> var2) | void | package-private method.
- getUserPermissions(@Nonnull UUID var1) | Set<String> | package-private method.
- addGroupPermissions(@Nonnull String var1, @Nonnull Set<String> var2) | void | package-private method.
- removeGroupPermissions(@Nonnull String var1, @Nonnull Set<String> var2) | void | package-private method.
- getGroupPermissions(@Nonnull String var1) | Set<String> | package-private method.
- addUserToGroup(@Nonnull UUID var1, @Nonnull String var2) | void | package-private method.
- removeUserFromGroup(@Nonnull UUID var1, @Nonnull String var2) | void | package-private method.
- getGroupsForUser(@Nonnull UUID var1) | Set<String> | package-private method.
