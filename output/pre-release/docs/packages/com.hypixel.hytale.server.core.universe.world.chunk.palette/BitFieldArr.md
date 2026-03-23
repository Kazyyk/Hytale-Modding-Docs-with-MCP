---
title: "BitFieldArr"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.palette.BitFieldArr"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "chunk"
  - "palette"
  - "bitfield"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.palette`

```java
public class BitFieldArr
```

Compact bit-packed array storing fixed-width integer values. Supports arbitrary bit widths per element, backed by a byte array. Provides `get(index)`, `set(index, value)`, bulk `get()`/`set()` for the backing array, `copyFrom()`, and `toBitString()` for debugging.

## Constants

| Field | Type | Value |
|---|---|---|
| `BITS_PER_INDEX` | `int` | `8` |
| `INDEX_MASK` | `int` | `255` |