# DeathSystems.PlayerKilledPlayer

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.PlayerKilledPlayer extends DeathSystems.OnDeathSystem

Sends a "killed entity" chat message to the attacking player when they kill a named player entity via `PHYSICAL` or `PROJECTILE` damage. Only triggers if both the victim and attacker are `Player` entities and the victim has a `Nameplate` component.

## Related Types

- DeathSystems -- parent class
- DeathSystems.OnDeathSystem -- base class
- DamageCause -- checks for `PHYSICAL` and `PROJECTILE`

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Query<EntityStore> QUERY
