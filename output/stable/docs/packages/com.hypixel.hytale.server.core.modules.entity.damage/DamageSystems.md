---
title: "DamageSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DamageSystems
```

Container class for all ECS systems that process damage events on the `EntityStore`. Provides static utility methods for dispatching damage and defines inner system classes organized into three groups: gather (damage generation), filter (damage modification/cancellation), and inspect (post-damage effects). All systems are registered by [DamageModule](DamageModule.md).

## Static Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_DAMAGE_DELAY` | `float` | Default delay between damage ticks: `1.0` seconds. |

## Static Methods

```java
public static void executeDamage(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Damage damage)
```

Dispatches a damage event to the specified entity via a `ComponentAccessor`.

```java
public static void executeDamage(int index, @Nonnull ArchetypeChunk<EntityStore> chunk, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)
```

Dispatches a damage event to the entity at the given index within an archetype chunk.

```java
public static void executeDamage(@Nonnull Ref<EntityStore> ref, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)
```

Dispatches a damage event to the specified entity via a `CommandBuffer`.

## Inner Types -- Gather Group

- [DamageSystems.CanBreathe](DamageSystems.CanBreathe.md) -- drowning and suffocation damage
- [DamageSystems.OutOfWorldDamage](DamageSystems.OutOfWorldDamage.md) -- damage from falling below the world
- [DamageSystems.FallDamagePlayers](DamageSystems.FallDamagePlayers.md) -- fall damage for players
- [DamageSystems.FallDamageNPCs](DamageSystems.FallDamageNPCs.md) -- fall damage for NPCs

## Inner Types -- Filter Group

- [DamageSystems.FilterPlayerWorldConfig](DamageSystems.FilterPlayerWorldConfig.md) -- cancels player damage when disabled
- [DamageSystems.FilterNPCWorldConfig](DamageSystems.FilterNPCWorldConfig.md) -- cancels NPC damage when disabled
- [DamageSystems.FilterUnkillable](DamageSystems.FilterUnkillable.md) -- cancels damage on dead, invulnerable, or intangible entities
- [DamageSystems.PlayerDamageFilterSystem](DamageSystems.PlayerDamageFilterSystem.md) -- spawn protection and PvP checks
- [DamageSystems.ArmorDamageReduction](DamageSystems.ArmorDamageReduction.md) -- reduces damage based on armor resistances
- [DamageSystems.ArmorKnockbackReduction](DamageSystems.ArmorKnockbackReduction.md) -- reduces knockback based on armor
- [DamageSystems.WieldingDamageReduction](DamageSystems.WieldingDamageReduction.md) -- reduces damage when blocking
- [DamageSystems.WieldingKnockbackReduction](DamageSystems.WieldingKnockbackReduction.md) -- reduces knockback when blocking
- [DamageSystems.HackKnockbackValues](DamageSystems.HackKnockbackValues.md) -- scales knockback velocity

## Inner Types -- Inspect Group

- [DamageSystems.ApplyDamage](DamageSystems.ApplyDamage.md) -- subtracts health and triggers death
- [DamageSystems.ApplyParticles](DamageSystems.ApplyParticles.md) -- spawns impact particles
- [DamageSystems.ApplySoundEffects](DamageSystems.ApplySoundEffects.md) -- plays impact sounds
- [DamageSystems.HitAnimation](DamageSystems.HitAnimation.md) -- plays hurt animations
- [DamageSystems.DamageArmor](DamageSystems.DamageArmor.md) -- reduces armor durability
- [DamageSystems.DamageAttackerTool](DamageSystems.DamageAttackerTool.md) -- reduces attacker weapon durability
- [DamageSystems.DamageStamina](DamageSystems.DamageStamina.md) -- drains stamina on blocked hits
- [DamageSystems.RecordLastCombat](DamageSystems.RecordLastCombat.md) -- records combat timestamps
- [DamageSystems.TrackLastDamage](DamageSystems.TrackLastDamage.md) -- records last damage time
- [DamageSystems.PlayerHitIndicators](DamageSystems.PlayerHitIndicators.md) -- sends hit indicator packets
- [DamageSystems.ReticleEvents](DamageSystems.ReticleEvents.md) -- sends reticle hit/kill events
- [DamageSystems.EntityUIEvents](DamageSystems.EntityUIEvents.md) -- sends combat text UI updates

## Related Types

- [Damage](Damage.md) -- the event processed by these systems
- [DamageEventSystem](DamageEventSystem.md) -- abstract base for most inner systems
- [DamageModule](DamageModule.md) -- registers all these systems
- [DeathSystems](DeathSystems.md) -- handles death after damage kills an entity
