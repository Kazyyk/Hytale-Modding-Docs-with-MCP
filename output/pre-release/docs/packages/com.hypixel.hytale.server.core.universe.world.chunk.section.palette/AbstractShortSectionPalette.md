---
title: "AbstractShortSectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.AbstractShortSectionPalette"
api_surface: false
extends: ~
implements:
  - "ISectionPalette"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "chunk"
  - "palette"
  - "short"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.palette`

```java
public abstract class AbstractShortSectionPalette implements ISectionPalette
```

Abstract base for short-backed section palettes (up to 65536 unique block types). Analogous to `AbstractByteSectionPalette` but uses short arrays and short-keyed maps for internal ID mapping. Used when a chunk section exceeds 256 unique block types.