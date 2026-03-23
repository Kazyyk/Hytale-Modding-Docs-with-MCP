---
title: "BlockCounter"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.blocktrack"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.blocktrack.BlockCounter"
api_surface: false
extends: ~
implements: 
  - "Resource<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.blocktrack`

```java
public class BlockCounter implements Resource<ChunkStore>
```

Implementation of `Resource<ChunkStore>`.

## Constructors

| Constructor | Description |
|---|---|
| `BlockCounter()` | Creates a new BlockCounter instance. |
| `BlockCounter(Object2IntMap<String> blockPlacementCounts)` | Creates a new BlockCounter instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<ChunkStore, BlockCounter>` | static public method. |
| `trackBlock(String blockName)` | `void` | public method. |
| `untrackBlock(String blockName)` | `void` | public method. |
| `getBlockPlacementCount(String blockName)` | `int` | public method. |
| `clone()` | `Resource<ChunkStore>` | public method. |
