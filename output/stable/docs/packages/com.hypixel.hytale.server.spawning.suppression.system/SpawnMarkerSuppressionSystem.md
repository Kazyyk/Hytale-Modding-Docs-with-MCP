---
title: "SpawnMarkerSuppressionSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression.system"
fqcn: "com.hypixel.hytale.server.spawning.suppression.system.SpawnMarkerSuppressionSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "spawning"
  - "suppression"
  - "class"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.spawning.suppression.system`

```java
public class SpawnMarkerSuppressionSystem extends RefSystem<EntityStore>
```

ECS system that suppresses spawn markers when they are within range of an active spawn suppressor entity. Checks spatial distance on entity add/load.
