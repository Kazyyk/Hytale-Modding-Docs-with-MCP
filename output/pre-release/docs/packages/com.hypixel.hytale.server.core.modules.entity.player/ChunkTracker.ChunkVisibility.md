---
title: "ChunkTracker.ChunkVisibility"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.ChunkTracker.ChunkVisibility"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "chunks"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static enum ChunkTracker.ChunkVisibility
```

Classifies a chunk's visibility state relative to a player. Used by [ChunkTracker](ChunkTracker.md) to determine how chunks are treated.

## Enum Constants

| Constant | Description |
|---|---|
| `NONE` | The chunk is outside the player's view radius and should not be loaded. |
| `HOT` | The chunk is within the hot radius and is actively ticking. |
| `COLD` | The chunk is within the view radius but outside the hot radius; loaded but not ticking. |

## Related Types

- [ChunkTracker](ChunkTracker.md) -- component that uses this enum to classify chunks
