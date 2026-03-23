---
title: "BufferBundle.Grid.TrackedBuffer"
kind: "record"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.Grid.TrackedBuffer"
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
  - "record"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

```java
public record BufferBundle.Grid.TrackedBuffer(@Nonnull BufferBundle.Tracker tracker, @Nonnull Buffer buffer) implements MemInstrument
```

Pairs a `Buffer` with a [BufferBundle.Tracker](BufferBundle.Tracker.md). Reports combined memory usage of both the tracker and the buffer.

## Components

| Type | Name |
|---|---|
| `@Nonnull BufferBundle.Tracker` | `tracker` |
| `@Nonnull Buffer` | `buffer` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
