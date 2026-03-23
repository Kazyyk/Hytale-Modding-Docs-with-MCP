---
title: "HytalePermissionsProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.provider"
fqcn: "com.hypixel.hytale.server.core.permissions.provider.HytalePermissionsProvider"
api_surface: false
extends: "BlockingDiskFile"
implements: 
  - "PermissionProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "permissions"
---

**Package:** `com.hypixel.hytale.server.core.permissions.provider`

```java
public final class HytalePermissionsProvider extends BlockingDiskFile implements PermissionProvider
```

Implementation of `PermissionProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_GROUP` | `String` | Static final String field. |
| `OP_GROUP` | `String` | Static final String field. |
| `PERMISSIONS_FILE_PATH` | `String` | Static final String field. |

## Constructors

| Constructor | Description |
|---|---|
| `HytalePermissionsProvider()` | Creates a new HytalePermissionsProvider instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getName()` | `String` | public method. |
| `addUserPermissions(@Nonnull UUID uuid, @Nonnull Set<String> permissions)` | `void` | public method. |
| `removeUserPermissions(@Nonnull UUID uuid, @Nonnull Set<String> permissions)` | `void` | public method. |
| `getUserPermissions(@Nonnull UUID uuid)` | `Set<String>` | public method. |
| `addGroupPermissions(@Nonnull String group, @Nonnull Set<String> permissions)` | `void` | public method. |
| `removeGroupPermissions(@Nonnull String group, @Nonnull Set<String> permissions)` | `void` | public method. |
| `getGroupPermissions(@Nonnull String group)` | `Set<String>` | public method. |
| `addUserToGroup(@Nonnull UUID uuid, @Nonnull String group)` | `void` | public method. |
| `removeUserFromGroup(@Nonnull UUID uuid, @Nonnull String group)` | `void` | public method. |
| `getGroupsForUser(@Nonnull UUID uuid)` | `Set<String>` | public method. |
| `read(@Nonnull BufferedReader fileReader)` | `void` | protected method. |
| `write(@Nonnull BufferedWriter fileWriter)` | `void` | protected method. |
| `create(@Nonnull BufferedWriter fileWriter)` | `void` | protected method. |
