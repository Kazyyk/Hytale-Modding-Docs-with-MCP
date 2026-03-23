---
title: "BufferBundle.Grid"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.Grid"
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
public static class BufferBundle.Grid implements MemInstrument
```

Spatial grid of tracked buffers organized by 3D position in buffer-grid coordinates. Buffers are stored in columns of height 40 (Y range [0, 40)). The grid enforces a configurable capacity and uses an LRU deque to evict the oldest buffer columns when surplus is detected. Columns currently referenced by an active [BufferBundle.Access](BufferBundle.Access.md) are protected from eviction.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [BufferBundle.Grid.TrackedBuffer](BufferBundle.Grid.TrackedBuffer.md) | record | Pairs a `Buffer` with its `Tracker` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `BufferType` | `bufferType` |
| `@Nonnull private final` | `Map<Vector3i, BufferBundle.Grid.TrackedBuffer>` | `buffers` |
| `@Nonnull private final` | `Deque<Vector3i>` | `oldestColumnEntryDeque_bufferGrid` |
| `private final` | `int` | `capacity` |
| `@Nonnull private final` | `List<BufferBundle.Access>` | `accessors` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `Grid(@Nonnull BufferType bufferType, int capacity)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BufferType` | `getBufferType()` |
| `@Nonnull public` | `BufferBundle.Access` | `openAccess(@Nonnull Bounds3i bounds_bufferGrid)` |
| `public` | `void` | `closeAllAccesses()` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `private` | `void` | `ensureBufferColumnExists(@Nonnull Vector3i position_bufferGrid, @Nonnull BufferBundle.Grid.TrackedBuffer[] trackedBuffersOut)` |
| `private` | `void` | `createBufferColumn(@Nonnull Vector3i position_bufferGrid, @Nonnull BufferBundle.Grid.TrackedBuffer[] trackedBuffersOut)` |
| `private` | `void` | `tryTrimSurplus(int extraRoom)` |
| `private` | `boolean` | `destroyOldestBufferColumn()` |
| `private` | `void` | `removeBufferColumn(@Nonnull Vector3i position_bufferGrid)` |
| `private` | `boolean` | `isBufferColumnInAccess(@Nonnull Vector3i position_bufferGrid)` |
