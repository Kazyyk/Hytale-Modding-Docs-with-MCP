---
title: "RemovalSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.removal"
fqcn: "com.hypixel.hytale.builtin.instances.removal.RemovalSystem"
api_surface: false
extends: "TickingSystem<ChunkStore>"
implements: 
  - "RunWhenPausedSystem<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "instances"
---

**Package:** `com.hypixel.hytale.builtin.instances.removal`

```java
public class RemovalSystem extends TickingSystem<ChunkStore> implements RunWhenPausedSystem<ChunkStore>
```

ECS system extending `TickingSystem<ChunkStore>`. Processes entities each tick.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `tick(float dt, int systemIndex, @Nonnull Store<ChunkStore> store)` | `void` | public method. |
| `shouldRemoveWorld(@Nonnull Store<ChunkStore> store)` | `boolean` | static public method. |
