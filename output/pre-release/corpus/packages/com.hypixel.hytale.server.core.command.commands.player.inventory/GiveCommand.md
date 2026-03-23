# GiveCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.inventory | Extends: AbstractPlayerCommand

public class GiveCommand extends AbstractPlayerCommand

## Methods

- public GiveCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )
- protected void executeSync(@Nonnull CommandContext context)

Also in this package: GiveArmorCommand, GiveOtherCommand, InventoryBackpackCommand, InventoryClearCommand, InventoryCommand, InventoryItemCommand, InventorySeeCommand, ItemStateCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<Item> itemArg
private final DefaultArg<Integer> quantityArg
private final OptionalArg<Double> durabilityArg
private final OptionalArg<String> metadataArg
