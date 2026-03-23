# InventorySeeCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.inventory | Extends: AbstractPlayerCommand

public class InventorySeeCommand extends AbstractPlayerCommand

## Constants

- public static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD

## Methods

- public InventorySeeCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )

Also in this package: GiveArmorCommand, GiveCommand, GiveOtherCommand, InventoryBackpackCommand, InventoryClearCommand, InventoryCommand, InventoryItemCommand, ItemStateCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
public static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private final RequiredArg<PlayerRef> targetPlayerArg
