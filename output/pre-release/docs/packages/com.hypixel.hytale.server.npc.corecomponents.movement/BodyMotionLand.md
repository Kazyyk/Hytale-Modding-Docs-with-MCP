---
title: "BodyMotionLand"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionLand"
api_surface: false
extends: "BodyMotionFind"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "bodymotion"
  - "movement"
  - "flying"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

```java
public class BodyMotionLand extends BodyMotionFind
```

Lands a flying NPC on the ground. Extends `BodyMotionFind` with a goal lenience check. When the NPC is within `goalLenience` of the ground and at low altitude, switches the motion controller to walk mode by calling `requestControllerSwitch("Walk")`.
