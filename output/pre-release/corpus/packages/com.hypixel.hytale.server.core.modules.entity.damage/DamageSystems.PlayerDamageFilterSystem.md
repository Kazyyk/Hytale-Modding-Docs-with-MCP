# DamageSystems.PlayerDamageFilterSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.PlayerDamageFilterSystem extends DamageEventSystem

Cancels damage to players who have spawn protection active, and cancels player-vs-player damage when PvP is disabled in the world config. Part of the filter damage group. Checks `Player.hasSpawnProtection()` first; if the player is not protected, checks if PvP is disabled and the source is another player, cancelling the damage if so.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- checked for PvP source detection
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final Query<EntityStore> QUERY
