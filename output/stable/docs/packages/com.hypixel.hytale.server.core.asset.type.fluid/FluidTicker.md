---
title: "FluidTicker"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker"
api_surface: true
extends: null
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
public abstract class FluidTicker
```

Base class for fluid tick simulation. Defines the JSON-configurable properties `FlowRate` (tick frequency in seconds, default 0.5), `CanDemote` (whether fluid levels decrease), and `SupportedBy` (another fluid that sustains this one). The `tick` method rate-limits processing based on `flowRate` and delegates to `process`, which checks `isAlive` status and then calls the abstract `spread` method. Provides utility methods for solid block checks, fluid blocking detection through hitboxes, and surrounding block tick activation.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `FLUID_BLOCK_DISTANCE` | `5` |
| `protected static final` | `int` | `SPREAD_NO_PATH` | `Integer.MAX_VALUE` |
| `protected static final` | `int` | `SPREAD_NO_CHUNK` | `2147483646` |

## JSON-Configurable Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `float` | `flowRate` | `0.5` | Tick frequency in seconds. |
| `boolean` | `canDemote` | `true` | Whether the fluid can lose levels. |
| `String` | `supportedBy` | `null` | ID of supporting fluid type. |

## Abstract Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected abstract` | `BlockTickStrategy` | `spread(World world, long tick, Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `BlockTickStrategy` | `tick(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull CachedAccessor cachedAccessor, ...)` |
| `public` | `BlockTickStrategy` | `process(World world, long tick, @Nonnull Accessor accessor, ...)` |
| `public` | `boolean` | `canOccupySolidBlocks()` |
| `public` | `boolean` | `canDemote()` |
| `public` | `int` | `getSupportedById()` |
| `public` | `boolean` | `isSelfFluid(int selfFluidId, int otherFluidId)` |
| `public` | `boolean` | `blocksFluidFrom(@Nonnull BlockType blockType, int rotationIndex, int offsetX, int offsetZ)` |
| `public` | `boolean` | `blocksFluidFrom(@Nonnull BlockType blockType, int rotationIndex, int offsetX, int offsetZ, int filler)` |
| `public static` | `boolean` | `isFullySolid(@Nonnull BlockType blockType)` |
| `public static` | `boolean` | `isSolid(@Nonnull BlockType blockType)` |
| `public static` | `void` | `setTickingSurrounding(@Nonnull Accessor accessor, BlockSection blockSection, int worldX, int worldY, int worldZ)` |

## Inner Types

### Accessor (interface)

```java
public interface Accessor {
    @Nullable FluidSection getFluidSection(int cx, int cy, int cz);
    @Nullable default FluidSection getFluidSectionByBlock(int bx, int by, int bz);
    @Nullable BlockSection getBlockSection(int cx, int cy, int cz);
    @Nullable default BlockSection getBlockSectionByBlock(int bx, int by, int bz);
    @Deprecated(forRemoval = true) void setBlock(int x, int y, int z, int blockId);
}
```

### AliveStatus (enum)

```java
public static enum AliveStatus { ALIVE, DEMOTE, WAIT_FOR_ADJACENT_CHUNK; }
```

### CachedAccessor (static class)

```java
public static class CachedAccessor extends AbstractCachedAccessor implements Accessor
```

Thread-local cached accessor that stores fluid and block section lookups to avoid repeated chunk queries during tick processing.

## Related Types

- [Fluid](Fluid.md) -- owns a ticker instance
- [DefaultFluidTicker](DefaultFluidTicker.md) -- standard liquid spreading
- [FiniteFluidTicker](FiniteFluidTicker.md) -- volume-conserving simulation
- [FireFluidTicker](FireFluidTicker.md) -- fire propagation
