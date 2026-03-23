# UpdateSleepPacketSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.player | Extends: DelayedEntitySystem<EntityStore>

public class UpdateSleepPacketSystem extends DelayedEntitySystem<EntityStore>

Sends `UpdateSleepState` packets to players at 0.25s intervals. Generates gray fade, black screen, sleep clock, and multiplayer sleep status based on player/world sleep state.

Also in this package: BigServer, EnterBedSystem, NotReady, NotificationState, RegisterTrackerSystem, SleepNotificationSystem, SmallServer, WakeUpOnDismountSystem

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private UpdateSleepState createSleepPacket(Store<EntityStore> store, int index, ArchetypeChunk<EntityStore> archetypeChunk)
  private SleepMultiplayer createSleepMultiplayer(Store<EntityStore> store)

Fields:
private static final int MAX_SAMPLE_COUNT
private static final float SYSTEM_INTERVAL_S
private static final Duration SPAN_BEFORE_BLACK_SCREEN
private static final UUID[] EMPTY_UUIDS
private static final UpdateSleepState PACKET_NO_SLEEP_UI
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final ComponentType<EntityStore,PlayerSomnolence> playerSomnolenceComponentType
private final ComponentType<EntityStore,SleepTracker> sleepTrackerComponentType
private final ResourceType<EntityStore,WorldSomnolence> worldSomnolenceResourceType
private final ResourceType<EntityStore,WorldTimeResource> worldTimeResourceType
private final Query<EntityStore> query
