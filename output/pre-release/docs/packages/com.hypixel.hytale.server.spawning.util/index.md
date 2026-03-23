---
title: "com.hypixel.hytale.server.spawning.util"
kind: "package"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

Utility classes for the NPC spawning system. Provides flood-fill-based position selection, chunk column masking, light range testing, and randomized column iteration.

## Types

| Type | Kind | Description |
|---|---|---|
| [ChunkColumnMask](ChunkColumnMask.md) | class | Bitmask over 1024 chunk columns. |
| [FloodFillEntryPoolProviderSimple](FloodFillEntryPoolProviderSimple.md) | class | ECS resource providing flood-fill array pool. |
| [FloodFillEntryPoolSimple](FloodFillEntryPoolSimple.md) | class | Object pool for int arrays. |
| [FloodFillPositionSelector](FloodFillPositionSelector.md) | class | Flood-fill spawn position selector. |
| [LightRangePredicate](LightRangePredicate.md) | class | Light level range predicate for spawning. |
| [RandomChunkColumnIterator](RandomChunkColumnIterator.md) | class | Pseudo-random chunk column iterator. |
