---
title: "SensorLight"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.SensorLight"
api_surface: false
extends: "SensorBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "sensor"
  - "world"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class SensorLight extends SensorBase
```

Checks the block light level at the NPC's position against a configured range, using the chunk lighting system. Each instance has a corresponding `BuilderSensorLight` class for JSON deserialization.
