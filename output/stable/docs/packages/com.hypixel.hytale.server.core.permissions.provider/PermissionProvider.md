---
title: "PermissionProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.permissions.provider"
fqcn: "com.hypixel.hytale.server.core.permissions.provider.PermissionProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "permissions"
---

**Package:** `com.hypixel.hytale.server.core.permissions.provider`

```java
public interface PermissionProvider
```

Interface defining: `getName()`, `addUserPermissions()`, `removeUserPermissions()`, `getUserPermissions()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getName()` | `String` | package-private method. |
| `addUserPermissions(@Nonnull UUID var1, @Nonnull Set<String> var2)` | `void` | package-private method. |
| `removeUserPermissions(@Nonnull UUID var1, @Nonnull Set<String> var2)` | `void` | package-private method. |
| `getUserPermissions(@Nonnull UUID var1)` | `Set<String>` | package-private method. |
| `addGroupPermissions(@Nonnull String var1, @Nonnull Set<String> var2)` | `void` | package-private method. |
| `removeGroupPermissions(@Nonnull String var1, @Nonnull Set<String> var2)` | `void` | package-private method. |
| `getGroupPermissions(@Nonnull String var1)` | `Set<String>` | package-private method. |
| `addUserToGroup(@Nonnull UUID var1, @Nonnull String var2)` | `void` | package-private method. |
| `removeUserFromGroup(@Nonnull UUID var1, @Nonnull String var2)` | `void` | package-private method. |
| `getGroupsForUser(@Nonnull UUID var1)` | `Set<String>` | package-private method. |
