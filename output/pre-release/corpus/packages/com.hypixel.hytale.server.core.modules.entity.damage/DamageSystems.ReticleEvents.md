# DamageSystems.ReticleEvents

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.ReticleEvents extends DamageEventSystem

Sends reticle hit/kill events to the attacking player. Part of the inspect damage group. When positive damage is dealt from an entity source, sends an `ON_HIT` reticle event to the source player, or `ON_KILL` if the target entity is dead. These events trigger crosshair feedback animations on the client.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- required source type
- DeathComponent -- checked to determine kill vs hit
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final int EVENT_ON_HIT_TAG_INDEX
private static final int EVENT_ON_KILL_TAG_INDEX
private static final ReticleEvent ON_HIT
private static final ReticleEvent ON_KILL
