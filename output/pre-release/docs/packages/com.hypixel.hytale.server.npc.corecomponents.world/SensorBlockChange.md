---
title: "SensorBlockChange"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.SensorBlockChange"
api_surface: false
extends: "SensorBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "sensor"
  - "world"
  - "blocks"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class SensorBlockChange extends SensorBase
```

Detects when the block at a cached position has changed since it was last observed, using chunk section change counters. Each instance has a corresponding `BuilderSensorBlockChange` class for JSON deserialization.
