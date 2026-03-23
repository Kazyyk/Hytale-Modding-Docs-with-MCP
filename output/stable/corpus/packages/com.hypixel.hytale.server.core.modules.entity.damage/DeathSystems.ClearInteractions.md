# DeathSystems.ClearInteractions

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.ClearInteractions extends DeathSystems.OnDeathSystem

Clears the entity's `InteractionManager` on death, cancelling any active interaction chains. Runs as a root dependency (first). Requires the entity to have an `InteractionManager` component.

## Related Types

- DeathSystems -- parent class
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,InteractionManager> INTERACTION_MANAGER_COMPONENT_TYPE
