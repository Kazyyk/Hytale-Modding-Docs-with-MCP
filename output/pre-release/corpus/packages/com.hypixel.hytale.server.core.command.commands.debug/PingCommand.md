# PingCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: AbstractTargetPlayerCommand

public class PingCommand extends AbstractTargetPlayerCommand

Displays latency/ping statistics for a target player.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)
  private void sendDetailedMessage(CommandContext context, PlayerRef playerRef)
  private void sendShortMessage(CommandContext context, PlayerRef playerRef)

Fields:
private final FlagArg detailFlag
