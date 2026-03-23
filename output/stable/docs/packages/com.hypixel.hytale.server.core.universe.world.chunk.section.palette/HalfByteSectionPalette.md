---
title: "HalfByteSectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.HalfByteSectionPalette"
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
public class HalfByteSectionPalette extends AbstractByteSectionPalette
```

Extends `AbstractByteSectionPalette`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `MAX_SIZE` | `16` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(new byte[16384])` |
| `` | `` | `super(externalToInternal, internalToExternal, internalIdSet, internalIdCount, blocks)` |
| `` | `` | `super(new byte[16384], data, unique, count)` |
| `@Override public` | `PaletteType` | `getPaletteType()` |
| `@Override protected` | `void` | `set0(int idx, byte b)` |
| `@Override protected` | `byte` | `get0(int idx)` |
| `@Override public` | `boolean` | `shouldDemote()` |
| `@Override public` | `ISectionPalette` | `demote()` |
| `@Nonnull public` | `ByteSectionPalette` | `promote()` |
| `@Override protected` | `boolean` | `isValidInternalId(int internalId)` |
| `@Override protected` | `int` | `unsignedInternalId(byte internalId)` |
| `` | `private static int` | `sUnsignedInternalId(byte internalId)` |
