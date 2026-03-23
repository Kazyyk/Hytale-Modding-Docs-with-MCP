---
title: "BlockSection"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.BlockSection"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "chunk"
  - "section"
  - "block"
  - "component"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class BlockSection implements Component<ChunkStore>
```

Chunk section component managing a 32x32x32 block region. Stores block, filler, and rotation palettes via `ISectionPalette` implementations, plus lighting data, ticking block bitsets, and tick request queues. Handles block migration, serialization/deserialization, and network packet caching with stamped locks for thread safety.

## Constants

| Field | Type | Value |
|---|---|---|
| `VERSION` | `int` | `6` |

## Static Methods

| Method | Signature |
|---|---|
| `getComponentType` | `static ComponentType<ChunkStore, BlockSection> getComponentType()` |