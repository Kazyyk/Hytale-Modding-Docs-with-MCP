---
title: "EntityEventSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.EntityEventSystem"
api_surface: false
extends: "EcsEvent> extends EventSystem<EventType>"
implements: ["QuerySystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class EntityEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements QuerySystem<ECS_TYPE>
```

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `EntityEventSystem(@Nonnull Class<EventType> eventType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `void` | `handle(int var1, @Nonnull ArchetypeChunk<ECS_TYPE> var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4, @Nonnull EventType var5)` |
| `public` | `void` | `handleInternal(int index,
        @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk,
        @Nonnull Store<ECS_TYPE> store,
        @Nonnull CommandBuffer<ECS_TYPE> commandBuffer,
        @Nonnull EventType event)` |
