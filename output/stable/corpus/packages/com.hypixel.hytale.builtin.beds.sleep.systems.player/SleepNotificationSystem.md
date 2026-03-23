# SleepNotificationSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.player | Extends: DelayedSystem<EntityStore>

public class SleepNotificationSystem extends DelayedSystem<EntityStore>

Periodically checks sleep readiness and sends notification messages to awake players. Supports small server (named sleeper) and big server (ratio-based) notification modes.

Also in this package: BigServer, EnterBedSystem, NotReady, NotificationState, RegisterTrackerSystem, SmallServer, UpdateSleepPacketSystem, WakeUpOnDismountSystem

Complete API:
  public void delayedTick(float dt, int systemIndex, Store<EntityStore> store)
  public static void maybeDoNotification(Store<EntityStore> store, boolean fromAutoLoop)
  private static SleepNotificationSystem.NotificationState getNotificationState(World world)
  private static int countReadyToSleep(Collection<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> store)
  public static Message getSleeperName(Ref<EntityStore> ref)

Fields:
public static final int SMALL_SERVER_PLAYER_COUNT
public static final double BIG_SERVER_SLEEPERS_RATIO
public static final String COLOR
