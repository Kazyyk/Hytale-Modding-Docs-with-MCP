---
title: "BlockMountAPI.Mounted"
kind: "record"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.BlockMountAPI.Mounted"
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
public record Mounted(BlockType blockType, MountedComponent component) implements BlockMountAPI.BlockMountResult
```

Success result returned by [BlockMountAPI.mountOnBlock()](BlockMountAPI.md) when an entity is successfully seated on a block.

## Record Components

| Component | Type | Description |
|---|---|---|
| `blockType` | `BlockType` | The block type the entity was mounted onto. |
| `component` | [MountedComponent](MountedComponent.md) | The `MountedComponent` that was added to the entity. |

## Related Types

- [BlockMountAPI](BlockMountAPI.md) -- enclosing class
- [BlockMountAPI.BlockMountResult](BlockMountAPI.BlockMountResult.md) -- sealed parent interface
