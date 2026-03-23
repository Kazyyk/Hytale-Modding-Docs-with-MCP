# BlockSelectCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block | Extends: AbstractPlayerCommand

public class BlockSelectCommand extends AbstractPlayerCommand

## Methods

- public BlockSelectCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )

Also in this package: BlockCommand, BlockGetCommand, BlockGetStateCommand, BlockInspectFillerCommand, BlockInspectPhysicsCommand, BlockInspectRotationCommand, BlockRowCommand, BlockSetCommand, BlockSetStateCommand, BlockSetTickingCommand, SimpleBlockCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final SingleArgumentType<BlockFlipType> BLOCK_FLIP_TYPE
private static final SingleArgumentType<VariantRotation> VARIANT_ROTATION
private static final Message MESSAGE_COMMANDS_BLOCK_SELECT_DONE
private static final Message MESSAGE_COMMANDS_BLOCK_SELECT_NO_SELECTION_PROVIDER
private final OptionalArg<String> regexArg
private final FlagArg allFlag
private final OptionalArg<String> sortArg
private final OptionalArg<BlockFlipType> flipTypeArg
private final OptionalArg<VariantRotation> variantRotationArg
private final DefaultArg<Integer> paddingArg
private final OptionalArg<String> groundArg
