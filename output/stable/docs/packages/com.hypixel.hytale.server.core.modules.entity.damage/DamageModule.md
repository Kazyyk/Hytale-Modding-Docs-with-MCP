---
title: "DamageModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "module"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DamageModule extends JavaPlugin
```

Core server module that registers all damage-related ECS components, systems, and system groups on the `EntityStore`. Acts as the central coordination point for the damage pipeline. Depends on `EntityModule`, `EntityStatsModule`, and `EntityUIModule`.

The module registers three system groups that define the damage processing order:
1. **Gather** -- systems that generate damage events (fall, drowning, out-of-world)
2. **Filter** -- systems that cancel or modify damage (armor, invulnerability, world config)
3. **Inspect** -- systems that react to final damage (particles, sounds, animations, UI)

## Static Methods

```java
public static DamageModule get()
```

Returns the singleton instance of the module.

## Constructor

```java
public DamageModule(@Nonnull JavaPluginInit init)
```

Constructs the module and sets the singleton instance.

## Methods

```java
public ComponentType<EntityStore, DeathComponent> getDeathComponentType()
```

Returns the registered `ComponentType` for [DeathComponent](DeathComponent.md).

```java
public ComponentType<EntityStore, DeferredCorpseRemoval> getDeferredCorpseRemovalComponentType()
```

Returns the registered `ComponentType` for [DeferredCorpseRemoval](DeferredCorpseRemoval.md).

```java
public SystemGroup<EntityStore> getGatherDamageGroup()
```

Returns the system group for damage-gathering systems.

```java
public SystemGroup<EntityStore> getFilterDamageGroup()
```

Returns the system group for damage-filtering systems.

```java
public SystemGroup<EntityStore> getInspectDamageGroup()
```

Returns the system group for damage-inspection systems.

## Registered Systems

The `setup()` method registers all of the following systems on the entity store:

**Damage Processing:**
- [DamageSystems.ApplyDamage](DamageSystems.ApplyDamage.md)
- [DamageSystems.CanBreathe](DamageSystems.CanBreathe.md)
- [DamageSystems.OutOfWorldDamage](DamageSystems.OutOfWorldDamage.md)
- [DamageSystems.FallDamagePlayers](DamageSystems.FallDamagePlayers.md)
- [DamageSystems.FallDamageNPCs](DamageSystems.FallDamageNPCs.md)

**Filtering:**
- [DamageSystems.FilterPlayerWorldConfig](DamageSystems.FilterPlayerWorldConfig.md)
- [DamageSystems.FilterNPCWorldConfig](DamageSystems.FilterNPCWorldConfig.md)
- [DamageSystems.FilterUnkillable](DamageSystems.FilterUnkillable.md)
- [DamageSystems.PlayerDamageFilterSystem](DamageSystems.PlayerDamageFilterSystem.md)
- [DamageSystems.WieldingDamageReduction](DamageSystems.WieldingDamageReduction.md)
- [DamageSystems.WieldingKnockbackReduction](DamageSystems.WieldingKnockbackReduction.md)
- [DamageSystems.ArmorKnockbackReduction](DamageSystems.ArmorKnockbackReduction.md)
- [DamageSystems.ArmorDamageReduction](DamageSystems.ArmorDamageReduction.md)
- [DamageSystems.HackKnockbackValues](DamageSystems.HackKnockbackValues.md)

**Post-Damage:**
- [DamageSystems.RecordLastCombat](DamageSystems.RecordLastCombat.md)
- [DamageSystems.ApplyParticles](DamageSystems.ApplyParticles.md)
- [DamageSystems.ApplySoundEffects](DamageSystems.ApplySoundEffects.md)
- [DamageSystems.HitAnimation](DamageSystems.HitAnimation.md)
- [DamageSystems.TrackLastDamage](DamageSystems.TrackLastDamage.md)
- [DamageSystems.DamageArmor](DamageSystems.DamageArmor.md)
- [DamageSystems.DamageStamina](DamageSystems.DamageStamina.md)
- [DamageSystems.DamageAttackerTool](DamageSystems.DamageAttackerTool.md)
- [DamageSystems.PlayerHitIndicators](DamageSystems.PlayerHitIndicators.md)
- [DamageSystems.ReticleEvents](DamageSystems.ReticleEvents.md)
- [DamageSystems.EntityUIEvents](DamageSystems.EntityUIEvents.md)

**Death:**
- [DeathSystems.ClearHealth](DeathSystems.ClearHealth.md) through [DeathSystems.SpawnedDeathAnimation](DeathSystems.SpawnedDeathAnimation.md)

**Respawn:**
- [RespawnSystems.ResetStatsRespawnSystem](RespawnSystems.ResetStatsRespawnSystem.md) through [RespawnSystems.ClearRespawnUI](RespawnSystems.ClearRespawnUI.md)

**Calculator:**
- [DamageCalculatorSystems.SequenceModifier](DamageCalculatorSystems.SequenceModifier.md)

**Commands:**
- [DesyncDamageCommand](DesyncDamageCommand.md)

## Inner Types

- [DamageModule.OrderGatherFilter](DamageModule.OrderGatherFilter.md) -- deprecated ordering system between gather and filter groups

## Related Types

- [DamageSystems](DamageSystems.md) -- the damage processing systems
- [DeathSystems](DeathSystems.md) -- the death processing systems
- [RespawnSystems](RespawnSystems.md) -- the respawn processing systems
