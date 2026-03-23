# WorldTimeResource

Type: class | Package: com.hypixel.hytale.server.core.modules.time | Extends: Resource<EntityStore>

public class WorldTimeResource implements Resource<EntityStore>

World-level resource managing in-game date/time with configurable day/night durations. Computes sunlight factor, moon phases, sun direction, and scaled time. Handles day/night cycle transitions with independent daytime and nighttime rates.

## Fields

- public static final | long | NANOS_PER_DAY | Nanoseconds per day
- public static final | int | SECONDS_PER_DAY | Seconds per day
- public static final | float | DAYTIME_PORTION_PERCENTAGE | Daytime portion (0.6)

## Methods

- public static ResourceType<EntityStore, WorldTimeResource> getResourceType()
- public void tick(float dt, Store<EntityStore> store)
- public int getMoonPhase()
- public void setMoonPhase(int moonPhase, ComponentAccessor<EntityStore> componentAccessor)
- public Instant getGameTime()
- public LocalDateTime getGameDateTime()
- public double getSunlightFactor()
- public void setGameTime(Instant gameTime, World world, Store<EntityStore> store)
- public void setDayTime(double dayTime, World world, Store<EntityStore> store)
- public void broadcastTimePacket(Store<EntityStore> store)
- public void sendTimePackets(PlayerRef playerRef)
- public boolean isDayTimeWithinRange(double minTime, double maxTime)
- public boolean isScaledDayTimeWithinRange(double minTime, double maxTime)
- public int getCurrentHour()
- public float getDayProgress()
- public Vector3f getSunDirection()
