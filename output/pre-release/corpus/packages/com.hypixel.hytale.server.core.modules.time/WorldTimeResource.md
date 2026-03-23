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

Also in this package: Init, Ticking, TimeModule, TimePacketSystem, TimeResource, TimeSystem, WorldTimeSystems

Complete API:
  public static ResourceType<EntityStore,WorldTimeResource> getResourceType()
  public static double getSecondsPerTick(World world)
  public void tick(float dt, Store<EntityStore> store)
  public int getMoonPhase()
  public void setMoonPhase(int moonPhase, ComponentAccessor<EntityStore> componentAccessor)
  public void updateMoonPhase(World world, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isMoonPhaseWithinRange(World world, int minMoonPhase, int maxMoonPhase)
  public void setGameTime0(Instant gameTime)
  private void updateSunlightFactor(int dayProgress, float halfNight)
  private void updateScaledTime(float dayProgress, float dayDuration, float halfNight)
  public Instant getGameTime()
  public LocalDateTime getGameDateTime()
  public double getSunlightFactor()
  public void setGameTime(Instant gameTime, World world, ComponentAccessor<EntityStore> store)
  public void setDayTime(double dayTime, World world, ComponentAccessor<EntityStore> store)
  public void broadcastTimePacket(ComponentAccessor<EntityStore> store)
  public void sendTimePackets(PlayerRef playerRef)
  public boolean isDayTimeWithinRange(double minTime, double maxTime)
  public void updateTimePacket(UpdateTime currentTimePacket)
  public static UpdateTimeSettings updateTimeSettingsPacket(UpdateTimeSettings settings, World world)
  public boolean isScaledDayTimeWithinRange(double minTime, double maxTime)
  public boolean isYearWithinRange(double minTime, double maxTime)
  public int getCurrentHour()
  public float getDayProgress()
  public Vector3f getSunDirection()
  public static InstantData instantToInstantData(Instant instant)
  public static Instant instantDataToInstant(InstantData instantData)
  public Resource<EntityStore> clone()
  public String toString()

Fields:
public static final long NANOS_PER_DAY
public static final int SECONDS_PER_DAY
public static final int HOURS_PER_DAY
public static final int DAYS_PER_YEAR
public static final Instant ZERO_YEAR
public static final Instant MAX_TIME
public static final ZoneOffset ZONE_OFFSET
public static final float SUN_HEIGHT
public static final boolean USE_SHADOW_MAPPING_SAFE_ANGLE
public static final float DAYTIME_PORTION_PERCENTAGE
public static final int DAYTIME_SECONDS
public static final int NIGHTTIME_SECONDS
public static final int SUNRISE_SECONDS
public static final float SHADOW_MAPPING_SAFE_ANGLE_LERP
private final UpdateTime currentTimePacket
private Instant gameTime
private LocalDateTime _gameTimeLocalDateTime
private int currentHour
private double sunlightFactor
private double scaledTime
private int moonPhase
private final UpdateTimeSettings currentSettings
private final UpdateTimeSettings tempSettings
