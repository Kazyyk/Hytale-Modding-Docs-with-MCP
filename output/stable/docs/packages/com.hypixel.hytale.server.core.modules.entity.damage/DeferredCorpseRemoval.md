---
title: "DeferredCorpseRemoval"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeferredCorpseRemoval"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "corpse"
  - "component"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DeferredCorpseRemoval implements Component<EntityStore>
```

An ECS component that adds a time delay before a dead entity's corpse is removed from the world. Used by [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md) to keep corpses visible for a configured duration. The timer counts down each tick, and the corpse is removed when it reaches zero.

## Static Methods

```java
public static ComponentType<EntityStore, DeferredCorpseRemoval> getComponentType()
```

Returns the registered component type from [DamageModule](DamageModule.md).

## Constructor

```java
public DeferredCorpseRemoval(double timeUntilCorpseRemoval)
```

Creates a deferred removal timer with the given duration in seconds.

## Methods

```java
public boolean tick(float dt)
```

Decrements the remaining time by `dt`. Returns `true` when the timer has expired (time remaining <= 0).

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Creates a copy with the current remaining time.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `timeRemaining` | `double` | `protected` | Seconds remaining before corpse removal. |

## Related Types

- [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md) -- ticking system that checks this timer
- [DamageModule](DamageModule.md) -- registers this component type
