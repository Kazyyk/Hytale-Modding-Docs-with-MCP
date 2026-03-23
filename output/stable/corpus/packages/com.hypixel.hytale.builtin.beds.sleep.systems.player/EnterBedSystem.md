# EnterBedSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.player | Extends: RefChangeSystem<EntityStore, MountedComponent>

public class EnterBedSystem extends RefChangeSystem<EntityStore, MountedComponent>

Monitors mount component changes to detect when a player enters a bed. Validates sleep conditions (time of day, sleep enabled) and sends appropriate feedback messages.

Also in this package: BigServer, NotReady, NotificationState, RegisterTrackerSystem, SleepNotificationSystem, SmallServer, UpdateSleepPacketSystem, WakeUpOnDismountSystem

Complete API:
  public ComponentType<EntityStore,MountedComponent> componentType()
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, MountedComponent oldComponent, MountedComponent newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static void check(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, ComponentType<EntityStore,PlayerRef> playerRefComponentType)
  private static void onEnterBed(Ref<EntityStore> ref, Store<EntityStore> store, ComponentType<EntityStore,PlayerRef> playerRefComponentType)
  private static Message getMessage(CanSleepInWorld.Result param0)
  private static Message formatDuration(Duration duration)

Fields:
private static final Message MESSAGE_SERVER_INTERACTIONS_SLEEP_GAME_TIME_PAUSED
private static final Message MESSAGE_SERVER_INTERACTIONS_SLEEP_NOT_WITHIN_HOURS
private static final Message MESSAGE_SERVER_INTERACTIONS_SLEEP_DISABLED
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final Query<EntityStore> query
