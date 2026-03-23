# BlockRowCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block | Extends: AbstractPlayerCommand

public class BlockRowCommand extends AbstractPlayerCommand

## Fields

- private static final int MAX_MATCHES

## Methods

- public BlockRowCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )
- private void spawnBlocksRow(@Nonnull World world, @Nonnull Vector3d origin, @Nonnull Vector3i direction, @Nonnull List<BlockType> blockTypes)
- private static Vector3i getDominantCardinal(@Nonnull Vector3d direction)
- private static Axis getAxis(@Nonnull Vector3i direction)
- private List<BlockType> findBlockTypes(String wildcardQuery)

Also in this package: BlockCommand, BlockGetCommand, BlockGetStateCommand, BlockInspectFillerCommand, BlockInspectPhysicsCommand, BlockInspectRotationCommand, BlockSelectCommand, BlockSetCommand, BlockSetStateCommand, BlockSetTickingCommand, SimpleBlockCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private void spawnBlocksRow(World world, Vector3d origin, Vector3i direction, List<BlockType> blockTypes)
  private static Vector3i getDominantCardinal(Vector3d direction)
  private static Axis getAxis(Vector3i direction)
  private List<BlockType> findBlockTypes(String wildcardQuery)

Fields:
private final RequiredArg<String> queryArg
private static final int MAX_MATCHES
