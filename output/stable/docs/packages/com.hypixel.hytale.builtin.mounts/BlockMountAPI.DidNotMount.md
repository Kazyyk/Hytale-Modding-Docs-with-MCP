---
title: "BlockMountAPI.DidNotMount"
kind: "enum"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.BlockMountAPI.DidNotMount"
api_surface: false
extends: ~
implements:
  - "BlockMountAPI.BlockMountResult"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static enum DidNotMount implements BlockMountAPI.BlockMountResult
```

Enum of failure reasons returned by [BlockMountAPI.mountOnBlock()](BlockMountAPI.md) when a mount attempt does not succeed.

## Enum Constants

| Constant | Description |
|---|---|
| `CHUNK_NOT_FOUND` | The world chunk containing the target block is not in memory. |
| `CHUNK_REF_NOT_FOUND` | The chunk reference or `BlockComponentChunk` could not be resolved. |
| `BLOCK_REF_NOT_FOUND` | A new chunk-store entity reference for the block could not be created. |
| `INVALID_BLOCK` | The `BlockType` at the target position is null. |
| `ALREADY_MOUNTED` | The entity already has a `MountedComponent`. |
| `UNKNOWN_BLOCKMOUNT_TYPE` | The block has neither seats nor beds configured. |
| `NO_MOUNT_POINT_FOUND` | No available (unoccupied) mount point exists on the block. |

## Related Types

- [BlockMountAPI](BlockMountAPI.md) -- enclosing class
- [BlockMountAPI.BlockMountResult](BlockMountAPI.BlockMountResult.md) -- sealed parent interface
