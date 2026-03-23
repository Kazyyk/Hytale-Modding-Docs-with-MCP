---
title: "CameraDemo"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player.camera"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.camera.CameraDemo"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "player"
  - "camera"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.player.camera`

```java
public class CameraDemo
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CameraDemo` | `INSTANCE` |
| `private final` | `EventRegistry` | `eventRegistry` |
| `private final` | `ServerCameraSettings` | `cameraSettings` |
| `private` | `boolean` | `isActive` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `activate()` |
| `public` | `void` | `deactivate()` |
| `private` | `void` | `onAddNewPlayer(@Nonnull PlayerRef player)` |
| `private` | `void` | `onPlayerMouseButton(@Nonnull PlayerMouseButtonEvent event)` |
| `@Nonnull private static` | `ServerCameraSettings` | `createServerCameraSettings()` |
