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
