---
title: "SpawnControllerSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.controllers"
fqcn: "com.hypixel.hytale.server.spawning.controllers.SpawnControllerSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "controllers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.controllers`

```java
public abstract class SpawnControllerSystem<J extends SpawnJob, T extends SpawnController<J>> extends EntityTickingSystem<EntityStore>
```

Abstract system that ticks spawn controllers to generate new spawn jobs when conditions are met (players present, spawning enabled, population below expected).
