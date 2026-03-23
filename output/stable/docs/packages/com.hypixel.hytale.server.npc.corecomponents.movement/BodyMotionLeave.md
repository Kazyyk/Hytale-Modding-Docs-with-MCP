---
title: "BodyMotionLeave"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionLeave"
api_surface: false
extends: "BodyMotionFindBase<AStarBase>"
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
public class BodyMotionLeave extends BodyMotionFindBase<AStarBase>
```

Moves the NPC away from a position using A* pathfinding. Goal is reached when the NPC exceeds the configured distance from the starting position. Uses a basic `AStarBase` (no target tracking).
