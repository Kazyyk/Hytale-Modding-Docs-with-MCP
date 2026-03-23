# BlockBulkFindHereCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block.bulk | Extends: AbstractPlayerCommand

public class BlockBulkFindHereCommand extends AbstractPlayerCommand

## Fields

- @Nonnull private final FlagArg printNameArg
- @Nonnull private final RequiredArg<String> blockTypeArg
- @Nonnull private final DefaultArg<Integer> radiusArg

## Constructors

- public BlockBulkFindHereCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
