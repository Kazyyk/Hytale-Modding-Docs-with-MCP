---
title: "EmptySectionPalette"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.EmptySectionPalette"
api_surface: false
extends: ~
implements:
  - "ISectionPalette"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "chunk"
  - "palette"
  - "empty"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.palette`

```java
public class EmptySectionPalette implements ISectionPalette
```

Singleton palette for completely empty chunk sections (all blocks are ID 0). Returns `REQUIRES_PROMOTE` for any non-zero set operation. Promotes to `HalfByteSectionPalette` when a block is placed.

## Constants

| Field | Type | Value |
|---|---|---|
| `EMPTY_ID` | `int` | `0` |