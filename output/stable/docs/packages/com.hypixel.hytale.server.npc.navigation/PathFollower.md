---
title: "PathFollower"
kind: "class"
package: "com.hypixel.hytale.server.npc.navigation"
fqcn: "com.hypixel.hytale.server.npc.navigation.PathFollower"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "navigation"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.navigation`

```java
public class PathFollower
```

Steers an entity along a waypoint path. Handles waypoint radius detection, path smoothing via binary-search line-of-sight skipping, heading blending, rejection-based steering, and frozen waypoint support for final approach.
