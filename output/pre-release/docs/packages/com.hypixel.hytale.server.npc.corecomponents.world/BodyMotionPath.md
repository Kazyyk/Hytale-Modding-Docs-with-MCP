---
title: "BodyMotionPath"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.BodyMotionPath"
api_surface: false
extends: "BodyMotionBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "motion"
  - "world"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class BodyMotionPath extends BodyMotionBase
```

Path-following body motion with configurable shape (LINE, LOOP, POINTS, CHAIN), direction, node delays, observation sectors, and path-width wandering. Uses `SteeringForcePursue` and `SteeringForceRotate` for movement. Each instance has a corresponding `BuilderBodyMotionPath` class for JSON deserialization.
