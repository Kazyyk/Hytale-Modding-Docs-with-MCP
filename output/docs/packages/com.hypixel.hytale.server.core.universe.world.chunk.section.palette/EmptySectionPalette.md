---
title: "EmptySectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.EmptySectionPalette"
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
public class EmptySectionPalette implements ISectionPalette
```

Section palette implementation for mapping block IDs within chunk sections.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `EMPTY_ID` | `0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `PaletteType` | `getPaletteType()` |
| `@Override public` | `ISectionPalette.SetResult` | `set(int index, int id)` |
| `@Override public` | `int` | `get(int index)` |
| `@Override public` | `boolean` | `shouldDemote()` |
| `@Override public` | `ISectionPalette` | `demote()` |
| `` | `throw new` | `UnsupportedOperationException("Cannot demote empty chunk section!")` |
| `@Override public` | `ISectionPalette` | `promote()` |
| `` | `return new` | `HalfByteSectionPalette()` |
| `@Override public` | `boolean` | `contains(int id)` |
| `@Override public` | `boolean` | `containsAny(@Nonnull IntList ids)` |
| `@Override public` | `boolean` | `isSolid(int id)` |
| `@Override public` | `int` | `count()` |
| `@Override public` | `int` | `count(int id)` |
| `@Override public` | `IntSet` | `values()` |
| `@Override public` | `void` | `forEachValue(@Nonnull IntConsumer consumer)` |
| `@Override public` | `Int2ShortMap` | `valueCounts()` |
| `@Override public` | `void` | `find(@Nonnull IntList ids, IntSet internalIdHolder, @Nonnull IntConsumer indexConsumer)` |
| `@Override public` | `void` | `serializeForPacket(ByteBuf buf)` |
| `@Override public` | `void` | `serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)` |
| `@Override public` | `void` | `deserialize(ToIntFunction<ByteBuf> deserializer, ByteBuf buf, int version)` |
