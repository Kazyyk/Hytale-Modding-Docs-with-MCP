# NPCObjectivesPlugin

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives | Extends: JavaPlugin

public class NPCObjectivesPlugin extends JavaPlugin

Plugin that registers systems, assets for the adventure subsystem.

## Fields

- instance | NPCObjectivesPlugin | Static NPCObjectivesPlugin field.
- killTrackerResourceType | ResourceType<EntityStore, KillTrackerResource> | ResourceType<EntityStore, KillTrackerResource> field.

## Constructors

- NPCObjectivesPlugin(@Nonnull JavaPluginInit init) | Creates a new NPCObjectivesPlugin instance.

## Methods

- get() | NPCObjectivesPlugin | static public method.
- setup() | void | protected method.
- hasTask(@Nonnull UUID playerUUID, @Nonnull UUID npcId, @Nonnull String taskId) | boolean | static public method.
- startObjective(@Nonnull Ref<EntityStore> playerRef, @Nonnull String taskId, @Nonnull Store<EntityStore> store) | void | static public method.
- getKillTrackerResourceType() | ResourceType<EntityStore, KillTrackerResource> | public method.

Complete API:
  public static NPCObjectivesPlugin get()
  protected void setup()
  public static boolean hasTask(UUID playerUUID, UUID npcId, String taskId)
  public static String updateTaskCompletion(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, UUID npcId, String taskId)
  public static void startObjective(Ref<EntityStore> playerRef, String taskId, Store<EntityStore> store)
  public ResourceType<EntityStore,KillTrackerResource> getKillTrackerResourceType()

Fields:
protected static NPCObjectivesPlugin instance
private ResourceType<EntityStore,KillTrackerResource> killTrackerResourceType
