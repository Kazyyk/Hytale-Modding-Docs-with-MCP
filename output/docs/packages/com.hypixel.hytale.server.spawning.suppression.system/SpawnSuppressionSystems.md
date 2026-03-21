---
title: "SpawnSuppressionSystems"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression.system"
fqcn: "com.hypixel.hytale.server.spawning.suppression.system.SpawnSuppressionSystems"
api_surface: false
extends: null
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
public class SpawnSuppressionSystems
```

Container for entity-level spawn suppression ECS systems. Inner class `Suppressor` registers/unregisters suppression zones when entities spawn or are removed. Inner class `Load` rebuilds suppression maps on world load and asset reload. Inner class `EnsureNetworkSendable` adds network IDs to suppression components.
