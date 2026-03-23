---
title: "HeadMotionObserve"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.HeadMotionObserve"
api_surface: false
extends: "HeadMotionBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "motion"
  - "world"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class HeadMotionObserve extends HeadMotionBase
```

Head motion that sweeps the NPC's gaze across an angle range with configurable pause times, segment counts, and random angle selection. Uses model camera settings for yaw limits. Each instance has a corresponding `BuilderHeadMotionObserve` class for JSON deserialization.
