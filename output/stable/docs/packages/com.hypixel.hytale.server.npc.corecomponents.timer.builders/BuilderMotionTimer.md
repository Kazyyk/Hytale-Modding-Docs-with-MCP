---
title: "BuilderMotionTimer"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.builders.BuilderMotionTimer"
api_surface: false
extends: "BuilderMotionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "timer"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.timer.builders`

```java
public abstract class BuilderMotionTimer extends BuilderMotionBase<T>
```

Abstract base builder for motion timers. Reads `Time` (double range, default [1.0, 1.0]) and `Motion` (child motion reference) from JSON configuration.
