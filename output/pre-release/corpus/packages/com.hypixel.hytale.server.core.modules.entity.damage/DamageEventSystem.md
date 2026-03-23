# DamageEventSystem

Type: abstract class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityEventSystem<EntityStore, Damage>

public abstract class DamageEventSystem extends EntityEventSystem<EntityStore, Damage>

Abstract base class for ECS systems that process Damage events on the `EntityStore`. Parameterizes `EntityEventSystem` with `Damage.class` so subclasses only need to implement the `handle()` method to react to incoming damage events. Nearly all damage processing systems in DamageSystems extend this class.

## Constructor


protected DamageEventSystem()

Calls `super(Damage.class)` to register this system as a handler for `Damage` events.

## Related Types

- Damage -- the event type this system processes
- DamageSystems -- contains the concrete implementations
- DamageCalculatorSystems.SequenceModifier -- another subclass
- DamageModule -- registers all damage event systems

Known subclasses: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, CameraEffectSystem, CollectDamage, DamageArmor, DamageAttackerTool, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DamageStamina, EntityUIEvents, FilterDamageSystem, FilterNPCWorldConfig, FilterPlayerFlockDamageSystem, FilterPlayerWorldConfig, FilterUnkillable, HitAnimation, OnDamageDealt, OnDamageReceived, OnMinecartHit, PlayerDamageFilterSystem, PlayerHitIndicators, RecordLastCombat, ReticleEvents, SequenceModifier, TrackLastDamage, WieldingDamageReduction, WieldingKnockbackReduction

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)
