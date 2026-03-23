---
title: "BufferBundle.MemoryReport"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.MemoryReport"
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
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

```java
public static class BufferBundle.MemoryReport
```

Collects per-grid memory usage entries and formats them into a human-readable report. Grid entries are sorted by buffer type index when converting to string. Reports total memory in megabytes across all grids.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [BufferBundle.MemoryReport.GridEntry](BufferBundle.MemoryReport.GridEntry.md) | record | Per-grid memory and count snapshot |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public final` | `List<BufferBundle.MemoryReport.GridEntry>` | `gridEntries` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `toString()` |
