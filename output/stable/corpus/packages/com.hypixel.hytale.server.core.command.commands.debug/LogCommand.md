# LogCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: CommandBase

public class LogCommand extends CommandBase

Manages server log levels at runtime. Supports list, set, and filter operations.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Level[] STANDARD_LEVELS
private static final String LEVELS_STRING
private static final SingleArgumentType<Level> LOG_LEVEL
private final RequiredArg<String> loggerArg
private final OptionalArg<Level> levelArg
private final FlagArg saveFlag
private final FlagArg resetFlag
