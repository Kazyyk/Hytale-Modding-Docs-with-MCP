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

Also in this package: HytalePermissions, PermissionHolder

Complete API:
  public static PermissionsModule get()
  protected void setup()
  protected void start()
  public void addProvider(PermissionProvider permissionProvider)
  public void removeProvider(PermissionProvider provider)
  public List<PermissionProvider> getProviders()
  public PermissionProvider getFirstPermissionProvider()
  public boolean areProvidersTampered()
  public void addUserPermission(UUID uuid, Set<String> permissions)
  public void removeUserPermission(UUID uuid, Set<String> permissions)
  public void addGroupPermission(String group, Set<String> permissions)
  public void removeGroupPermission(String group, Set<String> permissions)
  public void addUserToGroup(UUID uuid, String group)
  public void removeUserFromGroup(UUID uuid, String group)
  public void setVirtualGroups(Map<String,Set<String>> virtualGroups)
  public Set<String> getGroupsForUser(UUID uuid)
  public boolean hasPermission(UUID uuid, String id)
  public boolean hasPermission(UUID uuid, String id, boolean def)
  public static Boolean hasPermission(Set<String> nodes, String id)

Fields:
public static final PluginManifest MANIFEST
private static PermissionsModule instance
private final HytalePermissionsProvider standardProvider
private Map<String,Set<String>> virtualGroups
private final List<PermissionProvider> providers
