---
title: "AStarNodePool"
kind: "interface"
package: "com.hypixel.hytale.server.npc.navigation"
fqcn: "com.hypixel.hytale.server.npc.navigation.AStarNodePool"
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
public interface AStarNodePool
```

Object pool interface for A* nodes. Provides `allocate()` and `deallocate(AStarNode)` to reduce garbage collection pressure during pathfinding.
