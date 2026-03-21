---
title: "DeployableTrapSpawnerConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.config"
fqcn: "com.hypixel.hytale.builtin.deployables.config.DeployableTrapSpawnerConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "deployables"
  - "config"
---

**Package:** `com.hypixel.hytale.builtin.deployables.config`

```java
public class DeployableTrapSpawnerConfig
```

Trap-spawner hybrid extending `DeployableTrapConfig`. On trigger, spawns child deployables from configured `DeployableSpawner` entries at offset positions around the trap. Manages a multi-phase state machine: deploy, animate, fuse, live, triggered, despawn.
