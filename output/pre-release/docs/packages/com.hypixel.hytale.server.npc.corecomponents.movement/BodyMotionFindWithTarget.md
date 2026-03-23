---
title: "BodyMotionFindWithTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionFindWithTarget"
api_surface: false
extends: "BodyMotionFindBase<AStarWithTarget>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "bodymotion"
  - "movement"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

```java
public abstract class BodyMotionFindWithTarget extends BodyMotionFindBase<AStarWithTarget>
```

Extension of `BodyMotionFindBase` that tracks a target entity reference. Monitors target movement and triggers path recomputation when the target moves beyond configured thresholds. Supports adjusting range by hitbox size.

## Key Fields

| Field | Type | Description |
|---|---|---|
| `minMoveDistanceWait` | `double` | Target movement distance before waiting |
| `minMoveDistanceRecompute` | `double` | Target movement distance triggering recompute |
| `minMoveDistanceReproject` | `double` | Target movement distance triggering reproject |
| `adjustRangeByHitboxSize` | `boolean` | Whether to adjust goal range by target bounding box |
