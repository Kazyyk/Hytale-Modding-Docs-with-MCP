---
title: "SoundUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.SoundUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "sound"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class SoundUtil
```

Utility class for playing sound events. Provides static methods for 2D sounds (to all players or a specific player), 3D positional sounds (with spatial filtering based on `SoundEvent.getMaxDistance()`), entity-attached sounds, and local player sounds. Supports volume/pitch modifiers and visibility-based filtering via `Entity.isHiddenFromLivingEntity()`.