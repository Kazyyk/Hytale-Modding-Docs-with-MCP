# CommandBase

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractCommand

public abstract class CommandBase extends AbstractCommand

Abstract base class extending `AbstractCommand` that provides shared logic for CommandBase subclasses.

## Methods

- public CommandBase(@Nonnull String name, @Nonnull String description)
- public CommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public CommandBase(@Nonnull String description)
- @Nullable @Override protected final CompletableFuture<Void> execute(@Nonnull CommandContext context)
- protected abstract void executeSync(@Nonnull CommandContext var1)

Known subclasses: AssetTagsCommand, AuthCancelCommand, AuthLoginBrowserCommand, AuthLoginDeviceCommand, AuthLogoutCommand, AuthPersistenceCommand, AuthSelectCommand, AuthStatusCommand, BindingsCommand, BlockSetCommand, DamageOtherCommand, DebugKnockbackCommand, DebugShapeShowForceCommand, Default, DesyncDamageCommand, DismountOtherCommand, DroplistCommand, DumpCommandsCommand, EchoCommand, EnableTmpTagsCommand, EntityLodCommand, EntitySnapshotLengthCommand, EventTitleCommand, ForgetOther, GameModeOtherCommand, GiveOtherCommand, HideAllCommand, HitDetectionCommand, HitboxExtentsCommand, HitboxGetCommand, InstanceExitOtherCommand, InteractionSetSnapshotSourceCommand, InteractionSnapshotSourceCommand, KickCommand, KillOtherCommand, LANDiscoveryCommand, LearnOther, ListOther, LogCommand, MaxPlayersCommand, MemoriesClearCommand, MessageTranslationTestCommand, ModelOtherCommand, ModelResetOtherCommand, ModelSetOtherCommand, NPCBenchmarkCommand, NotifyCommand, OpAddCommand, OpRemoveCommand, PIDCheckCommand, PacksListCommand, PermGroupAddCommand, PermGroupListCommand, PermGroupRemoveCommand, PermTestCommand, PermUserAddCommand, PermUserGroupAddCommand, PermUserGroupListCommand, PermUserGroupRemoveCommand, PermUserListCommand, PermUserRemoveCommand, PlayCommandBase, PlayerEffectApplyOtherCommand, PlayerEffectClearOtherCommand, PlayerRespawnOtherCommand, PluginListCommand, PluginLoadCommand, PluginReloadCommand, PluginUnloadCommand, PrefabDeleteCommand, PrefabListCommand, QuantizeCommand, SayCommand, SelectProfileVariant, ServerDumpCommand, ServerGCCommand, ServerKnockbackCommand, ServerStatsCpuCommand, ServerStatsGcCommand, ServerStatsMemoryCommand, SetPatchlineVariant, SetPersistenceVariant, SetToolHistorySizeCommand, ShowAllCommand, SleepOffsetCommand, SleepTestCommand, SpawnOtherCommand, StopCommand, SudoCommand, TagPatternCommand, TeleportAllCommand, TeleportOtherToPlayerCommand, TeleportPlayerToCoordinatesCommand, UpdateApplyCommand, UpdateCancelCommand, UpdatePatchlineCommand, UpdateSetupCommand, UpdateStatusCommand, VersionCommand, WarpListCommand, WarpReloadCommand, WarpRemoveCommand, WhereAmIOtherCommand, WhitelistClearCommand, WhitelistDisableCommand, WhitelistEnableCommand, WhitelistListCommand, WhitelistStatusCommand, WhoAmIOtherCommand, WorldAddCommand, WorldGenBenchmarkCommand, WorldListCommand, WorldLoadCommand, WorldRemoveCommand, WorldSetDefaultCommand

Also in this package: AbstractAsyncCommand, AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand

Complete API:
  protected final CompletableFuture<Void> execute(CommandContext context)
  protected abstract void executeSync(CommandContext var1)
