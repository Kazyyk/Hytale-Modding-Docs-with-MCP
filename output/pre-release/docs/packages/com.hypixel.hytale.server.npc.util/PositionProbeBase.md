---
title: "PositionProbeBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.PositionProbeBase"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class PositionProbeBase
```

Base class for NPC position probing that evaluates the collision state at a world position. Tracks ground contact, ceiling contact, water state, ground/water/surface levels, and height measurements.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isValidPosition()` |
| `public` | `boolean` | `isTouchCeil()` |
| `public` | `boolean` | `isOnGround()` |
| `public` | `boolean` | `isInWater()` |
| `public` | `int` | `getGroundLevel()` |
| `public` | `int` | `getWaterLevel()` |
| `public` | `int` | `getHeightOverGround()` |
| `public` | `int` | `getHeightOverSurface()` |
| `public` | `int` | `getDepthBelowSurface()` |
| `public` | `int` | `getHeightOverWater()` |
| `public` | `String` | `toString()` |
