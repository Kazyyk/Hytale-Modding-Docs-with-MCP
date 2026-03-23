# DamageSystems.HackKnockbackValues

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

@Deprecated
public static class DamageSystems.HackKnockbackValues extends EntityTickingSystem<EntityStore>

A deprecated ticking system in the filter damage group that scales knockback velocity on the X and Z axes by `PLAYER_KNOCKBACK_SCALE` (default 25.0). Only applies when the knockback component has no velocity config or split velocity modification is enabled. This is a temporary workaround and is marked for replacement.

## Static Fields

- PLAYER_KNOCKBACK_SCALE | float | Scale multiplier for knockback X/Z velocity: `25.0`.

## Related Types

- DamageSystems -- parent class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public boolean isParallel(int archetypeChunkSize, int taskCount)

Fields:
public static float PLAYER_KNOCKBACK_SCALE
private static final Query<EntityStore> QUERY
