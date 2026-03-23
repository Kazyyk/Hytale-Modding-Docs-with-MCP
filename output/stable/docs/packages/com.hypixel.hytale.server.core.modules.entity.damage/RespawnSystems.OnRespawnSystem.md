---
title: "RespawnSystems.OnRespawnSystem"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.OnRespawnSystem"
api_surface: false
extends: "RefChangeSystem<EntityStore, DeathComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public abstract static class RespawnSystems.OnRespawnSystem extends RefChangeSystem<EntityStore, DeathComponent>
```

Abstract base class for systems that react to `DeathComponent` removal (respawn). Extends `RefChangeSystem` parameterized with `DeathComponent`. Subclasses override `onComponentRemoved()` to handle respawn. The `onComponentAdded()` and `onComponentSet()` methods are no-ops by default.

## Methods

```java
@Nonnull
@Override
public ComponentType<EntityStore, DeathComponent> componentType()
```

Returns `DeathComponent.getComponentType()`.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [DeathComponent](DeathComponent.md) -- the component tracked
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- similar base that reacts to addition
