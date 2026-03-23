---
title: "CameraShakeEffect"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset.cameraeffect"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.cameraeffect.CameraShakeEffect"
api_surface: false
extends: "CameraEffect"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "asset"
  - "cameraeffect"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.asset.cameraeffect`

```java
public class CameraShakeEffect extends CameraEffect
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable protected` | `String` | `cameraShakeId` |
| `protected` | `int` | `cameraShakeIndex` |
| `@Nullable protected` | `ShakeIntensity` | `intensity` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `AccumulationMode` | `getAccumulationMode()` |
| `public` | `float` | `getDefaultIntensityContext()` |
| `public` | `float` | `calculateIntensity(float intensityContext)` |
| `@Nonnull @Override public` | `com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect` | `createCameraShakePacket()` |
| `@Nonnull @Override public` | `com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect` | `createCameraShakePacket(float intensityContext)` |
| `@Nonnull @Override public` | `String` | `toString()` |
