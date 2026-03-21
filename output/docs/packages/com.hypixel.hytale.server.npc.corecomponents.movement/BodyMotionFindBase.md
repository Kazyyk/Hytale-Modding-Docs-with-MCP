---
title: "BodyMotionFindBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionFindBase"
api_surface: false
extends: "BodyMotionBase"
implements: "AStarEvaluator"
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
public abstract class BodyMotionFindBase<T extends AStarBase> extends BodyMotionBase implements AStarEvaluator
```

Abstract base class for pathfinding motions with A* integration. Manages the pathfinding lifecycle: path computation, path following, throttling, and debug visualization. Subclasses provide goal-reached and goal-evaluation logic.

## Key Fields

| Field | Type | Description |
|---|---|---|
| `nodesPerTick` | `int` | Maximum A* nodes expanded per tick |
| `useBestPath` | `boolean` | Whether to use the best partial path if goal is unreachable |
| `throttleDelayMin` | `double` | Minimum delay between path recomputations |
