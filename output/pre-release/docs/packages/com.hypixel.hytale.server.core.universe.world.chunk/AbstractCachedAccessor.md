---
title: "AbstractCachedAccessor"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.AbstractCachedAccessor"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "accessor"
  - "cache"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public abstract class AbstractCachedAccessor
```

Abstract base for cached chunk/section accessors that maintain a local grid of chunk and section references around a central point. Used to avoid repeated lookups during operations that access multiple neighboring chunks/sections (e.g., world generation, lighting, block physics). The cache stores 2D chunk references and 3D section references plus component caches.

Subclasses call `init()` with a center position and radius, then use `getChunk()`, `getSection()`, and `getComponentSection()` for cached lookups.

## Protected Fields

| Field | Type | Description |
|---|---|---|
| `commandBuffer` | `ComponentAccessor<ChunkStore>` | The component accessor used for store lookups. |

## Instance Methods

```java
@Nullable
public Ref<ChunkStore> getChunk(int cx, int cz)
```

Returns the chunk reference at the given chunk coordinates, using the cache if within range.

```java
@Nullable
public Ref<ChunkStore> getSection(int cx, int cy, int cz)
```

Returns the section reference at the given chunk-section coordinates (cy must be 0-9). Uses the cache if within range.

```java
@Nullable
protected <T extends Component<ChunkStore>> T getComponentSection(int cx, int cy, int cz, int typeIndex, @Nonnull ComponentType<ChunkStore, T> componentType)
```

Returns a cached component from a section, lazily loading it on first access.
