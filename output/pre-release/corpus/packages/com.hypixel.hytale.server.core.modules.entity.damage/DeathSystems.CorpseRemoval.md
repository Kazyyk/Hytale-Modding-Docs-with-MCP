# DeathSystems.CorpseRemoval

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DeathSystems.CorpseRemoval extends EntityTickingSystem<EntityStore>

Removes dead non-player entities from the store. If the entity has a `DeferredCorpseRemoval` component and its timer has expired, removes it and optionally spawns death particles. If no deferred removal, removes immediately after death interactions complete.

## Relationships

- Inner class of DeathSystems

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Query<EntityStore> QUERY
private static final Set<Dependency<EntityStore>> DEPENDENCIES
