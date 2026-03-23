---
title: "ByteSectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.ByteSectionPalette"
api_surface: false
extends: "AbstractByteSectionPalette"
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
public class ByteSectionPalette extends AbstractByteSectionPalette
```

Extends `AbstractByteSectionPalette`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `MAX_SIZE` | `256` |
| `public static final` | `int` | `DEMOTE_SIZE` | `14` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(new byte[32768])` |
| `` | `` | `super(externalToInternal, internalToExternal, internalIdSet, internalIdCount, blocks)` |
| `` | `` | `super(new byte[32768], data, unique, count)` |
| `@Override public` | `PaletteType` | `getPaletteType()` |
| `@Override protected` | `byte` | `get0(int idx)` |
| `@Override protected` | `void` | `set0(int idx, byte b)` |
| `@Override public` | `boolean` | `shouldDemote()` |
| `@Nonnull public` | `HalfByteSectionPalette` | `demote()` |
| `@Nonnull public` | `ShortSectionPalette` | `promote()` |
| `@Override protected` | `boolean` | `isValidInternalId(int internalId)` |
| `@Override protected` | `int` | `unsignedInternalId(byte internalId)` |
| `` | `private static int` | `sUnsignedInternalId(byte internalId)` |
