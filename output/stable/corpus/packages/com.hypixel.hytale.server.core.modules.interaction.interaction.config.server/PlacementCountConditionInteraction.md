# PlacementCountConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class PlacementCountConditionInteraction extends SimpleInstantInteraction

Condition interaction that checks the placement count of a specific block type. Queries the `BlockCounter` resource to get how many of the configured block type have been placed, then compares against the threshold value. The interaction succeeds if the condition is met, fails otherwise. Waits for server data.

## Codec Properties

- Block | String | Yes (inherited) | -- | The block type ID to check placement count for.
- Value | int | No (inherited) | 0 | The threshold value for comparison.
- LessThan | boolean | No (inherited) | true | If `true`, succeeds when count < value. If `false`, succeeds when count > value.

## Fields

- String blockType
- int value
- boolean lessThan

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Retrieves the `BlockCounter` resource, gets the placement count for the configured block type, and sets state to `Finished` or `Failed` based on the comparison.


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.

## See Also

- `BlockCounter` -- resource that tracks block placement counts

Also in this package: AngledDamage, BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public WaitForDataFrom getWaitForDataFrom()

Fields:
public static final BuilderCodec<PlacementCountConditionInteraction> CODEC
private String blockType
private int value
private boolean lessThan
