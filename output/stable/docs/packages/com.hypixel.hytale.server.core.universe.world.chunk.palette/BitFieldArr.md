---
title: "BitFieldArr"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.palette.BitFieldArr"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "chunk"
  - "palette"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.palette`

```java
public class BitFieldArr
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `BITS_PER_INDEX` |
| `public static final` | `int` | `LAST_BIT_INDEX` |
| `public static final` | `int` | `INDEX_MASK` |
| `private final` | `int` | `bits` |
| `private final` | `int` | `length` |
| `@Nonnull private final` | `byte[]` | `array` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BitFieldArr(int bits, int length)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getLength()` |
| `public` | `int` | `get(int index)` |
| `public` | `void` | `set(int index, int value)` |
| `private` | `void` | `setBit(int bitIndex, int bit)` |
| `public` | `byte[]` | `get()` |
| `public` | `void` | `set(@Nonnull byte[] bytes)` |
| `@Nonnull public` | `String` | `toBitString()` |
| `public` | `void` | `copyFrom(@Nonnull BitFieldArr other)` |
