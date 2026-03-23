---
title: "BlockMountAPI.BlockMountResult"
kind: "sealed interface"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.BlockMountAPI.BlockMountResult"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public sealed interface BlockMountResult permits BlockMountAPI.Mounted, BlockMountAPI.DidNotMount
```

Sealed result type returned by [BlockMountAPI.mountOnBlock()](BlockMountAPI.md). Permits exactly two implementations:

- [Mounted](BlockMountAPI.Mounted.md) -- successful mount
- [DidNotMount](BlockMountAPI.DidNotMount.md) -- failure with a specific reason

## Related Types

- [BlockMountAPI](BlockMountAPI.md) -- enclosing class
