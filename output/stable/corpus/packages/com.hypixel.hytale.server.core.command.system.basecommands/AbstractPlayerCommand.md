# AbstractPlayerCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractPlayerCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for PlayerCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG

## Methods

- public AbstractPlayerCommand(@Nonnull String name, @Nonnull String description)
- public AbstractPlayerCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractPlayerCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- protected abstract void execute(@Nonnull CommandContext var1, @Nonnull Store<EntityStore> var2, @Nonnull Ref<EntityStore> var3, @Nonnull PlayerRef var4, @Nonnull World var5)

Known subclasses: Add, Add, Add, AddLocationMarkerCommand, AddReachLocationMarkerCommand, AmbienceEmitterAddCommand, BlockBulkFindHereCommand, BlockBulkReplaceCommand, BlockInspectFillerCommand, BlockInspectPhysicsCommand, BlockInspectRotationCommand, BlockRowCommand, BlockSelectCommand, BrushConfigClearCommand, BrushConfigDebugStepCommand, BrushConfigExitCommand, BrushConfigListCommand, BrushConfigLoadCommand, CheckpointAddCommand, CheckpointResetCommand, ChunkTintCommand, ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, CompleteObjectiveCommand, CompleteTaskCommand, CompleteTaskSetCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CursedHeldItemCommand, CutCommand, CutRegionCommand, DamageCommand, DebugPlayerPositionCommand, DebugShapeArrowCommand, DebugShapeClearCommand, DebugShapeConeCommand, DebugShapeCubeCommand, DebugShapeCylinderCommand, DebugShapeSphereCommand, DeselectCommand, DismountCommand, EditLineCommand, EmoteCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, Forget, GameModeCommand, GetCommand, GiveCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand, GrabCommand, HitboxCollisionRemoveSelfCommand, HollowCommand, HotbarSwitchCommand, HubCommand, ImageImportCommand, InstanceExitCommand, InstanceSpawnCommand, InstancesCommand, InteractionClearCommand, InteractionRunCommand, InteractionRunSpecificCommand, InventoryBackpackCommand, InventoryClearCommand, InventoryItemCommand, InventorySeeCommand, ItemStateCommand, JoinCommand, KillCommand, LayerCommand, Learn, LeaveCommand, LeaveCommand, List, LoadByNameCommand, MemoriesCapacityCommand, ModelCommand, ModelResetCommand, ModelSetCommand, MoveCommand, MoveWithDirectionAndDistanceCommand, MoveWithDistanceCommand, NPCAllCommand, NPCMessageCommand, NPCRunTestsCommand, NPCSensorStatsCommand, NPCSpawnCommand, ObjImportCommand, ObjectiveHistoryCommand, ObjectivePanelCommand, OpSelfCommand, PasteAtPositionCommand, PasteCommand, PlayerEffectApplyCommand, PlayerEffectClearCommand, PlayerLeaveCommand, PlayerRespawnCommand, PluginManageCommand, Pos1Command, Pos2Command, PrefabEditInfoCommand, PrefabEditKillEntitiesCommand, PrefabEditModifiedCommand, PrefabEditSaveUICommand, PrefabEditSelectCommand, PrefabEditTeleportCommand, PrefabEditUpdateBoxCommand, PrefabLoadByNameCommand, PrefabLoadCommand, PrefabPathAddCommand, PrefabPathEditCommand, PrefabPathMergeCommand, PrefabPathNewCommand, PrefabSaveCommand, PrefabSaveDirectCommand, ProbeTestCommand, RedoCommand, RedoWithCountCommand, RepairFillersCommand, ReplaceCommand, ReplaceFromToCommand, ReservationCommand, ReserveCommand, RotateArbitraryVariant, RotateAxisVariant, SelectChunkCommand, SelectChunkSectionCommand, SelectionHistoryCommand, SetCommand, SetCommand, SetRadiusCommand, ShiftCommand, ShowBuilderToolsHudCommand, SoundCommand, SpawnCommand, SpawnItemCommand, SpawnPageCommand, StackCommand, StackWithCountCommand, StackWithDirectionAndCountCommand, StartObjectiveCommand, StartObjectiveLineCommand, StashCommand, StopNetworkChunkSendingCommand, SubmergeCommand, TeleportBackCommand, TeleportForwardCommand, TeleportHistoryCommand, TeleportHomeCommand, TeleportToCoordinatesCommand, TeleportToPlayerCommand, TeleportTopCommand, TeleportWorldCommand, TintChunkPageCommand, TintCommand, ToggleBlockPlacementOverrideCommand, UndoCommand, UndoWithCountCommand, UpdateSelectionCommand, ViewportCommand, WallsCommand, WarpGoCommand, WarpGoVariantCommand, WarpSetCommand, WhereAmICommand, WhoAmICommand, WorldMapClearMarkersCommand, WorldMapDiscoverCommand, WorldMapUndiscoverCommand, WorldPathBuilderAddCommand, WorldPathBuilderClearCommand, WorldPathBuilderGotoCommand, WorldPathBuilderLoadCommand, WorldPathBuilderRemoveCommand, WorldPathBuilderSaveCommand, WorldPathBuilderSetCommand, WorldPathBuilderSimulateCommand, WorldPathBuilderStopCommand

Also in this package: AbstractAsyncCommand, AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, CommandBase

Complete API:
  protected final CompletableFuture<Void> executeAsync(CommandContext context)
  protected abstract void execute(CommandContext var1, Store<EntityStore> var2, Ref<EntityStore> var3, PlayerRef var4, World var5)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG
