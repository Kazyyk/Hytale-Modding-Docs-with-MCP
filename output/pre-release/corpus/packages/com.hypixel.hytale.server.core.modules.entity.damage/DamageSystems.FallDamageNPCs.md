# DamageSystems.FallDamageNPCs

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DamageSystems.FallDamageNPCs extends EntityTickingSystem<EntityStore>

Calculates and applies fall damage to non-player living entities. Part of the gather damage group. Only active when fall damage is enabled in the world config. Uses a quadratic curve: `damage% = (0.58 * (yVelocity - minFallSpeed))^2 + 10`. Rolling mitigates damage: full mitigation below `maxFallSpeedRollFullMitigation`, partial mitigation below `maxFallSpeedToEngageRoll`. Resets fall distance after landing.

## Static Fields

- CURVE_MODIFIER | float | Fall damage curve modifier: `0.58`.
- CURVE_MULTIPLIER | float | Fall damage curve power: `2.0`.
- MIN_DAMAGE | double | Minimum damage percentage: `10.0`.

## Related Types

- DamageSystems -- parent class
- DamageSystems.FallDamagePlayers -- equivalent system for players
- DamageCause -- uses `FALL` cause

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public boolean isParallel(int archetypeChunkSize, int taskCount)

Fields:
static final float CURVE_MODIFIER
static final float CURVE_MULTIPLIER
public static final double MIN_DAMAGE
