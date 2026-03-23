---
title: "ShortSectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.ShortSectionPalette"
api_surface: false
extends: "AbstractShortSectionPalette"
implements: []
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
public class ShortSectionPalette extends AbstractShortSectionPalette
```

Extends `AbstractShortSectionPalette`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `MAX_SIZE` | `65536` |
| `public static final` | `int` | `DEMOTE_SIZE` | `251` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(new short[32768])` |
| `` | `` | `super(externalToInternal, internalToExternal, internalIdSet, internalIdCount, blocks)` |
| `` | `` | `super(new short[32768], data, unique, count)` |
| `@Override public` | `PaletteType` | `getPaletteType()` |
| `@Override protected` | `short` | `get0(int idx)` |
| `@Override protected` | `void` | `set0(int idx, short s)` |
| `@Override public` | `boolean` | `shouldDemote()` |
| `@Nonnull public` | `ByteSectionPalette` | `demote()` |
| `@Override public` | `ISectionPalette` | `promote()` |
| `` | `throw new` | `UnsupportedOperationException("Short palette cannot be promoted.")` |
| `@Override protected` | `boolean` | `isValidInternalId(int internalId)` |
