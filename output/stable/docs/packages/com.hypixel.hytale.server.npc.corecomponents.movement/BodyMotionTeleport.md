---
title: "BodyMotionTeleport"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.movement"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.movement.BodyMotionTeleport"
api_surface: false
extends: "BodyMotionBase"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "bodymotion"
  - "movement"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.movement`

```java
public class BodyMotionTeleport extends BodyMotionBase
```

Teleports the NPC to a sensor-provided position with configurable offset range and cooldown. Attempts up to 10 random offset positions, validating each against ground clearance and position validity.

## Constants

| Constant | Value | Description |
|---|---|---|
| `MAX_TRIES` | `10` | Maximum teleport position attempts |
| `MIN_MOVE_CHANGE` | `1` | Minimum distance for teleport to be considered movement |
| `TELEPORT_COOLDOWN` | `0.5` | Cooldown in seconds between teleports |
