---
title: "GenericVelocityInstructionSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.systems"
fqcn: "com.hypixel.hytale.server.core.modules.physics.systems.GenericVelocityInstructionSystem"
api_surface: false
extends: "EntityTickingSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "physics"
  - "systems"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.physics.systems`

```java
public class GenericVelocityInstructionSystem extends EntityTickingSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Set<Dependency<EntityStore>>` | `dependencies` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Nonnull @Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
