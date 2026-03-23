# ChunkLoadCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractWorldCommand

public class ChunkLoadCommand extends AbstractWorldCommand

Loads a chunk at the specified coordinates, with optional mark-dirty flag.

Also in this package: ChunkCommand, ChunkFixHeightMapCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkMaxSendRateCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTintCommand, ChunkTrackerCommand, ChunkUnloadCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<RelativeChunkPosition> chunkPosArg
private final FlagArg markDirtyArg
