# ChunkUnloadCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractWorldCommand

public class ChunkUnloadCommand extends AbstractWorldCommand

Unloads a chunk at the specified coordinates.

Also in this package: ChunkCommand, ChunkFixHeightMapCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkMaxSendRateCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTintCommand, ChunkTrackerCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<RelativeChunkPosition> chunkPosArg
