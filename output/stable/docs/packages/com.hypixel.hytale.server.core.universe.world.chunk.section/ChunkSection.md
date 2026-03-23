---
title: "ChunkSection"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.ChunkSection"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "section"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class ChunkSection implements Component<ChunkStore>
```

Lightweight ECS component that associates a chunk section entity with its parent chunk column and its 3D chunk-section coordinates (x, y, z where y is 0-9). Acts as the anchor component for the section entity in the `ChunkStore`, alongside `BlockSection`, `FluidSection`, and `BlockPhysics` components.

## Static Methods

```java
public static ComponentType<ChunkStore, ChunkSection> getComponentType()
```

## Constructors

```java
public ChunkSection(Ref<ChunkStore> chunkColumnReference, int x, int y, int z)
```

## Instance Methods

```java
public Ref<ChunkStore> getChunkColumnReference()
```

Returns the reference to the parent chunk column entity.

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
public void load(Ref<ChunkStore> chunkReference, int x, int y, int z)
```

Re-initializes this component with new coordinates and chunk reference (used during deserialization).
