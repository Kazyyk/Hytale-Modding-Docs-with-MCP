---
title: "RestingSupport"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics"
fqcn: "com.hypixel.hytale.server.core.modules.physics.RestingSupport"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "physics"
  - "collision"
---

**Package:** `com.hypixel.hytale.server.core.modules.physics`

```java
public class RestingSupport
```

Tracks the block IDs beneath an entity's bounding box to detect when the support surface changes. Used by the physics system to determine if a resting entity needs to recompute its grounded state. Caches the block IDs in a flat array covering the XZ footprint at the entity's Y position.

## Methods

```java
public boolean hasChanged(@Nonnull World world)
```

Returns `true` if any block within the cached support region has changed since the last call to `rest()`. Iterates the stored block IDs and compares against current world state.

```java
public void rest(@Nonnull World world, @Nonnull Box boundingBox, @Nonnull Vector3d position)
```

Captures the current block IDs beneath the entity's bounding box at the given position. Stores the support region bounds and block ID array for subsequent `hasChanged()` checks.
