---
title: "WorldEventSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.WorldEventSystem"
api_surface: false
extends: "EcsEvent> extends EventSystem<EventType>"
implements: ["ISystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class WorldEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements ISystem<ECS_TYPE>
```

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `WorldEventSystem(@Nonnull Class<EventType> eventType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `void` | `handle(@Nonnull Store<ECS_TYPE> var1, @Nonnull CommandBuffer<ECS_TYPE> var2, @Nonnull EventType var3)` |
| `public` | `void` | `handleInternal(@Nonnull Store<ECS_TYPE> store, @Nonnull CommandBuffer<ECS_TYPE> commandBuffer, @Nonnull EventType event)` |
