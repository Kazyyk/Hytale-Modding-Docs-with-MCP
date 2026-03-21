---
title: "SendableBlockState"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.SendableBlockState"
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
public class SendableBlockState implements Component<ChunkStore>
```

Block state component marking blocks whose state data must be sent to clients. Used as a flag to include block state information in chunk data packets sent during world streaming.
