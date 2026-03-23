# PIDCheckCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: CommandBase

public class PIDCheckCommand extends CommandBase

Checks process IDs for singleplayer mode verification.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_COMMANDS_PID_CHECK_SINGLEPLAYER_ONLY
private final FlagArg singleplayerFlag
private final OptionalArg<Integer> pidArg
