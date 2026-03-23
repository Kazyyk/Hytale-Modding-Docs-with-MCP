# ModifyInventoryInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class ModifyInventoryInteraction extends SimpleInstantInteraction

Modifies items in the player's inventory. Supports removing items, adjusting held item quantity, adding items, adjusting held item durability, item transformation on break, and configurable break notifications. All operations fail gracefully by setting `InteractionState.Failed`. Waits for server data.

## Codec Properties

- RequiredGameMode | GameMode | No (inherited) | null | If set, the interaction only proceeds if the player is in this game mode.
- ItemToRemove | ItemStack | No (inherited) | null | Item to remove from the player's combined hotbar/backpack.
- AdjustHeldItemQuantity | int | No (inherited) | 0 | Positive values add copies; negative values remove from the held slot.
- ItemToAdd | ItemStack | No (inherited) | null | Item to add to the player's combined hotbar/backpack.
- AdjustHeldItemDurability | double | No (inherited) | 0.0 | Amount to adjust the held item's durability.
- BrokenItem | String | No (inherited) | null | Item ID to transform into when durability reaches zero. Use `"Empty"` to remove the item entirely.
- NotifyOnBreak | Boolean | No (inherited) | depends on context | If `true`, shows break message and plays break sound. Defaults to `true` for tools, `false` for transformations.
- NotifyOnBreakMessage | String | No (inherited) | null | Custom translation key for break notification. Supports `{itemName}` parameter. Defaults to `server.general.repair.itemBroken`.

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Executes the configured inventory modifications in order: game mode check, item removal, quantity adjustment, item addition, and durability adjustment with optional break transformation and notification.


@Nonnull
@Override
protected Interaction generatePacket()

Returns a new `com.hypixel.hytale.protocol.ModifyInventoryInteraction` packet.


@Override
protected void configurePacket(Interaction packet)

Populates the protocol packet with `itemToRemove`, `adjustHeldItemQuantity`, `itemToAdd`, `brokenItem`, and `adjustHeldItemDurability`.


@Nonnull
@Override
public String toString()

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ModifyInventoryInteraction> CODEC
private GameMode requiredGameMode
private ItemStack itemToRemove
private int adjustHeldItemQuantity
private ItemStack itemToAdd
private double adjustHeldItemDurability
private String brokenItem
private Boolean notifyOnBreak
private String notifyOnBreakMessage
