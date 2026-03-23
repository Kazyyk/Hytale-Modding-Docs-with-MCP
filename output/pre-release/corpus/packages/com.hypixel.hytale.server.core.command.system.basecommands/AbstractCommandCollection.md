# AbstractCommandCollection

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractCommandCollection extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for CommandCollection subclasses.

## Methods

- public AbstractCommandCollection(@Nonnull String name, @Nonnull String description)
- @Nonnull public Message getFullUsage(@Nonnull CommandSender sender)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- @Nonnull @Override public Message getUsageString(@Nonnull CommandSender sender)

Known subclasses: AmbienceCommands, AmbienceEmitterCommands, AssetsCommand, AuthCommand, AuthLoginCommand, BlockBulkCommand, BlockCommand, BlockSpawnerCommand, BrushConfigCommand, CameraEffectCommand, ChunkCommand, CommandsCommand, DebugCommand, DebugShapeSubCommand, EntityCommand, EntitySnapshotSubCommand, EntityStatsSubCommand, ExtendFaceCommand, FluidCommand, FragmentCommands, HideCommand, HitboxCollisionAddCommand, HitboxCollisionCommand, HitboxCollisionRemoveCommand, HitboxCommand, InstancesEditCommand, InteractionCommand, InternationalizationCommands, InventoryCommand, LatencySimulationCommand, LightingCommand, LightingSendCommand, MemoriesCommand, MountCommand, NPCAttackCommand, NPCBlackboardCommand, NPCCommand, NPCDebugCommand, NPCFlockCommand, NPCPathCommand, NPCTestCommand, NetworkCommand, ObjectiveCommand, ObjectiveCompleteCommand, ObjectiveLocationMarkerCommand, ObjectiveReachLocationMarkerCommand, ObjectiveStartCommand, OpCommand, PacksCommand, ParkourCommand, ParticleCommand, PermCommand, PermGroupCommand, PermUserCommand, PermUserGroupCommand, PlayCommand, PlayerCameraDemoSubCommand, PlayerCameraSubCommand, PlayerCommand, PlayerEffectSubCommand, PlayerStatsSubCommand, PlayerViewRadiusSubCommand, PluginCommand, PrefabCommand, PrefabEditCommand, PrefabPathCommand, PrefabPathUpdateCommand, PrefabSpawnerCommand, RecipeCommand, RepulsionAddCommand, RepulsionCommand, RepulsionRemoveCommand, ReputationCommand, RotateCommand, ServerCommand, ServerStatsCommand, SleepCommand, SpawnBeaconsCommand, SpawnCommand, SpawnMarkersCommand, SpawnSuppressionCommand, StreamPriorityCommand, StressTestCommand, TeleportCommand, TimeSetSubCommand, UpdateCommand, VoiceCommand, VoidEventCommands, WarpCommand, WeatherCommand, WhitelistCommand, WorldCommand, WorldConfigCommand, WorldGenCommand, WorldMapCommand, WorldMapViewRadiusSubCommand, WorldPathBuilderCommand, WorldPathCommand, WorldRocksDbCommand, WorldSettingsCommand

Also in this package: AbstractAsyncCommand, AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, CommandBase

Complete API:
  public Message getFullUsage(CommandSender sender)
  protected final CompletableFuture<Void> executeAsync(CommandContext context)
  public Message getUsageString(CommandSender sender)
