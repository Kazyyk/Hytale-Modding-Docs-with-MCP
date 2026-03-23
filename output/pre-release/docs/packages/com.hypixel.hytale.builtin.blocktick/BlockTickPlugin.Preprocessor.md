---
title: "BlockTickPlugin.Preprocessor"
kind: "class"
package: "com.hypixel.hytale.builtin.blocktick"
fqcn: "com.hypixel.hytale.builtin.blocktick.BlockTickPlugin.Preprocessor"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "blocktick"
  - "utility"
---

**Package:** `com.hypixel.hytale.builtin.blocktick`

```java
public static final class BlockTickPlugin.Preprocessor
```

Thread-local helper used by `BlockTickPlugin.discoverTickingBlocks` to collect block type IDs that have a tick procedure and then find all block indices matching those IDs within a section. Avoids per-call allocation by storing instances in a `ThreadLocal`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ThreadLocal<BlockTickPlugin.Preprocessor>` | `LOCAL` |
| `public final` | `IntList` | `tickingIds` |
| `public final` | `IntList` | `tickingIndices` |
| `public final` | `IntConsumer` | `typeCollector` |
| `public final` | `IntConsumer` | `indexCollector` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `clear()` |

## Behavior

- `typeCollector` checks each block ID against `BlockType.getAssetMap()` and adds the ID to `tickingIds` if the block type has a non-null `TickProcedure`.
- `indexCollector` adds matching block indices to `tickingIndices`.
- `clear()` empties both `tickingIds` and `tickingIndices` lists for reuse.
- Accessed via `LOCAL.get()` to obtain the thread-local instance.

## Related Types

- [BlockTickPlugin](BlockTickPlugin.md) -- the enclosing plugin that uses this preprocessor
