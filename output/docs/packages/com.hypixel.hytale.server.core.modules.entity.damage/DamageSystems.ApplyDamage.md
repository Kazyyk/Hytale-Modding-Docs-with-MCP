---
title: "DamageSystems.ApplyDamage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ApplyDamage"
api_surface: false
extends: "DamageEventSystem"
implements:
  - "EntityStatsSystems.StatModifyingSystem"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "health"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.ApplyDamage extends DamageEventSystem implements EntityStatsSystems.StatModifyingSystem
```

The core damage application system. Runs after the gather and filter groups and before the inspect group. Rounds the final damage amount, subtracts it from the entity's health stat, and triggers death (by adding a [DeathComponent](DeathComponent.md)) if health reaches the minimum. Cancels damage if the entity is already dead.

## Methods

```java
public void handle(int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)
```

If the entity already has a `DeathComponent`, cancels the damage. Otherwise rounds the amount to a whole number, subtracts from health, and adds a `DeathComponent` if health drops to the minimum.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage](Damage.md) -- the event processed
- [DeathComponent](DeathComponent.md) -- added when an entity dies
- [DamageEventSystem](DamageEventSystem.md) -- base class
