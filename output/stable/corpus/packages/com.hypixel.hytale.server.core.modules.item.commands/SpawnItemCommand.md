# SpawnItemCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.item.commands | Extends: AbstractPlayerCommand

public class SpawnItemCommand extends AbstractPlayerCommand

## Fields

- private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- private final RequiredArg<Item> itemArg
- private final DefaultArg<Integer> quantityArg
- private final OptionalArg<Integer> countArg
- private final DefaultArg<Float> forceArg

## Methods

- @Override protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private final RequiredArg<Item> itemArg
private final DefaultArg<Integer> quantityArg
private final OptionalArg<Integer> countArg
private final DefaultArg<Float> forceArg
