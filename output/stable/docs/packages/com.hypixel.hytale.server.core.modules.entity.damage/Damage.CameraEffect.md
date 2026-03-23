---
title: "Damage.CameraEffect"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.CameraEffect"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "camera"
  - "visual"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public record Damage.CameraEffect(int cameraEffectIndex)
```

A record wrapping a camera effect asset index, attached to a [Damage](Damage.md) event via the `Damage.CAMERA_EFFECT` meta key. Used to trigger camera shake or other visual feedback when an entity takes damage.

## Record Components

| Component | Type | Description |
|---|---|---|
| `cameraEffectIndex` | `int` | Index into the camera effect asset map. |

## Methods

```java
public int getEffectIndex()
```

Returns the camera effect asset index. Equivalent to `cameraEffectIndex()`.

## Related Types

- [Damage](Damage.md) -- the damage event that carries camera effects via meta store
