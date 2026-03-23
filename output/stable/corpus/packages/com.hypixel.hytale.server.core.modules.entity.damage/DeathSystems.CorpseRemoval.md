# DeathSystems.CorpseRemoval

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DeathSystems.CorpseRemoval extends EntityTickingSystem<EntityStore>

A ticking system that removes dead non-player entity corpses from the world. Applies to entities with a `DeathComponent` but without a `Player` component. Waits for the death interaction chain to finish (if one exists), then either removes the entity immediately or waits for a DeferredCorpseRemoval timer to expire before removal.

## Related Types

- DeathSystems -- parent class
- DeathComponent -- checked for interaction chain state
- DeferredCorpseRemoval -- optional delay timer
- DeathSystems.RunDeathInteractions -- sets the interaction chain

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,DeferredCorpseRemoval> DEFERRED_CORPSE_REMOVAL_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
