---
title: "FloodFillPositionSelector"
kind: "class"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util.FloodFillPositionSelector"
api_surface: false
extends: null
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

```java
public class FloodFillPositionSelector implements Component<EntityStore>
```

ECS component that performs flood-fill-based spawn position selection around a beacon. Builds a height grid via flood fill, creates multi-resolution bitmaps to find candidate positions, then filters by spawn suppression, block type, fluid, and light conditions. Supports weighted random selection biased toward a target distance from the player.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, FloodFillPositionSelector>` | `getComponentType()` |
| `public` | `void` | `setCalculatePositionsAfter(double calculatePositionsAfter)` |
| `public` | `boolean` | `tickCalculatePositionsAfter(float dt)` |
| `public` | `boolean` | `hasPositionsForRole(int roleIndex)` |
| `public` | `boolean` | `prepareSpawnContext(@Nonnull Vector3d playerPosition, int spawnsThisRound, int roleIndex, @Nonnull SpawningContext spawningContext, @Nonnull BeaconSpawnWrapper spawnWrapper)` |
| `public` | `boolean` | `shouldRebuildCache()` |
| `public` | `void` | `forceRebuildCache()` |
| `public` | `void` | `init()` |
| `public` | `void` | `buildPositionCache(@Nonnull Vector3d origin, @Nonnull FloodFillEntryPoolSimple pool)` |
| `public static` | `int` | `getPositionIndex(int x, int z, int size)` |
| `public static` | `int` | `xFromIndex(int index, int size)` |
| `public static` | `int` | `zFromIndex(int index, int size)` |

## Inner Types

### Debug (enum)

`DISABLED`, `IRREGULARITIES`, `ALL` -- controls debug output during position selection.
