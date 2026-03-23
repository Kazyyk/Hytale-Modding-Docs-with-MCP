---
title: "BodyMotionMaintainDistance"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionMaintainDistance"
api_surface: false
extends: "BodyMotionBase"
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
public class BodyMotionMaintainDistance extends BodyMotionBase
```

Maintains a specific distance from a target entity. Combines pursue and evade steering forces to keep the NPC within a configured distance range. Supports configurable approach angles, strafe speeds, and repositioning.

## Key Fields

| Field | Type | Description |
|---|---|---|
| `initialDesiredDistanceRange` | `double[]` | Target distance range |
| `moveThreshold` | `double` | Distance deviation before repositioning |
| `thresholdDistanceRangeSquared` | `double[]` | Squared distance range for threshold checks |
