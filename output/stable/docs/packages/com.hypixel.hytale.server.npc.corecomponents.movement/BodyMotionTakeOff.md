---
title: "BodyMotionTakeOff"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionTakeOff"
api_surface: false
extends: "BodyMotionBase"
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
public class BodyMotionTakeOff extends BodyMotionBase
```

Launches a grounded NPC into the air for flying. Applies an upward velocity impulse at the configured `jumpSpeed` and requests a motion controller switch to `"Fly"` mode.
