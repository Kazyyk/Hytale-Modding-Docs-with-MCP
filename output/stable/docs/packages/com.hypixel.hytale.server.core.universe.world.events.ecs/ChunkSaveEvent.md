---
title: "ChunkSaveEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.events.ecs"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.ecs.ChunkSaveEvent"
api_surface: false
extends: "CancellableEcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "events"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.events.ecs`

```java
public class ChunkSaveEvent extends CancellableEcsEvent
```

Cancellable ECS event that can be intercepted by event systems.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getChunk()` | `WorldChunk` | Accessor method. |
