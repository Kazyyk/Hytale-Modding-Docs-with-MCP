---
title: "ItemContainerBlockState"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.ItemContainerBlockState"
api_surface: false
extends: "ItemContainerState"
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
public class ItemContainerBlockState extends ItemContainerState implements Component<ChunkStore>
```

Block state component for blocks that contain items (e.g., chests, barrels). Extends `ItemContainerState` with chunk-store ECS integration. Manages serialization of the contained inventory alongside block metadata.
