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

Also in this package: PermissionProvider

Complete API:
  public String getName()
  public void addUserPermissions(UUID uuid, Set<String> permissions)
  public void removeUserPermissions(UUID uuid, Set<String> permissions)
  public Set<String> getUserPermissions(UUID uuid)
  public void addGroupPermissions(String group, Set<String> permissions)
  public void removeGroupPermissions(String group, Set<String> permissions)
  public Set<String> getGroupPermissions(String group)
  public void addUserToGroup(UUID uuid, String group)
  public void removeUserFromGroup(UUID uuid, String group)
  public Set<String> getGroupsForUser(UUID uuid)
  protected void read(BufferedReader fileReader)
  protected void write(BufferedWriter fileWriter)
  protected void create(BufferedWriter fileWriter)

Fields:
public static final String DEFAULT_GROUP
public static final Set<String> DEFAULT_GROUP_LIST
public static final String OP_GROUP
public static final Map<String,Set<String>> DEFAULT_GROUPS
private static final Gson GSON
public static final String PERMISSIONS_FILE_PATH
private final Map<UUID,Set<String>> userPermissions
private final Map<String,Set<String>> groupPermissions
private final Map<UUID,Set<String>> userGroups
