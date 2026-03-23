---
title: "ArchetypeTickingSystem"
kind: "class"
package: "com.hypixel.hytale.component.system.tick"
fqcn: "com.hypixel.hytale.component.system.tick.ArchetypeTickingSystem"
api_surface: true
extends: "TickingSystem<ECS_TYPE>"
implements: ["QuerySystem<ECS_TYPE>"]
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
public abstract class ArchetypeTickingSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE> implements QuerySystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `test(@Nonnull ComponentRegistry<ECS_TYPE> componentRegistry, @Nonnull Archetype<ECS_TYPE> archetype)` |
| `public` | `boolean` | `isExplicitQuery()` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)` |
| `public abstract` | `void` | `tick(float var1, @Nonnull ArchetypeChunk<ECS_TYPE> var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)` |
