---
title: "AmbientEmitterSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.ambience.systems"
fqcn: "com.hypixel.hytale.builtin.ambience.systems.AmbientEmitterSystems"
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
public class AmbientEmitterSystems
```

Container for ECS systems managing ambient sound emitter entities. `EntityAdded` ensures network ID, intangible, and prefab-copyable components. `EntityRefAdded` spawns a child audio entity with the emitter's sound event. `Ticking` synchronizes the child entity's position and removes orphaned emitters.
