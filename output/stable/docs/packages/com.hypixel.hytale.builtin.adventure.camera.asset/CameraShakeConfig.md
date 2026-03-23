---
title: "CameraShakeConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.CameraShakeConfig"
api_surface: false
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.CameraShakeConfig>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "asset"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.asset`

```java
public class CameraShakeConfig implements NetworkSerializable<com.hypixel.hytale.protocol.CameraShakeConfig>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `duration` |
| `protected` | `Float` | `startTime` |
| `protected` | `EasingConfig` | `easeIn` |
| `protected` | `EasingConfig` | `easeOut` |
| `protected` | `CameraShakeConfig.OffsetNoise` | `offset` |
| `protected` | `CameraShakeConfig.RotationNoise` | `rotation` |
| `public static final` | `CameraShakeConfig.OffsetNoise` | `NONE` |
| `protected` | `NoiseConfig[]` | `x` |
| `protected` | `NoiseConfig[]` | `y` |
| `protected` | `NoiseConfig[]` | `z` |
| `public static final` | `CameraShakeConfig.RotationNoise` | `NONE` |
| `protected` | `NoiseConfig[]` | `pitch` |
| `protected` | `NoiseConfig[]` | `yaw` |
| `protected` | `NoiseConfig[]` | `roll` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.CameraShakeConfig` | `toPacket()` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.OffsetNoise` | `toPacket()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.RotationNoise` | `toPacket()` |

## Inner Types

- `CameraShakeConfig.OffsetNoise`
- `CameraShakeConfig.RotationNoise`
