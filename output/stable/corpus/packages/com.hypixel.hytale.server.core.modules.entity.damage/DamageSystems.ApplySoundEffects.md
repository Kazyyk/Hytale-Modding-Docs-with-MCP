# DamageSystems.ApplySoundEffects

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.ApplySoundEffects extends DamageEventSystem

Plays impact sound effects when a damage event carries `IMPACT_SOUND_EFFECT` or `PLAYER_IMPACT_SOUND_EFFECT` metadata. Part of the inspect damage group. The general impact sound is played as a 3D sound at the hit location for all nearby players (excluding the attacker). The player-specific impact sound is played only for the damaged player if they are a `Player` entity.

## Related Types

- DamageSystems -- parent class
- Damage.SoundEffect -- the sound data read from the meta store
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public void handleInternal(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public SystemGroup<EntityStore> getGroup()

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final ComponentType<EntityStore,Player> PLAYER_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
