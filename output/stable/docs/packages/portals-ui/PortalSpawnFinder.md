---
title: "PortalSpawnFinder"
kind: final class
package: "com.hypixel.hytale.builtin.portals.ui"
fqcn: "com.hypixel.hytale.builtin.portals.ui.PortalSpawnFinder"
api_surface: "public"
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["portals", "spatial"]
---

Utility class for finding valid spawn positions within portal fragment worlds. Uses a hinted-spawn system with fallback to ground scanning. Checks for solid ground below air blocks and validates portal fit using `FitsAPortal`. Maximum 10 attempts per world with 8 checks per chunk.

## Hierarchy

- **Extends:** `java.lang.Object`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `computeSpawnTransform(World, List<Vector3d>)` | `Transform` | Computes a spawn transform from hinted spawns or fallback. Returns null if both methods fail. |
| `guesstimateFromHints(World, List<Vector3d>)` | `Vector3d` | Tries hinted spawn positions, checking chunk availability and ground quality. |
| `findGroundWithinChunk(WorldChunk, int, boolean)` | `Vector3d` | Scans random positions within a chunk for valid ground. |
| `findWithGroundBelow(WorldChunk, int, int, int, int, boolean)` | `Vector3d` | Scans downward from a position looking for air above solid ground. |
| `findFallbackPositionOnGround(World)` | `Vector3d` | Falls back to scanning near world origin (0,0). |

## Inner Types

### Material

*enum*

Block material classification: `SOLID`, `FLUID`, `AIR`, `UNKNOWN`.

