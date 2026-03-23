---
title: "SensorEntityEvent"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.SensorEntityEvent"
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
public class SensorEntityEvent extends SensorBase
```

Listens for entity events (damage, interactions) from the NPC's blackboard event view and provides the event source position. Each instance has a corresponding `BuilderSensorEntityEvent` class for JSON deserialization.
