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

Known implementors: HytalePermissionsProvider

Also in this package: HytalePermissionsProvider

Complete API:
  String getName()
  void addUserPermissions(UUID var1, Set<String> var2)
  void removeUserPermissions(UUID var1, Set<String> var2)
  Set<String> getUserPermissions(UUID var1)
  void addGroupPermissions(String var1, Set<String> var2)
  void removeGroupPermissions(String var1, Set<String> var2)
  Set<String> getGroupPermissions(String var1)
  void addUserToGroup(UUID var1, String var2)
  void removeUserFromGroup(UUID var1, String var2)
  Set<String> getGroupsForUser(UUID var1)
