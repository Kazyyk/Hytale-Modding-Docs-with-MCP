---
title: "DestroyableBlockState"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.DestroyableBlockState"
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
public class DestroyableBlockState implements Component<ChunkStore>
```

Block state component for blocks with a destroyable health system. Tracks remaining hit points and handles damage application. When health reaches zero, the block is destroyed.
