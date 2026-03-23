# RefillContainerInteraction.RefillState

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

protected static class RefillContainerInteraction.RefillState

Configuration for a single refill state within a RefillContainerInteraction. Defines which fluids can trigger this state, the resulting durability value, and an optional fluid to place at the source location after refilling.

## Codec Properties

- AllowedFluids | String[] | Yes | Array of fluid asset IDs that trigger this refill state.
- TransformFluid | String | No | Fluid asset ID to place at the source block after refilling. If not set, the source fluid is unchanged.
- Durability | double | No (default: `-1.0`) | Durability value for the refilled item. If `-1.0`, durability is not explicitly set.

## Fields

- String[] allowedFluids
- String transformFluid
- double durability

## Methods


public String[] getAllowedFluids()


public String getTransformFluid()


public double getDurability()


@Nonnull
@Override
public String toString()

## See Also

- RefillContainerInteraction

Also in this package: AngledDamage, BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction (and 13 more)

Complete API:
  public String[] getAllowedFluids()
  public String getTransformFluid()
  public double getDurability()
  public String toString()

Fields:
public static final BuilderCodec<RefillContainerInteraction.RefillState> CODEC
protected String[] allowedFluids
protected String transformFluid
protected double durability
