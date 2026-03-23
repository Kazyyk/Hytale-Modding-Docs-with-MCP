# AbstractWorldCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractWorldCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for WorldCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_NO_WORLD

## Fields

- @Nonnull private final OptionalArg<World> worldArg

## Methods

- public AbstractWorldCommand(@Nonnull String name, @Nonnull String description)
- public AbstractWorldCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractWorldCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- protected abstract void execute(@Nonnull CommandContext var1, @Nonnull World var2, @Nonnull Store<EntityStore> var3)

Known subclasses: AmbienceClearCommand, AmbienceSetMusicCommand, BlockBulkFindCommand, BlockEventsCommand, BlockSpawnerGetCommand, BlockSpawnerSetCommand, CheckpointRemoveCommand, ChunkCommand, ChunkFixHeightMapCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadCommand, ChunkMarkSaveCommand, ChunkRegenerateCommand, ChunkUnloadCommand, ChunksCommand, DisableCommand, DisableCommand, DisableLocationMarkerCommand, DropCommand, Dump, DumpAll, EnableCommand, EnableCommand, EnableLocationMarkerCommand, EntityCleanCommand, EntityCloneCommand, EntityCountCommand, EntityDumpCommand, EntityEventsCommand, EntityNameplateCommand, EntityRemoveCommand, EntityResendCommand, EntitySnapshotHistoryCommand, EntityTrackerCommand, HitboxCollisionAddEntityCommand, HitboxCollisionRemoveEntityCommand, LightingCalculationCommand, LightingGetCommand, LightingInfoCommand, LightingInvalidateCommand, LightingSendToggleCommand, MemoriesLevelCommand, MemoriesSetCountCommand, MemoriesUnlockCommand, NPCCleanCommand, NPCFreezeCommand, NPCStepCommand, NPCThawCommand, NPCWorldCommandBase, PortalWorldCommandBase, PrefabPathListCommand, PrefabPathNodesCommand, PrefabPathUpdateObservationAngleCommand, PrefabPathUpdatePauseCommand, Remove, RepulsionAddEntityCommand, RepulsionRemoveEntityCommand, ResetSubCommand, ResetSubCommand, ResourceViewCommand, ResourceViewsCommand, SetSubCommand, SetSubCommand, SetTickingCommand, SetTimeHourCommand, SetTimePeriodCommand, SimpleBlockCommand, SpawnBlockCommand, SpawnPopulateCommand, SpawnSetCommand, SpawnSetDefaultCommand, SpawnStatsCommand, StartVoidEventCommand, TargetPrefabSpawnerCommand, TimeCommand, TimeDilationCommand, TimePauseCommand, ViewCommand, ViewsCommand, WeatherGetCommand, WeatherResetCommand, WeatherSetCommand, WorldConfigPauseTimeCommand, WorldConfigSeedCommand, WorldConfigSetPvpCommand, WorldConfigSetSpawnCommand, WorldConfigSetSpawnDefaultCommand, WorldMapReloadCommand, WorldPathListCommand, WorldPathRemoveCommand, WorldPathSaveCommand, WorldPauseCommand, WorldPerfCommand, WorldPerfGraphCommand, WorldPerfResetCommand, WorldSettingsBox2DCommand, WorldSettingsSubCommand, WorldTpsCommand, WorldTpsResetCommand

Also in this package: AbstractAsyncCommand, AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, CommandBase

Complete API:
  protected final CompletableFuture<Void> executeAsync(CommandContext context)
  protected abstract void execute(CommandContext var1, World var2, Store<EntityStore> var3)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_NO_WORLD
private final OptionalArg<World> worldArg
