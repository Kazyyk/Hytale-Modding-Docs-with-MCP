# WorldSomnolence

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.resources | Implements: Resource

public class WorldSomnolence implements Resource

## Fields

- private WorldSleep state
- private long lastSleepNotification

## Methods

- public static ResourceType<EntityStore,WorldSomnolence> getResourceType()
- @Nonnull public WorldSleep getState()
- public void setState(WorldSleep state)
- public boolean useSleepNotificationCooldown(long now, long cooldownMs)
- public void resetNotificationCooldown()
- @Nullable @Override public Resource<EntityStore> clone()

Also in this package: Awake, WorldSleep, WorldSlumber

Complete API:
  public static ResourceType<EntityStore,WorldSomnolence> getResourceType()
  public WorldSleep getState()
  public void setState(WorldSleep state)
  public boolean useSleepNotificationCooldown(long now, long cooldownMs)
  public void resetNotificationCooldown()
  public Resource<EntityStore> clone()

Fields:
private WorldSleep state
private long lastSleepNotification
