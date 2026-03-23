# DamageEntityInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction

public class DamageEntityInteraction extends Interaction

Damages the target entity. This is the primary combat interaction that calculates damage from configured base values, applies angled and targeted damage overrides, processes armor resistance and knockback modifiers, and queues damage events. Supports branching to different follow-up interactions based on success, failure, block, angle, or hit detail.

## Codec Properties

- DamageCalculator | DamageCalculator | No (inherited) | -- | Configuration for how damage values are calculated.
- DamageEffects | DamageEffects | No (inherited) | null | Visual and audio effects to apply on damage (particles, sounds, knockback, camera effects).
- AngledDamage | AngledDamage[] | No (inherited) | -- | Array of angle-based damage overrides. Each entry can override the damage calculator and effects based on the hit angle relative to the target's facing direction.
- TargetedDamage | Map<String, TargetedDamage> | Yes (inherited) | empty map | Map of named targeted damage entries keyed by hit detail string.
- EntityStatsOnHit | EntityStatOnHit[] | No (inherited) | -- | EntityStats to apply based on the number of hits resulting from this interaction.
- Next | String` (interaction ref) | No (inherited) | null | The interaction to run when this interaction succeeds.
- Failed | String` (interaction ref) | No (inherited) | null | The interaction to run when this interaction fails.
- Blocked | String` (interaction ref) | No (inherited) | null | The interaction to run when this interaction is blocked.

## Constants

- int ARMOR_RESISTANCE_FLAT_MODIFIER
- int ARMOR_RESISTANCE_MULTIPLIER_MODIFIER

## Methods


@Override
protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Main tick logic. Validates the target entity, processes queued damage results, or initiates new damage calculation. If the target is invalid, jumps to the failed label.


@Override
protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Delegates to `tick0` for simulation.


@Override
public void compile(@Nonnull OperationsBuilder builder)

Compiles the interaction into operation labels for failed, success, blocked, angled, and targeted damage branches.


@Override
public boolean walk(@Nonnull Collector collector, @Nonnull InteractionContext context)

Returns `false`.


@Nonnull
@Override
protected com.hypixel.hytale.protocol.Interaction generatePacket()

Returns a new `com.hypixel.hytale.protocol.DamageEntityInteraction` packet.


@Override
protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)

Populates the protocol packet with damage effects, next/failed/blocked references, angled damage, entity stats on hit, and targeted damage.


@Override
public boolean needsRemoteSync()

Returns `true`.


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.None`.

## Inner Classes

- AngledDamage -- angle-based damage override with configurable angle and distance thresholds
- EntityStatOnHit -- entity stat adjustment scaled by hit count
- TargetedDamage -- named damage override with optional damage calculator, effects, and follow-up interaction

## See Also

- DamageCalculator -- computes base damage values
- DamageEffects -- visual/audio/knockback effects
- Knockback -- knockback force calculation

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private boolean processDamage(InteractionContext context, Damage[] queuedDamage)
  public void compile(OperationsBuilder builder)
  public boolean walk(Collector collector, InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public WaitForDataFrom getWaitForDataFrom()
  private void attemptEntityDamage0(Damage.Source source, InteractionContext context, Ref<EntityStore> attackerRef, Ref<EntityStore> targetRef, Vector4d hit)
  private static void calculateKnockbackAndArmorModifiers(DamageClass damageClass, Object2FloatMap<DamageCause> damage, Ref<EntityStore> targetRef, Ref<EntityStore> attackerRef, float[] armorDamageModifiers, double[] knockbackMultiplier, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<DamageEntityInteraction> CODEC
private static final int FAILED_LABEL_INDEX
private static final int SUCCESS_LABEL_INDEX
private static final int BLOCKED_LABEL_INDEX
private static final int ANGLED_LABEL_OFFSET
public static final int ARMOR_RESISTANCE_FLAT_MODIFIER
public static final int ARMOR_RESISTANCE_MULTIPLIER_MODIFIER
private static final MetaKey<DamageCalculatorSystems.Sequence> SEQUENTIAL_HITS
private static final MetaKey<Integer> NEXT_INDEX
private static final MetaKey<Damage[]> QUEUED_DAMAGE
protected DamageCalculator damageCalculator
protected DamageEffects damageEffects
protected DamageEntityInteraction.AngledDamage[] angledDamage
protected DamageEntityInteraction.EntityStatOnHit[] entityStatsOnHit
protected Map<String,DamageEntityInteraction.TargetedDamage> targetedDamage
protected String[] sortedTargetDamageKeys
protected String next
protected String blocked
protected String failed
