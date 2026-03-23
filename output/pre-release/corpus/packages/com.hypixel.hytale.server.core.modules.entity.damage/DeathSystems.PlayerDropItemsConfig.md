# DeathSystems.PlayerDropItemsConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.PlayerDropItemsConfig extends DeathSystems.OnDeathSystem

Configures the item loss parameters on the DeathComponent from the world's `DeathConfig` before items are actually dropped. Runs before DeathSystems.DropPlayerDeathItems. Sets the loss mode, amount loss percentage, and durability loss percentage.

## Related Types

- DeathSystems -- parent class
- DeathSystems.DropPlayerDeathItems -- runs after this system
- DeathComponent -- configured by this system
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Set<Dependency<EntityStore>> DEPENDENCIES
