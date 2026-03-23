---
title: "BufferBundle.MemoryReport.GridEntry"
kind: "record"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.MemoryReport.GridEntry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "record"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

```java
public record BufferBundle.MemoryReport.GridEntry(MemInstrument.Report report, int bufferCount, @Nonnull BufferType bufferType)
```

Captures a snapshot of a single grid's memory usage, buffer count, and buffer type for inclusion in a [BufferBundle.MemoryReport](BufferBundle.MemoryReport.md).

## Components

| Type | Name |
|---|---|
| `MemInstrument.Report` | `report` |
| `int` | `bufferCount` |
| `@Nonnull BufferType` | `bufferType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `String` | `toString(int indentation)` |
