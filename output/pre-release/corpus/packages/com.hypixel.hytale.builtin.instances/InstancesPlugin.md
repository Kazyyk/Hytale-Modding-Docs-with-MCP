# InstancesPlugin

Type: class | Package: com.hypixel.hytale.builtin.instances | Extends: JavaPlugin

public class InstancesPlugin extends JavaPlugin

## Fields

- private static InstancesPlugin instance
- public static final String INSTANCE_PREFIX
- public static final String CONFIG_FILENAME
- private ResourceType<ChunkStore, InstanceDataResource> instanceDataResourceType
- private ComponentType<EntityStore, InstanceEntityConfig> instanceEntityConfigComponentType
- private ComponentType<ChunkStore, InstanceBlock> instanceBlockComponentType
- private ComponentType<ChunkStore, ConfigurableInstanceBlock> configurableInstanceBlockComponentType

## Methods

- public static InstancesPlugin get()
- @Override protected void setup()
- @Nonnull public CompletableFuture<World> spawnInstance(@Nonnull String name, @Nonnull World forWorld, @Nonnull Transform returnPoint)
- @Nonnull public CompletableFuture<World> spawnInstance(@Nonnull String name, @Nullable String worldName, @Nonnull World forWorld, @Nonnull Transform returnPoint)
- public static void teleportPlayerToLoadingInstance( @Nonnull Ref<EntityStore> entityRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull CompletableFuture<World> worldFuture, @Nullable Transform overrideReturn )
- public static void teleportPlayerToInstance( @Nonnull Ref<EntityStore> playerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull World targetWorld, @Nullable Transform overrideReturn )
- public static CompletableFuture<Void> exitInstance(@Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void safeRemoveInstance(@Nonnull String worldName)
- public static void safeRemoveInstance(@Nonnull UUID worldUUID)
- public static void safeRemoveInstance(@Nullable World instanceWorld)
- @Nonnull public static Path getInstanceAssetPath(@Nonnull String name)
- public static boolean doesInstanceAssetExist(@Nonnull String name)
- @Nonnull public static CompletableFuture<World> loadInstanceAssetForEdit(@Nonnull String name)
- @Nonnull public List<String> getInstanceAssets()
- @Nonnull public FileVisitResult preVisitDirectory(@Nonnull Path dir, @Nonnull BasicFileAttributes attrs)
- private static void onPlayerConnect(@Nonnull PlayerConnectEvent event)
- private static void onPlayerAddToWorld(@Nonnull AddPlayerToWorldEvent event)
- private static void onPlayerReady(@Nonnull PlayerReadyEvent event)
- private static void showInstanceDiscovery( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull UUID instanceUuid, @Nonnull InstanceDiscoveryConfig discoveryConfig )
- private static void onPlayerDrainFromWorld(@Nonnull DrainPlayerFromWorldEvent event)
- private static void generateSchema(@Nonnull GenerateSchemaEvent event)
- private void validateInstanceAssets(@Nonnull LoadAssetEvent event)
- @Nonnull public static String safeName(@Nonnull String name)
- @Nonnull public ResourceType<ChunkStore, InstanceDataResource> getInstanceDataResourceType()
- @Nonnull public ComponentType<EntityStore, InstanceEntityConfig> getInstanceEntityConfigComponentType()
- @Nonnull public ComponentType<ChunkStore, InstanceBlock> getInstanceBlockComponentType()
- @Nonnull public ComponentType<ChunkStore, ConfigurableInstanceBlock> getConfigurableInstanceBlockComponentType()

Also in this package: InstanceValidator

Complete API:
  public static InstancesPlugin get()
  protected void setup()
  public CompletableFuture<World> spawnInstance(String name, World forWorld, Transform returnPoint)
  public CompletableFuture<World> spawnInstance(String name, String worldName, World forWorld, Transform returnPoint)
  public static void teleportPlayerToLoadingInstance(Ref<EntityStore> entityRef, ComponentAccessor<EntityStore> componentAccessor, CompletableFuture<World> worldFuture, Transform overrideReturn)
  public static void teleportPlayerToInstance(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor, World targetWorld, Transform overrideReturn)
  public static CompletableFuture<Void> exitInstance(Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public static void safeRemoveInstance(String worldName)
  public static void safeRemoveInstance(UUID worldUUID)
  public static void safeRemoveInstance(World instanceWorld)
  public static Path getInstanceAssetPath(String name)
  public static boolean doesInstanceAssetExist(String name)
  public static CompletableFuture<World> loadInstanceAssetForEdit(String name)
  public List<String> getInstanceAssets()
  private static void onPlayerConnect(PlayerConnectEvent event)
  private static void onPlayerAddToWorld(AddPlayerToWorldEvent event)
  private static void onPlayerReady(PlayerReadyEvent event)
  private static void showInstanceDiscovery(Ref<EntityStore> ref, Store<EntityStore> store, UUID instanceUuid, InstanceDiscoveryConfig discoveryConfig)
  private static void onPlayerDrainFromWorld(DrainPlayerFromWorldEvent event)
  private void validateInstanceAssets(LoadAssetEvent event)
  public static String safeName(String name)
  public ResourceType<ChunkStore,InstanceDataResource> getInstanceDataResourceType()
  public ComponentType<EntityStore,InstanceEntityConfig> getInstanceEntityConfigComponentType()
  public ComponentType<ChunkStore,InstanceBlock> getInstanceBlockComponentType()
  public ComponentType<ChunkStore,ConfigurableInstanceBlock> getConfigurableInstanceBlockComponentType()

Fields:
private static InstancesPlugin instance
public static final String INSTANCE_PREFIX
public static final String CONFIG_FILENAME
private ResourceType<ChunkStore,InstanceDataResource> instanceDataResourceType
private ComponentType<EntityStore,InstanceEntityConfig> instanceEntityConfigComponentType
private ComponentType<ChunkStore,InstanceBlock> instanceBlockComponentType
private ComponentType<ChunkStore,ConfigurableInstanceBlock> configurableInstanceBlockComponentType
