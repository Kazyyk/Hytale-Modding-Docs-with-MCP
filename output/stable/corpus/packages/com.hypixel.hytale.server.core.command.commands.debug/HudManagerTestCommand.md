# HudManagerTestCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug | Extends: AbstractTargetPlayerCommand

public class HudManagerTestCommand extends AbstractTargetPlayerCommand

Shows or hides HUD components and toggles HUD test mode.

Also in this package: AssetLongestAssetNameCommand, AssetTagsCommand, AssetsCommand, AssetsDuplicatesCommand, Clear, DebugPlayerPositionCommand, DuplicatedAssetInfo, Graph, HitDetectionCommand, LogCommand, MessageTranslationTestCommand, PIDCheckCommand, PacketStatsCommand, PingCommand, ShowBuilderToolsHudCommand, StopNetworkChunkSendingCommand, TagPatternCommand, VersionCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_HUD_TEST_SHOWN_SELF
private static final Message MESSAGE_COMMANDS_HUT_TEST_HIDDEN_SELF
private final FlagArg resetHudFlag
