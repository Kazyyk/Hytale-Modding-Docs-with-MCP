---
title: "AStarEvaluator"
kind: "interface"
package: "com.hypixel.hytale.server.npc.navigation"
fqcn: "com.hypixel.hytale.server.npc.navigation.AStarEvaluator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "navigation"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.navigation`

```java
public interface AStarEvaluator
```

Strategy interface for A* goal testing and heuristic estimation. `isGoalReached()` determines path completion; `estimateToGoal()` provides the heuristic cost.
