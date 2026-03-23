---
title: "ForcedMusicSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.ambience.systems"
fqcn: "com.hypixel.hytale.builtin.ambience.systems.ForcedMusicSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ambience"
  - "audio"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.ambience.systems`

```java
public class ForcedMusicSystems
```

Container for ECS systems managing forced music state. `PlayerAdded` ensures the ambience tracker component on player entities and clears music on removal. `Tick` compares the player's tracked music index against the world's forced music index and sends `UpdateEnvironmentMusic` packets on change.
