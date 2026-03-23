# IncreaseBackpackCapacityInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class IncreaseBackpackCapacityInteraction extends SimpleInstantInteraction

Increases the player's backpack capacity by a configured amount. Resizes the backpack, sends a confirmation message to the player, and consumes one of the held item. Waits for server data.

## Codec Properties

- Capacity | short | No (inherited) | 1 | The amount by which the backpack capacity is increased. Minimum value: 1.

## Fields

- short capacity

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Gets the `Player` component, calculates new backpack capacity, calls `Inventory.resizeBackpack`, sends a translated size message, and removes one item from the held slot.


@Override
public String toString()
