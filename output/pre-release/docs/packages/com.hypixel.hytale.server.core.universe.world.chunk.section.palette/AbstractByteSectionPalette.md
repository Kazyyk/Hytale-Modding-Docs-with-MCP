---
title: "AbstractByteSectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.AbstractByteSectionPalette"
api_surface: false
extends: ~
implements:
  - "ISectionPalette"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "chunk"
  - "palette"
  - "byte"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.palette`

```java
public abstract class AbstractByteSectionPalette implements ISectionPalette
```

Abstract base for byte-backed section palettes (up to 256 unique block types). Maintains bidirectional external-to-internal ID mappings, per-ID counts, and a byte array for block storage. Handles promotion when the palette runs out of internal IDs, and supports packet serialization, disk serialization, and find operations.