# InventoryItemCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.inventory | Extends: AbstractPlayerCommand

public class InventoryItemCommand extends AbstractPlayerCommand

## Methods

- public InventoryItemCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )

Also in this package: GiveArmorCommand, GiveCommand, GiveOtherCommand, InventoryBackpackCommand, InventoryClearCommand, InventoryCommand, InventorySeeCommand, ItemStateCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_INVENTORY_ITEM_NO_ITEM_IN_HAND
private static final Message MESSAGE_COMMANDS_INVENTORY_ITEM_NO_CONTAINER_ON_ITEM
