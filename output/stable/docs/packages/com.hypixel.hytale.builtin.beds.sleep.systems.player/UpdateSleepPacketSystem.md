---
title: "UpdateSleepPacketSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.player"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.player.UpdateSleepPacketSystem"
api_surface: false
extends: "DelayedEntitySystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "sleep"
  - "beds"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.systems.player`

```java
public class UpdateSleepPacketSystem extends DelayedEntitySystem<EntityStore>
```

Sends `UpdateSleepState` packets to players at 0.25s intervals. Generates gray fade, black screen, sleep clock, and multiplayer sleep status based on player/world sleep state.
