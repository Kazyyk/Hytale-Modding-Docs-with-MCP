---
title: "BufferBundle.Tracker"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.Tracker"
api_surface: false
extends: null
implements: ["MemInstrument"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

```java
public static class BufferBundle.Tracker implements MemInstrument
```

Tracks which generation stage last wrote to a buffer column. Used by `StagedChunkGenerator` to determine whether a buffer column's data is already up to date for a given stage, enabling cache-based skipping of redundant generation work.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public final` | `int` | `INITIAL_STAGE_INDEX` |
| `public` | `int` | `stageIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
