---
title: "BuilderToolsPlugin.CachedAccessor"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.CachedAccessor"
api_surface: false
extends: "AbstractCachedAccessor"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "performance"
  - "chunk-access"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class CachedAccessor extends AbstractCachedAccessor
```

A thread-local cached accessor for chunk section components, optimized for builder tool operations that need repeated access to fluid sections, block physics, and block sections within a chunk neighborhood. Extends `AbstractCachedAccessor` with 3 component slots.

## Thread-Local Access

```java
@Nonnull
public static BuilderToolsPlugin.CachedAccessor of(ComponentAccessor<ChunkStore> accessor, int cx, int cy, int cz, int radius)
```

Returns the thread-local `CachedAccessor` instance, initialized with the given `ChunkStore` accessor and centered at chunk coordinates `(cx, cy, cz)` with the specified radius.

## Constructor

```java
public CachedAccessor()
```

Initializes with 3 component slots (fluid, physics, blocks).

## Component Accessors

### getFluidSection

```java
@Nullable
public FluidSection getFluidSection(int cx, int cy, int cz)
```

Returns the `FluidSection` at the given chunk section coordinates, or `null` if not cached.

### getBlockPhysics

```java
@Nullable
public BlockPhysics getBlockPhysics(int cx, int cy, int cz)
```

Returns the `BlockPhysics` component at the given chunk section coordinates, or `null` if not cached.

### getBlockSection

```java
@Nullable
public BlockSection getBlockSection(int cx, int cy, int cz)
```

Returns the `BlockSection` at the given chunk section coordinates, or `null` if not cached.

## Component Slot Constants

| Slot | Value | Component |
|---|---|---|
| `FLUID_COMPONENT` | `0` | `FluidSection` |
| `PHYSICS_COMPONENT` | `1` | `BlockPhysics` |
| `BLOCKS_COMPONENT` | `2` | `BlockSection` |

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- enclosing class
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- uses this accessor for editing operations
