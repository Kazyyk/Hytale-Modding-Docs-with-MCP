# RegisterTrackerSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.player | Extends: HolderSystem<EntityStore>

public class RegisterTrackerSystem extends HolderSystem<EntityStore>

Ensures every player entity has a `SleepTracker` component when added to the store.

Also in this package: BigServer, EnterBedSystem, NotReady, NotificationState, SleepNotificationSystem, SmallServer, UpdateSleepPacketSystem, WakeUpOnDismountSystem

Complete API:
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,SleepTracker> sleepTrackerComponentType
private final Query<EntityStore> query
