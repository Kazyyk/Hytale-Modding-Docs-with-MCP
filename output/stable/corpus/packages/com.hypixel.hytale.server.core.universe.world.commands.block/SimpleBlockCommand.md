# SimpleBlockCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block | Extends: AbstractWorldCommand

public abstract class SimpleBlockCommand extends AbstractWorldCommand

## Methods

- public SimpleBlockCommand(@Nonnull String name, @Nonnull String description)
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
- protected abstract void executeWithBlock(@Nonnull CommandContext var1, @Nonnull WorldChunk var2, int var3, int var4, int var5)

Known subclasses: BlockGetCommand, BlockGetStateCommand, BlockSetCommand, BlockSetStateCommand, BlockSetTickingCommand

Also in this package: BlockCommand, BlockGetCommand, BlockGetStateCommand, BlockInspectFillerCommand, BlockInspectPhysicsCommand, BlockInspectRotationCommand, BlockRowCommand, BlockSelectCommand, BlockSetCommand, BlockSetStateCommand, BlockSetTickingCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  protected abstract void executeWithBlock(CommandContext var1, WorldChunk var2, int var3, int var4, int var5)

Fields:
private static final Message MESSAGE_COMMANDS_ERROR_EXCEPTION
private final RequiredArg<RelativeIntPosition> coordsArg
