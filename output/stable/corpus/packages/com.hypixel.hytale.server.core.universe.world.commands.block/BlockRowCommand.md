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
