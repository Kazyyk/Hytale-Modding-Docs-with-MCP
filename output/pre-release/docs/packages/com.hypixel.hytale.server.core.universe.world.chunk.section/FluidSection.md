---
title: "FluidSection"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.FluidSection"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "section"
  - "fluid"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class FluidSection implements Component<ChunkStore>
```

ECS component storing fluid data (type and level) for a 32x32x32 chunk section. Fluid types are stored in an `ISectionPalette` (same dynamic promotion/demotion as block data), and fluid levels are stored in a packed nibble array (4 bits per block, 16384 bytes for 32768 blocks). Thread safety is achieved via `StampedLock`.

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `LEVEL_DATA_SIZE` | `int` | `16384` | Size of the level data array in bytes. |
| `VERSION` | `int` | `0` | Current serialization version. |

## Static Methods

```java
public static ComponentType<ChunkStore, FluidSection> getComponentType()
```

## Instance Methods

```java
public boolean setFluid(int x, int y, int z, int fluidId, byte level)
```

Sets the fluid type and level at the given coordinates. A level of 0 clears the fluid; a fluid ID of 0 clears the level. Returns `true` if any value changed.

```java
public boolean setFluid(int x, int y, int z, @Nonnull Fluid fluid, byte level)
```

Sets using a `Fluid` asset reference.

```java
public int getFluidId(int x, int y, int z)
```

Returns the fluid type index at the given coordinates.

```java
@Nullable
public Fluid getFluid(int x, int y, int z)
```

Returns the `Fluid` asset at the given coordinates, or `null` if none.

```java
public byte getFluidLevel(int x, int y, int z)
```

Returns the fluid level (0-15) at the given coordinates.

```java
public int getX()
```

```java
public int getY()
```

```java
public int getZ()
```

```java
public boolean isEmpty()
```

Returns `true` if the section contains no fluids.

```java
@Nonnull
public IntOpenHashSet getAndClearChangedPositions()
```

Returns and clears the set of block indexes that have changed since the last call.

```java
@Nonnull
public CompletableFuture<CachedPacket<SetFluids>> getCachedPacket()
```

Returns a lazily-computed cached `SetFluids` network packet for this section.
