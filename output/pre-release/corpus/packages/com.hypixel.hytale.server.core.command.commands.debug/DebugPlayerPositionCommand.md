# DebugPlayerPositionCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: AbstractPlayerCommand

public class DebugPlayerPositionCommand extends AbstractPlayerCommand

Displays detailed player position, head rotation, and teleport state.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DuplicatedAssetInfo, Graph, HitDetectionCommand, HudManagerTestCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static String fmtPos(Vector3d vector)
  private static String fmtRot(Vector3f vector)
  private static String fmtDegrees(float radians)
