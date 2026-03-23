---
title: "PermissionHolder"
kind: "interface"
package: "com.hypixel.hytale.server.core.permissions"
fqcn: "com.hypixel.hytale.server.core.permissions.PermissionHolder"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "permissions"
---

**Package:** `com.hypixel.hytale.server.core.permissions`

```java
public interface PermissionHolder
```

Interface for entities that can hold and check permissions. Provides two overloads: one that checks a permission string, and one that additionally accepts a default value when the permission is not explicitly set.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `hasPermission(@Nonnull String var1)` | `boolean` | Checks whether this holder has the specified permission. |
| `hasPermission(@Nonnull String var1, boolean var2)` | `boolean` | Checks the permission, returning the given default if not explicitly set. |
