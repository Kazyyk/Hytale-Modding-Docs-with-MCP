---
title: "BlockSpawner"
kind: "class"
package: "com.hypixel.hytale.builtin.blockspawner.state"
fqcn: "com.hypixel.hytale.builtin.blockspawner.state.BlockSpawner"
api_surface: false
extends: ~
implements: ['Component']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builtin"
  - "blockspawner"
  - "state"
---

**Package:** `com.hypixel.hytale.builtin.blockspawner.state`

```java
public class BlockSpawner implements Component<ChunkStore>
```

ECS component stored in `ChunkStore`. Serialized via `BuilderCodec`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<ChunkStore, BlockSpawner>` | Accessor method. |
| `getBlockSpawnerId()` | `String` | Accessor method. |
| `setBlockSpawnerId(String blockSpawnerId)` | `void` | Mutator method. |
