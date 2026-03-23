# PacketStatsCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: AbstractTargetPlayerCommand

public class PacketStatsCommand extends AbstractTargetPlayerCommand

Displays network packet statistics for a target player.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)
  private static PacketStatsRecorder.PacketStatsEntry findEntry(PacketStatsRecorder recorder, String name)
  private static List<String> getEntryNames(PacketStatsRecorder recorder)

Fields:
private final RequiredArg<String> packetArg
