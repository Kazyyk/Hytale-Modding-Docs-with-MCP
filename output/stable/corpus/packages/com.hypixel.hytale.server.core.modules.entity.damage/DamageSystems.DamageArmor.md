# DamageSystems.DamageArmor

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.DamageArmor extends DamageEventSystem

Reduces the durability of a random non-broken armor piece on the damaged entity when the damage cause has `durabilityLoss` enabled. Part of the inspect damage group. Collects all non-broken armor slots, selects one at random, and decreases its durability by 3.

## Related Types

- DamageSystems -- parent class
- DamageCause -- checked for `isDurabilityLoss()`
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final Query<EntityStore> QUERY
