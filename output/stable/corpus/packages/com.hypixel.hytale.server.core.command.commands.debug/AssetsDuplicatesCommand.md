# AssetsDuplicatesCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: AbstractAsyncCommand

public class AssetsDuplicatesCommand extends AbstractAsyncCommand

Async command that scans common assets for duplicate files and reports them sorted by size.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private final FlagArg reverseFlag
