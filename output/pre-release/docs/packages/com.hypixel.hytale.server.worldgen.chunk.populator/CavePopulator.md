---
title: "CavePopulator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk.populator"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.populator.CavePopulator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "chunk"
  - "populator"
  - "cave"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk.populator`

```java
public class CavePopulator
```

Populates a chunk with cave structures. For each zone that has a cave generator, collects entry points from each `CaveType`'s point generator within the chunk's extended bounds (including the maximum cave size buffer). For qualifying entry points that pass biome matching and height threshold checks, generates cave nodes and pastes cave prefabs using `PrefabPasteUtil`.

Uses `CaveBlockPriorityModifier` for cave node carving and standard priority for prefab placement.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `populate(int seed, @Nonnull ChunkGeneratorExecution execution)` |
