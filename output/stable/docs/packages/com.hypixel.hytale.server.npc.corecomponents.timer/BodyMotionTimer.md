---
title: "BodyMotionTimer"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.BodyMotionTimer"
api_surface: false
extends: "MotionTimer<BodyMotion>"
implements: 
  - "BodyMotion"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "timer"
  - "behavior"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.timer`

```java
public class BodyMotionTimer extends MotionTimer<BodyMotion> implements BodyMotion
```

Concrete body motion timer. Wraps a `BodyMotion` with a random time limit. Delegates `getSteeringMotion()` to the wrapped motion.

