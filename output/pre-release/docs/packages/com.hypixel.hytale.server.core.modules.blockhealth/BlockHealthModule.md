---
title: "BlockHealthModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.blockhealth"
fqcn: "com.hypixel.hytale.server.core.modules.blockhealth.BlockHealthModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockhealth"
  - "plugin"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.blockhealth`

```java
public class BlockHealthModule extends JavaPlugin
```

Core plugin that manages block health, damage, repair, and fragility. Registers the [BlockHealthChunk](BlockHealthChunk.md) component and four ECS systems:

- **EnsureBlockHealthSystem** -- ensures every `WorldChunk` has a `BlockHealthChunk` component on creation.
- **BlockHealthSystem** -- ticks each chunk to decrement fragile block timers and regenerate damaged block health (0.1 HP/second after a 5-second delay since last damage).
- **BlockHealthPacketSystem** -- generates `UpdateBlockDamage` packets for player chunk loading.
- **PlaceBlockEventSystem** -- listens for `PlaceBlockEvent` and marks placed blocks as fragile per `WorldConfig.getBlockPlacementFragilityTimer()`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `PluginManifest` | `MANIFEST` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BlockHealthModule` | `get()` |
| `public` | | `BlockHealthModule(@Nonnull JavaPluginInit init)` |
| `protected` | `void` | `setup()` |
| `public` | `ComponentType<ChunkStore, BlockHealthChunk>` | `getBlockHealthChunkComponentType()` |

## Related Types

- [BlockHealthChunk](BlockHealthChunk.md) -- per-chunk health tracking component
- [BlockHealth](BlockHealth.md) -- per-block health state
- [FragileBlock](FragileBlock.md) -- per-block fragility timer
