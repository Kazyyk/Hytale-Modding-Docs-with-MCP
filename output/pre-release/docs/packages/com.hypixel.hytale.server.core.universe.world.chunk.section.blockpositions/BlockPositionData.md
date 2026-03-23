---
title: "BlockPositionData"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions.BlockPositionData"
api_surface: false
extends: null
implements: ["IBlockPositionData"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "chunk"
  - "section"
  - "blockpositions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions`

```java
public class BlockPositionData implements IBlockPositionData
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `double` | `HALF_BLOCK` |
| `private` | `int` | `blockIndex` |
| `private` | `ChunkSectionReference` | `section` |
| `private` | `int` | `blockType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `BlockSection` | `getChunkSection()` |
| `@Override public` | `int` | `getBlockType()` |
| `@Override public` | `int` | `getX()` |
| `@Override public` | `int` | `getY()` |
| `@Override public` | `int` | `getZ()` |
| `@Override public` | `double` | `getXCentre()` |
| `@Override public` | `double` | `getYCentre()` |
| `@Override public` | `double` | `getZCentre()` |
