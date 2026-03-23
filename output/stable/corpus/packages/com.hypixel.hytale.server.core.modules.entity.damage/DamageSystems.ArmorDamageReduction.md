# DamageSystems.ArmorDamageReduction

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

@Deprecated
public static class DamageSystems.ArmorDamageReduction extends DamageEventSystem

Reduces incoming damage based on the target entity's equipped armor resistances. Part of the filter damage group. For each armor piece, collects flat and multiplicative resistance modifiers per damage cause. If the cause does not bypass resistances, applies flat reduction first then multiplicative reduction. Walks the damage cause inheritance chain to apply parent resistances. Also includes resistance contributions from active entity effects. Applies broken item penalties when applicable.

## Inner Types

- DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers -- holds accumulated flat and multiplier modifiers

## Static Methods


@Nonnull
public static Map<DamageCause, DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers> getResistanceModifiers(
    @Nonnull World world,
    @Nonnull ItemContainer inventory,
    boolean canApplyItemStackPenalties,
    @Nullable EffectControllerComponent effectControllerComponent
)

Calculates aggregate resistance modifiers from an armor inventory and active entity effects. Returns a map of `DamageCause` to accumulated flat and multiplicative modifiers.

## Related Types

- DamageSystems -- parent class
- DamageCause -- damage type used as map key for resistances
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public static Map<DamageCause,DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers> getResistanceModifiers(World world, ItemContainer inventory, boolean canApplyItemStackPenalties, EffectControllerComponent effectControllerComponent)
  private static void calculateResistanceEntryModifications(Entry<DamageCause,StaticModifier[]> entry, World world, Map<DamageCause,DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers> result, boolean canApplyItemStackPenalties, boolean itemStackIsBroken, double flatResistance)
  private static void addResistanceModifiersFromEntityEffects(Map<DamageCause,DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers> resistanceModifiers, EffectControllerComponent effectControllerComponent)

Fields:
private static final Query<EntityStore> QUERY
