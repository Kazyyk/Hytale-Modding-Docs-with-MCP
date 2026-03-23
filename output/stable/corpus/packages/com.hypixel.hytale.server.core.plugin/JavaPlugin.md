# JavaPlugin

Type: class | Package: com.hypixel.hytale.server.core.plugin | Extends: PluginBase

public abstract class JavaPlugin extends PluginBase

Base class for Java-based server plugins loaded from JAR files. Extends `PluginBase` with file path and class loader support. Automatically registers the plugin's asset pack during setup if the manifest indicates one.

## Constructors

- JavaPlugin(@Nonnull JavaPluginInit init)

## Methods

- @Nonnull public Path getFile()
- @Nonnull public PluginClassLoader getClassLoader()
- @Nonnull @Override public final PluginType getType()

Known subclasses: AccessControlModule, AmbiencePlugin, AnchorActionModule, AssetEditorPlugin, AssetModule, BedsPlugin, BlockHealthModule, BlockModule, BlockPhysicsPlugin, BlockSetModule, BlockSpawnerPlugin, BlockStateModule, BlockTickPlugin, BlockTypeModule, BuilderToolsPlugin, CameraPlugin, CollisionModule, CommonAssetModule, ConnectedBlocksModule, ConsoleModule, CosmeticsModule, CraftingPlugin, CreativeHubPlugin, CrouchSlidePlugin, DamageModule, DebugPlugin, DeployablesPlugin, EntityModule, EntityStatsModule, EntityUIModule, FarmingPlugin, FlockPlugin, FluidPlugin, FlyCameraModule, HytaleGenerator, I18nModule, InstancesPlugin, InteractionModule, ItemModule, LANDiscoveryPlugin, LegacyModule, MacroCommandPlugin, MantlingPlugin, MemoriesPlugin, MigrationModule, ModelPlugin, MountPlugin, NPCCombatActionEvaluatorPlugin, NPCEditorPlugin, NPCObjectivesPlugin, NPCPlugin, NPCReputationPlugin, NPCShopPlugin, ObjectivePlugin, ObjectiveReputationPlugin, ObjectiveShopPlugin, ParkourPlugin, PathPlugin, PermissionsModule, PortalsPlugin, PrefabSpawnerModule, ProjectileModule, RandomTickPlugin, ReputationPlugin, SafetyRollPlugin, ServerManager, ServerPlayerListModule, ShopPlugin, ShopReputationPlugin, SingleplayerModule, SpawningPlugin, SplitVelocity, SprintForcePlugin, StaminaModule, StashPlugin, TagSetPlugin, TeleportPlugin, TeleporterPlugin, TimeModule, Universe, UpdateModule, WeatherPlugin, WorldGenPlugin, WorldLocationConditionPlugin

Also in this package: JavaPluginInit, MissingPluginDependencyException, PluginBase, PluginBridgeClassLoader, PluginClassLoader, PluginInit, PluginListPageManager, PluginManager, PluginState, PluginType, SessionSettings

Complete API:
  public Path getFile()
  protected void setup0()
  public PluginClassLoader getClassLoader()
  public final PluginType getType()

Fields:
private final Path file
private final PluginClassLoader classLoader
