---
title: "DamageEventSystem"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageEventSystem"
api_surface: false
extends: "EntityEventSystem<EntityStore, Damage>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public abstract class DamageEventSystem extends EntityEventSystem<EntityStore, Damage>
```

Abstract base class for ECS systems that process [Damage](Damage.md) events on the `EntityStore`. Parameterizes `EntityEventSystem` with `Damage.class` so subclasses only need to implement the `handle()` method to react to incoming damage events. Nearly all damage processing systems in [DamageSystems](DamageSystems.md) extend this class.

## Constructor

```java
protected DamageEventSystem()
```

Calls `super(Damage.class)` to register this system as a handler for `Damage` events.

## Related Types

- [Damage](Damage.md) -- the event type this system processes
- [DamageSystems](DamageSystems.md) -- contains the concrete implementations
- [DamageCalculatorSystems.SequenceModifier](DamageCalculatorSystems.SequenceModifier.md) -- another subclass
- [DamageModule](DamageModule.md) -- registers all damage event systems
