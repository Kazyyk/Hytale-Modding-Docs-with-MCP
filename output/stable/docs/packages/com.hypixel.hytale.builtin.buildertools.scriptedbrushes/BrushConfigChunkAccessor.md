---
title: "BrushConfigChunkAccessor"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.BrushConfigChunkAccessor"
api_surface: false
extends: "LocalCachedChunkAccessor"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "buildertools"
  - "brush"
  - "chunk"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes`

```java
public class BrushConfigChunkAccessor extends LocalCachedChunkAccessor
```

Chunk accessor specialized for scripted brush operations. Overrides block reads to first check the edit store's "after" state (current operation's modifications), falling back to the "before" state and then the actual world chunk data.

## Static Methods

```java
public static BrushConfigChunkAccessor atWorldCoords(BrushConfigEditStore editOperation, ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int blockRadius)
```

```java
public static BrushConfigChunkAccessor atChunkCoords(BrushConfigEditStore editOperation, ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int chunkRadius)
```

## Instance Methods

```java
public int getBlock(@Nonnull Vector3i pos)
```

```java
public int getBlock(int x, int y, int z)
```

```java
public int getBlockIgnoringHistory(@Nonnull Vector3i pos)
```

Returns the block from the before-state or the world, ignoring the current operation's edits.

```java
public int getBlockIgnoringHistory(int x, int y, int z)
```

```java
public int getFluidId(int x, int y, int z)
```
