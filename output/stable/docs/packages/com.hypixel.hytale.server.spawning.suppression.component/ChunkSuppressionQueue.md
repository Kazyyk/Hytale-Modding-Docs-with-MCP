---
title: "ChunkSuppressionQueue"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression.component"
fqcn: "com.hypixel.hytale.server.spawning.suppression.component.ChunkSuppressionQueue"
api_surface: false
extends: ~
implements: 
  - "Resource<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "spawning"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.spawning.suppression.component`

```java
public class ChunkSuppressionQueue implements Resource<ChunkStore>
```

Implementation of `Resource<ChunkStore>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<ChunkStore, ChunkSuppressionQueue>` | static public method. |
| `getToAdd()` | `List<Entry<Ref<ChunkStore>, ChunkSuppressionEntry>>` | public method. |
| `getToRemove()` | `List<Ref<ChunkStore>>` | public method. |
| `queueForAdd(@Nonnull Ref<ChunkStore> reference, @Nonnull ChunkSuppressionEntry entry)` | `void` | public method. |
| `queueForRemove(Ref<ChunkStore> reference)` | `void` | public method. |
| `clone()` | `Resource<ChunkStore>` | public method. |
