---
title: "RespawnBlock"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.RespawnBlock"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "world"
  - "block-state"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta.state`

```java
public class RespawnBlock implements Component<ChunkStore>
```

Block state component for blocks that serve as respawn points. When a player interacts with a respawn block, their spawn location is updated to its position.
