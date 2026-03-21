---
title: "BodyMotionFind"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionFind"
api_surface: false
extends: "BodyMotionFindWithTarget"
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
public class BodyMotionFind extends BodyMotionFindWithTarget
```

Pathfinds to a sensor-provided target position using A* navigation. Core pursue behavior for NPC movement. Configurable distance thresholds control when the NPC considers the goal reached, when to abort, and when to switch from pathfinding to direct steering.

## Key Fields

| Field | Type | Description |
|---|---|---|
| `distance` | `double` | Goal-reached distance threshold |
| `reachable` | `boolean` | Whether the target must be reachable |
| `heightDifferenceMin` / `heightDifferenceMax` | `double` | Vertical range constraints |
| `abortDistance` | `double` | Distance at which pathfinding aborts |
| `switchToSteeringDistance` | `double` | Distance at which A* switches to direct steering |
