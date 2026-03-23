---
title: "ShortBytePalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.palette.ShortBytePalette"
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
public class ShortBytePalette
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
| `public` | `ShortBytePalette()` |
| `public` | `ShortBytePalette(short aDefault)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `set(int x, int z, short key)` |
| `public` | `short` | `get(int x, int z)` |
| `public` | `short` | `get(int index)` |
| `public` | `short` | `contains(short key)` |
| `public` | `void` | `optimize()` |
| `private` | `void` | `optimize(int index)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf dos)` |
| `public` | `void` | `deserialize(@Nonnull ByteBuf buf)` |
| `public` | `byte[]` | `serialize()` |
| `public` | `void` | `copyFrom(@Nonnull ShortBytePalette other)` |
