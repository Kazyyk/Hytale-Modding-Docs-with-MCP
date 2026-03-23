# DamageModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: JavaPlugin

public class DamageModule extends JavaPlugin

Core server module that registers all damage-related ECS components, systems, and system groups on the `EntityStore`. Acts as the central coordination point for the damage pipeline. Depends on `EntityModule`, `EntityStatsModule`, and `EntityUIModule`.

The module registers three system groups that define the damage processing order:
1. **Gather** -- systems that generate damage events (fall, drowning, out-of-world)
2. **Filter** -- systems that cancel or modify damage (armor, invulnerability, world config)
3. **Inspect** -- systems that react to final damage (particles, sounds, animations, UI)

## Static Methods


public static DamageModule get()

Returns the singleton instance of the module.

## Constructor


public DamageModule(@Nonnull JavaPluginInit init)

Constructs the module and sets the singleton instance.

## Methods


public ComponentType<EntityStore, DeathComponent> getDeathComponentType()

Returns the registered `ComponentType` for DeathComponent.


public ComponentType<EntityStore, DeferredCorpseRemoval> getDeferredCorpseRemovalComponentType()

Returns the registered `ComponentType` for DeferredCorpseRemoval.


public SystemGroup<EntityStore> getGatherDamageGroup()

Returns the system group for damage-gathering systems.


public SystemGroup<EntityStore> getFilterDamageGroup()

Returns the system group for damage-filtering systems.


public SystemGroup<EntityStore> getInspectDamageGroup()

Returns the system group for damage-inspection systems.

## Registered Systems

The `setup()` method registers all of the following systems on the entity store:

**Damage Processing:**
- DamageSystems.ApplyDamage
- DamageSystems.CanBreathe
- DamageSystems.OutOfWorldDamage
- DamageSystems.FallDamagePlayers
- DamageSystems.FallDamageNPCs

**Filtering:**
- DamageSystems.FilterPlayerWorldConfig
- DamageSystems.FilterNPCWorldConfig
- DamageSystems.FilterUnkillable
- DamageSystems.PlayerDamageFilterSystem
- DamageSystems.WieldingDamageReduction
- DamageSystems.WieldingKnockbackReduction
- DamageSystems.ArmorKnockbackReduction
- DamageSystems.ArmorDamageReduction
- DamageSystems.HackKnockbackValues

**Post-Damage:**
- DamageSystems.RecordLastCombat
- DamageSystems.ApplyParticles
- DamageSystems.ApplySoundEffects
- DamageSystems.HitAnimation
- DamageSystems.TrackLastDamage
- DamageSystems.DamageArmor
- DamageSystems.DamageStamina
- DamageSystems.DamageAttackerTool
- DamageSystems.PlayerHitIndicators
- DamageSystems.ReticleEvents
- DamageSystems.EntityUIEvents

**Death:**
- DeathSystems.ClearHealth through DeathSystems.SpawnedDeathAnimation

**Respawn:**
- RespawnSystems.ResetStatsRespawnSystem through RespawnSystems.ClearRespawnUI

**Calculator:**
- DamageCalculatorSystems.SequenceModifier

**Commands:**
- DesyncDamageCommand

## Inner Types

- DamageModule.OrderGatherFilter -- deprecated ordering system between gather and filter groups

## Related Types

- DamageSystems -- the damage processing systems
- DeathSystems -- the death processing systems
- RespawnSystems -- the respawn processing systems
