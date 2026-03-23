---
title: "SensorPath"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.SensorPath"
api_surface: false
extends: "SensorBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "sensor"
  - "world"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class SensorPath extends SensorBase
```

Detects and follows paths of various types: world paths, prefab paths, or transient paths. Finds the nearest waypoint and provides path/position info. Supports path disallowing for variety. Each instance has a corresponding `BuilderSensorPath` class for JSON deserialization.
