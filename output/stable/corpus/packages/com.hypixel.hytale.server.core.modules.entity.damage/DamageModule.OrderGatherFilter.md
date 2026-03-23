# DamageModule.OrderGatherFilter

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: ISystem<EntityStore>

@Deprecated
public static class DamageModule.OrderGatherFilter implements ISystem<EntityStore>

Deprecated ordering system that establishes the dependency relationship between the gather damage group and the filter damage group. Ensures gather systems execute before filter systems. This is a no-op system that exists solely for its dependency declarations.

## Methods


@Nonnull
@Override
public Set<Dependency<EntityStore>> getDependencies()

Returns dependencies declaring this system runs AFTER the gather group and BEFORE the filter group.

## Related Types

- DamageModule -- parent class that registers this system

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()

Fields:
private final Set<Dependency<EntityStore>> dependencies
