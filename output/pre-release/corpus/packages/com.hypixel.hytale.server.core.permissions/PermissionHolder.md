# PermissionHolder

Type: interface | Package: com.hypixel.hytale.server.core.permissions

public interface PermissionHolder

Interface for entities that can hold and check permissions. Provides two overloads: one that checks a permission string, and one that additionally accepts a default value when the permission is not explicitly set.

## Methods

- hasPermission(@Nonnull String var1) | boolean | Checks whether this holder has the specified permission.
- hasPermission(@Nonnull String var1, boolean var2) | boolean | Checks the permission, returning the given default if not explicitly set.

Known implementors: CommandSender, EditorClient, Player

Also in this package: HytalePermissions, PermissionsModule

Complete API:
  boolean hasPermission(String var1)
  boolean hasPermission(String var1, boolean var2)
