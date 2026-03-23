---
title: "BlockPhysicsSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.blockphysics"
fqcn: "com.hypixel.hytale.builtin.blockphysics.BlockPhysicsSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockphysics"
---

**Package:** `com.hypixel.hytale.builtin.blockphysics`

```java
public class BlockPhysicsSystems
```

Contains the ECS ticking system and cached accessor for block physics simulation, handling support distance checks and block updates.

## Constants

| Type | Name |
|---|---|
| `int` | `MAX_SUPPORT_RADIUS` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BlockPhysicsSystems.CachedAccessor` | `of(ComponentAccessor<ChunkStore> commandBuffer, BlockSection blockSection, BlockPhysics section, FluidSection fluidSection, int cx, int cy, int cz, int radius)` |
| `public` | `BlockPhysics` | `getBlockPhysics(int cx, int cy, int cz)` |
| `public` | `FluidSection` | `getFluidSection(int cx, int cy, int cz)` |
| `public` | `BlockSection` | `getBlockSection(int cx, int cy, int cz)` |
| `public` | `void` | `performBlockUpdate(int x, int y, int z, int maxSupportDistance)` |
| `public` | `void` | `performBlockUpdate(int x, int y, int z)` |
| `public` | `Query<ChunkStore>` | `getQuery()` |
| `public` | `Set<Dependency<ChunkStore>>` | `getDependencies()` |
| `public` | `void` | `tick(float dt, int index, @Nonnull ArchetypeChunk<ChunkStore> archetypeChunk, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
