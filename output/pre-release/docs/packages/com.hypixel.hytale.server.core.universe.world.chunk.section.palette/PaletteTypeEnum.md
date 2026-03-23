---
title: "PaletteTypeEnum"
kind: "enum"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.PaletteTypeEnum"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "chunk"
  - "section"
  - "palette"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.palette`

```java
public enum PaletteTypeEnum
```

An enumeration with 8 constants.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `,` | `SHORT(PaletteType.Short, ShortSectionPalette::new)` |
| `` | `public static PaletteTypeEnum` | `get(byte paletteId)` |
| `@Nonnull public` | `PaletteType` | `getPaletteType()` |
| `` | `public Supplier<? extends ISectionPalette>` | `getConstructor()` |
| `` | `public byte` | `getPaletteId()` |

## Enum Constants

- `EMPTY`
- `HALF_BYTE`
- `HalfByteSectionPalette::new)`
- `BYTE`
- `ByteSectionPalette::new)`
- `SHORT`
- `ShortSectionPalette::new)`
