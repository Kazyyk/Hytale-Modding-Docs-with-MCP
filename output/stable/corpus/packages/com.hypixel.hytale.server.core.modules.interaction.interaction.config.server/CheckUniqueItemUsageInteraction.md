# CheckUniqueItemUsageInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class CheckUniqueItemUsageInteraction extends SimpleInstantInteraction

Checks whether the player has already used a unique item. If the held item's ID has been previously recorded in the player's `UniqueItemUsagesComponent`, the interaction fails and a notification is sent. Otherwise, the usage is recorded and the interaction succeeds. Waits for server data (`WaitForDataFrom.Server`).

## Codec Properties

Inherits all codec properties from `SimpleInstantInteraction`. No additional properties.

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Checks `UniqueItemUsagesComponent.hasUsedUniqueItem()` for the held item ID. If already used, sets state to `Failed` and sends a translated notification. Otherwise records the usage and sets state to `Finished`.


@Override
public String toString()

## See Also

- `UniqueItemUsagesComponent` -- tracks per-player unique item usage records
- `NotificationUtil` -- sends the "already used" notification to the player

Also in this package: AngledDamage, BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<CheckUniqueItemUsageInteraction> CODEC
