---
title: "ActionOverrideAltitude"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.ActionOverrideAltitude"
api_surface: false
extends: "ActionBase"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "action"
  - "movement"
  - "flying"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

```java
public class ActionOverrideAltitude extends ActionBase
```

Overrides the NPC's target altitude for flying by setting `desiredAltitudeOverride` on the active `MotionControllerFly`. Only executes when the active motion controller type is `"Fly"`.
