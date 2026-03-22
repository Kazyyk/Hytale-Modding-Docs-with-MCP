---
title: "AStarBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.navigation"
fqcn: "com.hypixel.hytale.server.npc.navigation.AStarBase"
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
public class AStarBase
```

Core A* pathfinding implementation. Manages open/visited node lists, half-block grid indexing, search direction computation (2D/3D, diagonal), motion controller integration, and path construction. Supports node limits, optimized path building, and multiple path strategies (longest, furthest, closest).
