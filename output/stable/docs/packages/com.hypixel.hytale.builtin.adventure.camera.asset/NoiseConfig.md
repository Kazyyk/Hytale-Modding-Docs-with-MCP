---
title: "NoiseConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.NoiseConfig"
api_surface: false
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.NoiseConfig>"]
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
public class NoiseConfig implements NetworkSerializable<com.hypixel.hytale.protocol.NoiseConfig>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `com.hypixel.hytale.protocol.NoiseConfig[]` | `NOISE_CONFIGS` |
| `protected` | `int` | `seed` |
| `protected` | `NoiseType` | `type` |
| `protected` | `NoiseConfig.ClampConfig` | `clamp` |
| `protected` | `float` | `frequency` |
| `protected` | `float` | `amplitude` |
| `public static final` | `NoiseConfig.ClampConfig` | `NONE` |
| `protected` | `float` | `min` |
| `protected` | `float` | `max` |
| `protected` | `boolean` | `normalize` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.NoiseConfig` | `toPacket()` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Nonnull public static` | `com.hypixel.hytale.protocol.NoiseConfig[]` | `toPacket(@Nullable NoiseConfig[] configs)` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.ClampConfig` | `toPacket()` |

## Inner Types

- `NoiseConfig.ClampConfig`
