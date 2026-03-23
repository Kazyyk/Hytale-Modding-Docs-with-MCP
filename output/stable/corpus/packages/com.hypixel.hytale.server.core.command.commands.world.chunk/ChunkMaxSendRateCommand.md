# ChunkMaxSendRateCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractTargetPlayerCommand

public class ChunkMaxSendRateCommand extends AbstractTargetPlayerCommand

Gets or sets the maximum chunk send rate (per second and per tick) for a player.

Also in this package: ChunkCommand, ChunkFixHeightMapCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTintCommand, ChunkTrackerCommand, ChunkUnloadCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final OptionalArg<Integer> secArg
private final OptionalArg<Integer> tickArg
