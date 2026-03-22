---
title: "BlockFluidEntry"
kind: "record"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.BlockFluidEntry"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "record"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
@Deprecated
public record BlockFluidEntry(int blockId, int rotation, int fluidId)
```

An immutable record holding `blockId`, `rotation`, `fluidId`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BlockFluidEntry[]` | `EMPTY_ARRAY` | `new BlockFluidEntry[0]` |
| `public static final` | `BlockFluidEntry` | `EMPTY` | `new BlockFluidEntry(0, 0, 0)` |

## Components

| Type | Name |
|---|---|
| `int` | `blockId` |
| `int` | `rotation` |
| `int` | `fluidId` |

