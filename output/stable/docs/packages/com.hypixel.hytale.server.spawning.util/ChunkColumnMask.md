---
title: "ChunkColumnMask"
kind: "class"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util.ChunkColumnMask"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

```java
public class ChunkColumnMask
```

Bitmask over 1024 columns (32x32) within a chunk. Used by the spawning system to track which columns are available for spawn position selection. Wraps a `BitSet` with chunk-coordinate-aware accessors.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `COLUMNS` | `1024` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `copyFrom(@Nonnull ChunkColumnMask src)` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `void` | `clear()` |
| `public` | `void` | `set()` |
| `public` | `boolean` | `get(int x, int z)` |
| `public` | `void` | `set(int x, int z)` |
| `public` | `void` | `clear(int x, int z)` |
| `public` | `int` | `cardinality()` |
| `public` | `int` | `nextSetBit(int fromIndex)` |
| `public` | `int` | `nextClearBit(int fromIndex)` |
| `public` | `int` | `previousSetBit(int fromIndex)` |
| `public` | `int` | `previousClearBit(int fromIndex)` |
