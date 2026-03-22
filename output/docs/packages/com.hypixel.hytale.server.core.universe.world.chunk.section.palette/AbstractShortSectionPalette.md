---
title: "AbstractShortSectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.AbstractShortSectionPalette"
api_surface: false
extends: null
implements:
  - "ISectionPalette"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "chunk"
  - "section"
  - "palette"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.palette`

```java
public abstract class AbstractShortSectionPalette implements ISectionPalette
```

Abstract base class in the `palette` package.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `get(int index)` |
| `@Override public` | `ISectionPalette.SetResult` | `set(int index, int id)` |
| `` | `protected abstract short` | `get0(int var1)` |
| `` | `protected abstract void` | `set0(int var1, short var2)` |
| `@Override public` | `boolean` | `contains(int id)` |
| `@Override public` | `boolean` | `containsAny(@Nonnull IntList ids)` |
| `@Override public` | `int` | `count()` |
| `@Override public` | `int` | `count(int id)` |
| `@Override public` | `IntSet` | `values()` |
| `@Override public` | `void` | `forEachValue(IntConsumer consumer)` |
| `@Override public` | `Int2ShortMap` | `valueCounts()` |
| `` | `private void` | `createBlockId(short internalId, int blockId)` |
| `` | `private boolean` | `decrementBlockCount(short internalId)` |
| `` | `private void` | `incrementBlockCount(short internalId)` |
| `` | `private int` | `nextInternalId(short oldInternalId)` |
| `` | `protected abstract boolean` | `isValidInternalId(int var1)` |
| `@Override public` | `void` | `serializeForPacket(@Nonnull ByteBuf buf)` |
| `@Override public` | `void` | `serialize(@Nonnull ISectionPalette.KeySerializer keySerializer, @Nonnull ByteBuf buf)` |
| `@Override public` | `void` | `deserialize(@Nonnull ToIntFunction<ByteBuf> deserializer, @Nonnull ByteBuf buf, int version)` |
| `@Override public` | `void` | `find(@Nonnull IntList ids, @Nonnull IntSet internalIdHolder, @Nonnull IntConsumer indexConsumer)` |
