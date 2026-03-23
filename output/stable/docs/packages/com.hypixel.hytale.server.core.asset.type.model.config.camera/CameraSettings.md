---
title: "CameraSettings"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config.camera"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.camera.CameraSettings"
api_surface: true
extends: null
implements: ["NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "model"
  - "config"
  - "camera"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config.camera`

```java
public class CameraSettings implements NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CameraSettings>` | `CODEC` |
| `protected` | `Vector3f` | `positionOffset` |
| `protected` | `CameraAxis` | `yaw` |
| `protected` | `CameraAxis` | `pitch` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.CameraSettings` | `toPacket()` |
| `public` | `Vector3f` | `getPositionOffset()` |
| `public` | `CameraAxis` | `getYaw()` |
| `public` | `CameraAxis` | `getPitch()` |
| `public` | `CameraSettings` | `scale(float scale)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public` | `CameraSettings` | `clone()` |
