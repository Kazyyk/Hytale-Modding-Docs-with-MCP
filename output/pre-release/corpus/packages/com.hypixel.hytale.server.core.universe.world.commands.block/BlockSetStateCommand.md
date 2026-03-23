# BlockSetStateCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block | Extends: SimpleBlockCommand

public class BlockSetStateCommand extends SimpleBlockCommand

## Methods

- public BlockSetStateCommand()
- protected void executeWithBlock(@Nonnull CommandContext context, @Nonnull WorldChunk chunk, int x, int y, int z)

Also in this package: BlockCommand, BlockGetCommand, BlockGetStateCommand, BlockInspectFillerCommand, BlockInspectPhysicsCommand, BlockInspectRotationCommand, BlockRowCommand, BlockSelectCommand, BlockSetCommand, BlockSetTickingCommand, SimpleBlockCommand

Complete API:
  protected void executeWithBlock(CommandContext context, WorldChunk chunk, int x, int y, int z)

Fields:
private final RequiredArg<String> stateArg
