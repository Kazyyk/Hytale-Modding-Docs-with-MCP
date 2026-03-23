---
title: "EntityTickingSystem"
kind: "class"
package: "com.hypixel.hytale.component.system.tick"
fqcn: "com.hypixel.hytale.component.system.tick.EntityTickingSystem"
api_surface: true
extends: "ArchetypeTickingSystem<ECS_TYPE>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "tick"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system.tick`

```java
public abstract class EntityTickingSystem<ECS_TYPE> extends ArchetypeTickingSystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected static` | `boolean` | `maybeUseParallel(int archetypeChunkSize, int taskCount)` |
| `protected static` | `boolean` | `useParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `@Override public` | `void` | `tick(float dt, @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk, @Nonnull Store<ECS_TYPE> store, @Nonnull CommandBuffer<ECS_TYPE> commandBuffer)` |
| `public abstract` | `void` | `tick(float var1, int var2, @Nonnull ArchetypeChunk<ECS_TYPE> var3, @Nonnull Store<ECS_TYPE> var4, @Nonnull CommandBuffer<ECS_TYPE> var5)` |
| `public static` | `<ECS_TYPE> void` | `doTick(@Nonnull EntityTickingSystem<ECS_TYPE> system,
        float dt,
        @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk,
        @Nonnull Store<ECS_TYPE> store,
        @Nonnull CommandBuffer<ECS_TYPE> commandBuffer)` |

## Inner Types

- `EntityTickingSystem.SystemTaskData`
