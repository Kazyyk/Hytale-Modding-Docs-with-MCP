# ChunkLightingCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractWorldCommand

public class ChunkLightingCommand extends AbstractWorldCommand

Dumps the lighting octree data for a block position to the server log.

Also in this package: ChunkCommand, ChunkFixHeightMapCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLoadCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkMaxSendRateCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTintCommand, ChunkTrackerCommand, ChunkUnloadCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_CHUNKINFO_SERIALIZED
private static final Message MESSAGE_COMMANDS_CHUNKINFO_SERIALIZED_FAILED
private final RequiredArg<RelativeIntPosition> positionArg
