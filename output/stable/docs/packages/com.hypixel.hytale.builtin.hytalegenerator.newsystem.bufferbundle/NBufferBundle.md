---
title: "NBufferBundle"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.NBufferBundle"
api_surface: false
extends: ~
implements:
  - "MemInstrument"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "buffer"
  - "memory"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle`

```java
public class NBufferBundle implements MemInstrument
```

Container for named buffer grids used by the world generation pipeline. Each grid is keyed by an `NBufferType` and stores columns of 40 vertically-stacked `NBuffer` instances. Supports capacity-based eviction of old columns and provides memory instrumentation reporting.

## Instance Methods

```java
public Grid createGrid(@Nonnull NBufferType bufferType, int capacity)
```

Creates and registers a new grid for the given buffer type with the specified column capacity.

```java
public Access createBufferAccess(@Nonnull NBufferType bufferType, @Nonnull Bounds3i bounds_bufferGrid)
```

Opens a read/write access window over a region of the specified grid.

```java
public void closeALlAccesses()
```

Closes all open access windows across all grids.

```java
public Grid getGrid(@Nonnull NBufferType contentType)
```

```java
public MemInstrument.Report getMemoryUsage()
```

```java
public MemoryReport createMemoryReport()
```

## Inner Classes

### Grid

```java
public static class Grid implements MemInstrument
```

A single buffer grid backed by a `HashMap` of `Vector3i` positions to tracked buffers. Columns are 40 buffers tall (y=0..39). Manages capacity-based eviction via a FIFO deque of oldest columns, skipping columns currently in an active access.

### Access

```java
public static class Access implements MemInstrument
```

A bounded view into a `Grid` that pre-loads all buffer columns within its 3D bounds. Provides indexed buffer lookup by position. Must be explicitly closed to release its reference.

### Access.View

```java
public static class View
```

Read-only subset of an `Access` restricted to a smaller bounds region.

### Grid.TrackedBuffer

```java
public record TrackedBuffer(@Nonnull Tracker tracker, @Nonnull NBuffer buffer) implements MemInstrument
```

Pairs a buffer with its generation-stage tracker for pipeline bookkeeping.

### MemoryReport

```java
public static class MemoryReport
```

Human-readable memory usage summary across all grids, sorted by buffer type index.

### Tracker

```java
public static class Tracker implements MemInstrument
```

Tracks which pipeline stage last wrote to a buffer. Initial stage index is -1.
