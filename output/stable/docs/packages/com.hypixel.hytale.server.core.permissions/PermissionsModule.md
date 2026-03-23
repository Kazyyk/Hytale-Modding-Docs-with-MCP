---
title: "PermissionsModule"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions"
fqcn: "com.hypixel.hytale.server.core.permissions.PermissionsModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "permissions"
---

**Package:** `com.hypixel.hytale.server.core.permissions`

```java
public class PermissionsModule extends JavaPlugin
```

Server module providing core functionality.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `PermissionsModule` | Static PermissionsModule field. |

## Constructors

| Constructor | Description |
|---|---|
| `PermissionsModule(@Nonnull JavaPluginInit init)` | Creates a new PermissionsModule instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `PermissionsModule` | static public method. |
| `setup()` | `void` | protected method. |
| `start()` | `void` | protected method. |
| `addProvider(@Nonnull PermissionProvider permissionProvider)` | `void` | public method. |
| `removeProvider(@Nonnull PermissionProvider provider)` | `void` | public method. |
| `getProviders()` | `List<PermissionProvider>` | public method. |
| `getFirstPermissionProvider()` | `PermissionProvider` | public method. |
| `areProvidersTampered()` | `boolean` | public method. |
| `addUserPermission(@Nonnull UUID uuid, @Nonnull Set<String> permissions)` | `void` | public method. |
| `removeUserPermission(@Nonnull UUID uuid, @Nonnull Set<String> permissions)` | `void` | public method. |
| `addGroupPermission(@Nonnull String group, @Nonnull Set<String> permissions)` | `void` | public method. |
| `removeGroupPermission(@Nonnull String group, @Nonnull Set<String> permissions)` | `void` | public method. |
| `addUserToGroup(@Nonnull UUID uuid, @Nonnull String group)` | `void` | public method. |
| `removeUserFromGroup(@Nonnull UUID uuid, @Nonnull String group)` | `void` | public method. |
| `setVirtualGroups(@Nonnull Map<String, Set<String>> virtualGroups)` | `void` | public method. |
| `getGroupsForUser(@Nonnull UUID uuid)` | `Set<String>` | public method. |
| `hasPermission(@Nonnull UUID uuid, @Nonnull String id)` | `boolean` | public method. |
| `hasPermission(@Nonnull UUID uuid, @Nonnull String id, boolean def)` | `boolean` | public method. |
| `hasPermission(@Nullable Set<String> nodes, @Nonnull String id)` | `Boolean` | static public method. |
