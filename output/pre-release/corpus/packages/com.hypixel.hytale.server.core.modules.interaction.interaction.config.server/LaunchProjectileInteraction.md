# LaunchProjectileInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction | Implements: com.hypixel.hytale.server.core.modules.projectile.config.BallisticDataProvider

@Deprecated(forRemoval = true)
public class LaunchProjectileInteraction extends SimpleInstantInteraction implements BallisticDataProvider

**Deprecated (for removal).** Launches a projectile from the interacting entity. Assembles a default projectile holder from the configured ID, shoots it in the entity's look direction, handles item durability loss, and applies broken-item penalties. Also implements `BallisticDataProvider` to supply ballistic data from the referenced `Projectile` asset.

## Codec Properties

- ProjectileId | String | Yes (inherited) | -- | Asset ID of the projectile to launch. Validated against `Projectile.VALIDATOR_CACHE`.

## Fields

- String projectileId

## Methods


public String getProjectileId()

Returns the configured projectile asset ID.


@Nullable
@Override
public BallisticData getBallisticData()

Returns the `Projectile` asset looked up by `projectileId`, which implements `BallisticData`.


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Gets the entity's look transform, assembles and shoots a projectile, adds it to the world, reduces held item durability if applicable, and applies broken-weapon penalties.


@Override
protected void simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

No-op for simulation.

## See Also

- `Projectile` -- the projectile asset providing configuration and ballistic data
- `ProjectileComponent` -- assembles and shoots projectile entities

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  public String getProjectileId()
  public BallisticData getBallisticData()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
public static final BuilderCodec<LaunchProjectileInteraction> CODEC
protected String projectileId
