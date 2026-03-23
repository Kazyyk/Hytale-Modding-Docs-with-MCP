---
title: "IntBytePalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.palette.IntBytePalette"
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
public class IntBytePalette
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `LENGTH` |
| `private` | `short` | `count` |
| `private final` | `Lock` | `keysLock` |
| `private final` | `BitFieldArr` | `array` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `IntBytePalette()` |
| `public` | `IntBytePalette(int aDefault)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `set(int x, int z, int key)` |
| `public` | `int` | `get(int x, int z)` |
| `public` | `short` | `contains(int key)` |
| `public` | `void` | `optimize()` |
| `private` | `void` | `optimize(int index)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf dos)` |
| `public` | `void` | `deserialize(@Nonnull ByteBuf dis)` |
| `public` | `byte[]` | `serialize()` |
| `public` | `void` | `copyFrom(@Nonnull IntBytePalette other)` |
