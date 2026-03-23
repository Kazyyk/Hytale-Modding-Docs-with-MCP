---
title: "SensorEvent"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.SensorEvent"
api_surface: false
extends: "SensorBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "sensor"
  - "world"
  - "events"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class SensorEvent extends SensorBase
```

Listens for named events from the NPC's blackboard event view, matching by event name. Each instance has a corresponding `BuilderSensorEvent` class for JSON deserialization.
