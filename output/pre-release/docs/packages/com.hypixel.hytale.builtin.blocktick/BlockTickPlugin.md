---
title: "BlockTickPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.blocktick"
fqcn: "com.hypixel.hytale.builtin.blocktick.BlockTickPlugin"
api_surface: false
extends: "JavaPlugin"
implements: ["IBlockTickProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "blocktick"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.blocktick`

```java
public class BlockTickPlugin extends JavaPlugin implements IBlockTickProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `BlockTickPlugin` | `instance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BlockTickPlugin` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `@Override public` | `TickProcedure` | `getTickProcedure(int blockId)` |
| `private` | `void` | `discoverTickingBlocks(ChunkPreLoadProcessEvent event)` |
| `public` | `int` | `discoverTickingBlocks(Holder<ChunkStore> holder, WorldChunk worldChunk)` |

## Inner Types

- [BlockTickPlugin.Preprocessor](BlockTickPlugin.Preprocessor.md) -- thread-local helper for collecting ticking block IDs and indices during chunk processing
