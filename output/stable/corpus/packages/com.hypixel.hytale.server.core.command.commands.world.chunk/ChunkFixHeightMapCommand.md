# ChunkFixHeightMapCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractWorldCommand

public class ChunkFixHeightMapCommand extends AbstractWorldCommand

Recalculates a chunk's heightmap and invalidates lighting at the specified chunk coordinates.

Also in this package: ChunkCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkMaxSendRateCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTintCommand, ChunkTrackerCommand, ChunkUnloadCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  private static void fixHeightMap(CommandContext context, World world, int chunkX, int chunkZ)

Fields:
private static final Message MESSAGE_COMMANDS_CHUNK_FIXHEIGHTMAP_STARTED
private static final Message MESSAGE_COMMANDS_CHUNK_FIXHEIGHTMAP_DONE
private static final Message MESSAGE_COMMANDS_CHUNK_FIXHEIGHTMAP_INVALIDATING_LIGHTING
private final RequiredArg<RelativeChunkPosition> chunkPosArg
