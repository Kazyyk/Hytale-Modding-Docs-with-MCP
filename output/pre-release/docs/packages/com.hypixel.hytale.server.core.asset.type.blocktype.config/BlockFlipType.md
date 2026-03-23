---
title: "BlockFlipType"
kind: "enum"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockFlipType"
api_surface: true
extends: "java.lang.Enum"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "blocktype"
  - "rotation"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config`

```java
public enum BlockFlipType
```

Defines how a block's yaw rotation is transformed when the block is flipped along an axis. Used by the block placement and editor systems to compute correct rotations after mirroring operations.

## Enum Constants

| Constant | Description |
|---|---|
| `ORTHOGONAL` | Standard orthogonal flip behavior |
| `ORTHOGONAL_INVERSE` | Inverse orthogonal flip behavior |
| `SYMMETRIC` | Symmetric flip (adds 180 degrees when aligned on the flip axis) |

## Methods

```java
public Rotation flipYaw(@Nonnull Rotation rotation, Axis axis)
```

Computes the new yaw [Rotation](Rotation.md) after flipping along the given axis.

## Related Types

- [Rotation](Rotation.md) -- rotation enum used for yaw/pitch/roll
- [RotationTuple](RotationTuple.md) -- uses this during flip operations
