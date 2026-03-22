---
title: "FlyCameraModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.camera"
fqcn: "com.hypixel.hytale.server.core.modules.camera.FlyCameraModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "camera"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.camera`

```java
public class FlyCameraModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `setup()` |
| `private` | `void` | `handlePlayerPermissionsRemoved(PlayerPermissionChangeEvent.PermissionsRemoved event)` |
| `private` | `void` | `handlePlayerGroupRemoved(PlayerGroupEvent.Removed event)` |
| `private` | `void` | `handleGroupPermissionsRemoved(GroupPermissionChangeEvent.Removed event)` |
| `private` | `void` | `checkAndEnforceFlyCameraPermission(UUID uuid)` |
