# EquipItemInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class EquipItemInteraction extends SimpleInstantInteraction

Equips the currently held item into the appropriate armor slot. Checks if the held item has an `ItemArmor` configuration, determines the target armor slot from `ArmorSlot.ordinal()`, and moves the item from the held container to the armor container. If the move fails, the interaction state is set to `Failed`. Waits for server data.

## Codec Properties

Inherits all codec properties from `SimpleInstantInteraction`. No additional properties.

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Retrieves the `LivingEntity` inventory, checks if the held item has armor configuration, and performs a `MoveTransaction` from the active slot to the armor container.


@Nonnull
@Override
public String toString()

## See Also

- `ItemArmor` -- provides armor slot configuration
- `MoveTransaction` -- handles the item move between containers
