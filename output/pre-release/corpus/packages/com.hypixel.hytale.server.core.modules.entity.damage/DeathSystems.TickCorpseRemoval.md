# DeathSystems.TickCorpseRemoval

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DeathSystems.TickCorpseRemoval extends EntityTickingSystem<EntityStore>

Ticks the `DeferredCorpseRemoval` timer for dead non-player entities. Only ticks when the death interaction chain (if any) has finished.

## Relationships

- Inner class of DeathSystems

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,DeferredCorpseRemoval> DEFERRED_CORPSE_REMOVAL_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
