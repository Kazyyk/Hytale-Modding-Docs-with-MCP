# RespawnSystems.ReenableVoiceOnRespawn

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.ReenableVoiceOnRespawn extends RespawnSystems.OnRespawnSystem

Re-enables voice chat for the player on respawn. Unsets the silenced flag on the `VoicePlayerState`, sends updated voice configuration, and schedules an immediate position update for proximity-based voice.

## Relationships

- Inner class of RespawnSystems
- Counterpart to `DeathSystems.StopVoiceOnDeath`

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentRemoved(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
