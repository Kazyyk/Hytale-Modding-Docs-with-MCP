---
title: "CaveNodeShape"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.CaveNodeShape"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public interface CaveNodeShape
```

Defines the geometric shape of a cave node for world generation. Implementations determine which blocks to carve, provide anchor points for child node attachment, and handle chunk population with block/fluid replacement.

## Methods

```java
Vector3d getStart()
```

```java
Vector3d getEnd()
```

```java
Vector3d getAnchor(Vector3d var1, double var2, double var4, double var6)
```

Computes an anchor point on the shape surface for the given parametric coordinates.

```java
IWorldBounds getBounds()
```

Returns the axis-aligned bounding box of this shape in world coordinates.

```java
boolean shouldReplace(int var1, double var2, double var4, int var6)
```

Tests whether the block at the given seed and world coordinates falls within this shape.

```java
double getFloorPosition(int var1, double var2, double var4)
```

Returns the lowest Y coordinate carved at the given XZ position, or -1.0 if none.

```java
double getCeilingPosition(int var1, double var2, double var4)
```

Returns the highest Y coordinate carved at the given XZ position, or -1.0 if none.

```java
void populateChunk(int var1, ChunkGeneratorExecution var2, Cave var3, CaveNode var4, Random var5)
```

Carves blocks within a chunk, applying block masks, covers, and environment settings.

```java
default boolean hasGeometry()
```

Returns true if this shape carves blocks. Default is true; [EmptyLineCaveNodeShape](EmptyLineCaveNodeShape.md) returns false.
