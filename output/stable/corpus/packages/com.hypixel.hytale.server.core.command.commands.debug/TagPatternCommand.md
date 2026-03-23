# TagPatternCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: CommandBase

public class TagPatternCommand extends CommandBase

Tests a tag pattern against a specific block type and reports the match result.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, VersionCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final SingleArgumentType<TagPattern> TAG_PATTERN_ARG_TYPE
private final RequiredArg<TagPattern> tagPatternArg
private final RequiredArg<BlockType> blockTypeArg
