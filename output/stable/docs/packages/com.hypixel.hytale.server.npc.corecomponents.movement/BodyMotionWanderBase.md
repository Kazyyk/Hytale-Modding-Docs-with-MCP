---
title: "BodyMotionWanderBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionWanderBase"
api_surface: false
extends: "BodyMotionFindBase<AStarBase>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "bodymotion"
  - "movement"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

```java
public abstract class BodyMotionWanderBase extends BodyMotionFindBase<AStarBase>
```

Abstract base for wandering behaviors. Extends `BodyMotionFindBase` with configurable idle pause durations between wander goals. Subclasses define the wander area shape.
