# ItemStateCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.inventory | Extends: AbstractPlayerCommand

public class ItemStateCommand extends AbstractPlayerCommand

## Methods

- public ItemStateCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )

Also in this package: GiveArmorCommand, GiveCommand, GiveOtherCommand, InventoryBackpackCommand, InventoryClearCommand, InventoryCommand, InventoryItemCommand, InventorySeeCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_ITEMSTATE_NO_ITEM
private final RequiredArg<String> stateArg
