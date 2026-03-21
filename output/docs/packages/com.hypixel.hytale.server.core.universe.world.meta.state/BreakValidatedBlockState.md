---
title: "BreakValidatedBlockState"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.BreakValidatedBlockState"
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
public class BreakValidatedBlockState implements Component<ChunkStore>
```

Block state component that validates whether a block can be broken based on additional conditions. Attached to blocks that require custom break validation beyond the standard hardness/tool checks.
