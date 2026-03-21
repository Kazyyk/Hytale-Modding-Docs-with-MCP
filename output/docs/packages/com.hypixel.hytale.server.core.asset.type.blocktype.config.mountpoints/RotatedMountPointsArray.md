---
title: "RotatedMountPointsArray"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints.RotatedMountPointsArray"
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
public class RotatedMountPointsArray
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `ArrayCodec<BlockMountPoint>` | `CHILD` |
| `public static final` | `Codec<RotatedMountPointsArray>` | `CODEC` |
| `private` | `BlockMountPoint[]` | `raw` |
| `private transient` | `BlockMountPoint[][]` | `rotated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `size()` |
| `public` | `BlockMountPoint[]` | `getRaw()` |
| `@Nullable public` | `BlockMountPoint[]` | `getRotated(int rotationIndex)` |
