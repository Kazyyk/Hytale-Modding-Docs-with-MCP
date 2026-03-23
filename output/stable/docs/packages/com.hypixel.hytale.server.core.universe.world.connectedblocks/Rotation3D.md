---
title: "Rotation3D"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.Rotation3D"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "universe"
  - "world"
  - "connectedblocks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.connectedblocks`

```java
public class Rotation3D
```

Represents a 3D rotation state for connected block face evaluation.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `assign(Rotation yaw, Rotation pitch, Rotation roll)` |
| `public` | `void` | `assign(@Nonnull RotationTuple rotation)` |
| `public` | `void` | `add(@Nonnull Rotation3D toAdd)` |
| `public` | `void` | `subtract(@Nonnull Rotation3D toSubtract)` |
| `public` | `void` | `negate()` |
| `public` | `Rotation3D` | `rotateSelfBy(@Nonnull Rotation rotationYawToRotate, @Nonnull Rotation rotationPitchToRotate, @Nonnull Rotation rotationRollToRotate)` |
| `public` | `void` | `rotateSelfBy(@Nonnull Rotation3D rotation)` |
