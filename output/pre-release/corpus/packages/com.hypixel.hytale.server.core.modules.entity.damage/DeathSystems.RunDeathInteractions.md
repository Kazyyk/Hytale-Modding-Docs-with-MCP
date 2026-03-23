# DeathSystems.RunDeathInteractions

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.RunDeathInteractions extends DeathSystems.OnDeathSystem

Initiates the entity's death interaction chain when it dies. Runs after DeathSystems.ClearEntityEffects. Looks up the death interaction ID from the entity's `Interactions` component (or falls back to the "Empty" unarmed interactions), creates a `RootInteraction`, and queues the interaction chain for execution. The chain is stored on the `DeathComponent` for tracking by DeathSystems.CorpseRemoval.

## Related Types

- DeathSystems -- parent class
- DeathSystems.CorpseRemoval -- waits for interaction chain to finish
- DeathComponent -- stores the interaction chain
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,Interactions> INTERACTIONS_COMPONENT_TYPE
private static final ComponentType<EntityStore,InteractionManager> INTERACTION_MANAGER_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
private static final Set<Dependency<EntityStore>> DEPENDENCIES
