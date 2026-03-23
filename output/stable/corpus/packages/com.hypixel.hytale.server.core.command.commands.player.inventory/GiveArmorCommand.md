# GiveArmorCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.inventory | Extends: AbstractAsyncCommand

public class GiveArmorCommand extends AbstractAsyncCommand

## Fields

- private static final String PREFIX

## Methods

- public GiveArmorCommand()
- protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: GiveCommand, GiveOtherCommand, InventoryBackpackCommand, InventoryClearCommand, InventoryCommand, InventoryItemCommand, InventorySeeCommand, ItemStateCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private static final String PREFIX
private static final Message MESSAGE_COMMANDS_GIVEARMOR_SUCCESS
private final OptionalArg<String> playerArg
private final RequiredArg<String> searchStringArg
private final FlagArg setFlag
