# ChunkForceTickCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractWorldCommand

public class ChunkForceTickCommand extends AbstractWorldCommand

Forces all blocks in a chunk to enter ticking state.

Also in this package: ChunkCommand, ChunkFixHeightMapCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkMaxSendRateCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTintCommand, ChunkTrackerCommand, ChunkUnloadCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<RelativeChunkPosition> chunkPosArg
