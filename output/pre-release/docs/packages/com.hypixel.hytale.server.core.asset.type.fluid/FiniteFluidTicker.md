---
title: "FiniteFluidTicker"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.FiniteFluidTicker"
api_surface: false
extends: "com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "asset"
  - "fluid"
  - "simulation"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

```java
public class FiniteFluidTicker extends FluidTicker
```

Volume-conserving finite fluid ticker. Unlike `DefaultFluidTicker`, this ticker preserves total fluid volume: when fluid spreads sideways, it drains from the topmost block in the column. Supports both orthogonal and diagonal offsets, with 16 pre-shuffled random offset permutations for natural-looking spread patterns. The `isAlive` check always returns `ALIVE` (finite fluids do not demote on their own).

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `int` | `MAX_DROP_DISTANCE` | `2` |
| `private static final` | `int` | `RANDOM_VARIANTS` | `16` |

## Spread Algorithm

1. **Downward**: Attempts to move fluid from the top of the column into the block below. Transfer amount is capped by `maxFluidLevel - bottomFluidLevel`.
2. **Sideways**: If downward spread fails, iterates through orthogonal and diagonal offsets (using a hash+tick-selected random permutation). For each direction, checks for a downhill path and spreads 1 level per offset cell. Each level spread decrements the source.
3. **Drain**: After spreading, drains the transferred amount from the topmost block in the column by walking upward to find the top.

## Inner Types

### SpreadOutcome (private enum)

```java
private static enum SpreadOutcome { SUCCESS, UNLOADED_CHUNK; }
```

## Related Types

- [FluidTicker](FluidTicker.md) -- base class
- [Fluid](Fluid.md) -- owns this ticker
