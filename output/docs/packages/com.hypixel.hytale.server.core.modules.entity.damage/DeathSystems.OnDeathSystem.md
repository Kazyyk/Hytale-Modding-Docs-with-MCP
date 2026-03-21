---
title: "DeathSystems.OnDeathSystem"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.OnDeathSystem"
api_surface: false
extends: "RefChangeSystem<EntityStore, DeathComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public abstract static class DeathSystems.OnDeathSystem extends RefChangeSystem<EntityStore, DeathComponent>
```

Abstract base class for systems that react to `DeathComponent` lifecycle changes. Extends `RefChangeSystem` parameterized with `DeathComponent`. Subclasses override `onComponentAdded()` to handle death. The `onComponentSet()` and `onComponentRemoved()` methods are no-ops by default.

## Methods

```java
@Nonnull
@Override
public ComponentType<EntityStore, DeathComponent> componentType()
```

Returns `DeathComponent.getComponentType()`.

```java
public void onComponentSet(@Nonnull Ref<EntityStore> ref, DeathComponent oldComponent, @Nonnull DeathComponent newComponent, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
```

No-op default. Called when the component is replaced.

```java
public void onComponentRemoved(@Nonnull Ref<EntityStore> ref, @Nonnull DeathComponent component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
```

No-op default. Called when the component is removed (respawn).

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathComponent](DeathComponent.md) -- the component tracked
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- similar base that reacts to removal
