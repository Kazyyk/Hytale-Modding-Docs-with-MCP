---
title: "SensorBlock"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.SensorBlock"
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
public class SensorBlock extends SensorBase
```

Detects blocks from a configured block set within range. Caches found blocks with chunk revision tracking and optional block reservation via `ResourceView`. Each instance has a corresponding `BuilderSensorBlock` class for JSON deserialization.
