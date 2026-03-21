---
title: "BodyMotionMoveAway"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionMoveAway"
api_surface: false
extends: "BodyMotionFindWithTarget"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "bodymotion"
  - "movement"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

```java
public class BodyMotionMoveAway extends BodyMotionFindWithTarget
```

Flees from a target position using pathfinding and evade steering. Supports configurable flee direction holding, jitter angles for erratic movement, and distance-based erratic behavior escalation.

## Key Fields

| Field | Type | Description |
|---|---|---|
| `stopDistance` | `double` | Distance at which fleeing stops |
| `holdDirectionDurationRange` | `double[]` | Duration range for holding a flee direction |
| `jitterAngle` | `float` | Angular jitter for flee direction variation |
| `erraticDistanceSquared` | `double` | Distance threshold for erratic movement |
