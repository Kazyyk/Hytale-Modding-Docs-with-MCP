---
title: "CopyCutSettings"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.CopyCutSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "clipboard"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class CopyCutSettings
```

Defines bitflag constants that control what data is included in copy/cut clipboard operations. Flags are combined with bitwise OR to specify which elements (blocks, entities, fluids, etc.) are copied or cut.

## Constants

| Constant | Value | Description |
|---|---|---|
| `NONE` | `0` | No flags set. |
| `CUT` | `2` | Cut mode -- clears the source region after copying. |
| `EMPTY` | `4` | Include empty/air blocks in the clipboard. |
| `BLOCKS` | `8` | Include block data in the clipboard. |
| `ENTITIES` | `16` | Include entities in the clipboard. |
| `TINT_MAP` | `32` | Include tint color data in the clipboard. |
| `KEEP_ANCHORS` | `64` | Preserve prefab anchor entities during the operation. |
| `FLUIDS` | `128` | Include fluid data in the clipboard. |

## Usage

These flags are passed to `BuilderState.copyOrCut()` and related clipboard methods. Commands like `CopyCommand` and `CutCommand` compose the appropriate flag combination based on their command-line flags (e.g., `--noEntities`, `--onlyEntities`, `--empty`, `--keepanchors`).

## Related Types

- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- uses these flags in copy/cut operations
- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- owns the builder state that performs clipboard operations
