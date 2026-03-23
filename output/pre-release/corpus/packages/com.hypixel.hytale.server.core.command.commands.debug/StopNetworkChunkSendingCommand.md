# StopNetworkChunkSendingCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: AbstractPlayerCommand

public class StopNetworkChunkSendingCommand extends AbstractPlayerCommand

Enables or disables network chunk sending for the executing player.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<Boolean> sendNetworkChunksArg
