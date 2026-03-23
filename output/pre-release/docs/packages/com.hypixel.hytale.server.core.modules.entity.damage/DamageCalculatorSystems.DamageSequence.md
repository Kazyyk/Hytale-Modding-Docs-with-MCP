---
title: "DamageCalculatorSystems.DamageSequence"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageCalculatorSystems.DamageSequence"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "calculator"
  - "sequence"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageCalculatorSystems.DamageSequence
```

Tracks the state of sequential hits within a damage interaction chain. Attached to [Damage](Damage.md) events via the `DamageCalculatorSystems.DAMAGE_SEQUENCE` meta key. Wraps a [Sequence](DamageCalculatorSystems.Sequence.md) hit counter, a `DamageCalculator` configuration, and optional entity stat modifications on hit.

## Constructor

```java
public DamageSequence(@Nonnull DamageCalculatorSystems.Sequence sequence, @Nonnull DamageCalculator damageCalculator)
```

Creates a damage sequence with a hit counter and damage calculator configuration.

## Methods

```java
public int getSequentialHits()
```

Returns the current number of sequential hits from the underlying `Sequence`.

```java
public void addSequentialHit()
```

Increments the sequential hit counter.

```java
@Nonnull
public DamageCalculator getDamageCalculator()
```

Returns the `DamageCalculator` configuration controlling sequential damage scaling.

```java
@Nullable
public DamageEntityInteraction.EntityStatOnHit[] getEntityStatOnHit()
```

Returns the array of entity stat modifications to apply on each hit, or `null`.

```java
public void setEntityStatOnHit(@Nullable DamageEntityInteraction.EntityStatOnHit[] entityStatOnHit)
```

Sets the entity stat modifications to apply on hit.

## Related Types

- [DamageCalculatorSystems](DamageCalculatorSystems.md) -- parent class
- [DamageCalculatorSystems.Sequence](DamageCalculatorSystems.Sequence.md) -- the hit counter
- [DamageCalculatorSystems.SequenceModifier](DamageCalculatorSystems.SequenceModifier.md) -- system that reads this data
