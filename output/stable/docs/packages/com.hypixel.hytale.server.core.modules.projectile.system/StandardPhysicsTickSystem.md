---
title: "StandardPhysicsTickSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile.system"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.system.StandardPhysicsTickSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "projectile"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.system`

```java
public class StandardPhysicsTickSystem extends EntityTickingSystem<EntityStore>
```

ECS system handling StandardPhysicsTick tick processing.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
