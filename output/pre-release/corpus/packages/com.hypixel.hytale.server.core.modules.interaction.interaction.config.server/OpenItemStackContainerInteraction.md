# OpenItemStackContainerInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class OpenItemStackContainerInteraction extends SimpleInstantInteraction

Opens a container embedded within the currently held item stack. Retrieves the `ItemStackContainerConfig` from the held item, ensures a configured `ItemStackItemContainer` exists, and opens it as an `ItemStackContainerWindow` on the `Page.Bench` page. Only opens if no custom page is already active.

## Codec Properties

Inherits all codec properties from `SimpleInstantInteraction`. No additional properties.

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Gets the player component, verifies no custom page is open, retrieves the held item's container config, ensures the `ItemStackItemContainer` is initialized, and opens the window.

## See Also

- `ItemStackContainerConfig` -- configuration for item-embedded containers
- `ItemStackItemContainer` -- container implementation for items
- `ItemStackContainerWindow` -- the window shown to the player

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction (and 11 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
public static final BuilderCodec<OpenItemStackContainerInteraction> CODEC
