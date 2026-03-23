# AssetTagsCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: CommandBase

public class AssetTagsCommand extends CommandBase

Command listing assets matching a given tag pattern for a specified asset class.

Also in this package: AssetLongestAssetNameCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private final RequiredArg<String> classArg
private final RequiredArg<String> tagArg
