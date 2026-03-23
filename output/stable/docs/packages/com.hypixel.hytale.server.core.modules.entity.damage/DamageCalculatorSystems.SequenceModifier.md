---
title: "DamageCalculatorSystems.SequenceModifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageCalculatorSystems.SequenceModifier"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "calculator"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageCalculatorSystems.SequenceModifier extends DamageEventSystem
```

A [DamageEventSystem](DamageEventSystem.md) that applies sequential hit damage scaling. Runs after the gather and filter damage groups but before [DamageSystems.ApplyDamage](DamageSystems.ApplyDamage.md). For each damage event with a `DAMAGE_SEQUENCE` meta entry, it reduces damage based on the number of sequential hits using the damage calculator's `sequentialModifierStep` and `sequentialModifierMinimum`. Also processes entity stat modifications on hit (e.g., restoring stamina to the attacker).

## Methods

```java
@Nonnull
@Override
public Set<Dependency<EntityStore>> getDependencies()
```

Returns dependencies ensuring execution after gather/filter groups and before `ApplyDamage`.

```java
@Nonnull
@Override
public Query<EntityStore> getQuery()
```

Returns an empty archetype query (matches all entities).

```java
public void handle(int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)
```

If the damage amount is positive and the event has a `DAMAGE_SEQUENCE` meta, applies sequential scaling: `amount * max(1 - step * hits, minimum)`. Increments the hit counter and processes any `EntityStatOnHit` entries on the source entity.

## Related Types

- [DamageCalculatorSystems](DamageCalculatorSystems.md) -- parent class
- [DamageCalculatorSystems.DamageSequence](DamageCalculatorSystems.DamageSequence.md) -- the meta data read by this system
- [DamageEventSystem](DamageEventSystem.md) -- base class
- [DamageSystems.ApplyDamage](DamageSystems.ApplyDamage.md) -- runs after this system
