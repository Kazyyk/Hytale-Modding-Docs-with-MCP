---
title: "BlockMountPoint"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints.BlockMountPoint"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "blocktype"
  - "config"
  - "mountpoints"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints`

```java
public class BlockMountPoint
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<BlockMountPoint>` | `CODEC` |
| `public static final` | `BlockMountPoint[]` | `EMPTY_ARRAY` |
| `private` | `Vector3f` | `offset` |
| `private` | `float` | `yawOffSetDegrees` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3f` | `getOffset()` |
| `public` | `float` | `getYawOffSetDegrees()` |
| `@Nonnull public` | `BlockMountPoint` | `rotate(Rotation yaw, Rotation pitch, Rotation roll)` |
| `@Nonnull public` | `Vector3f` | `computeWorldSpacePosition(Vector3i blockLoc)` |
| `@Nonnull public` | `Vector3f` | `computeRotationEuler(int rotationIndex)` |
