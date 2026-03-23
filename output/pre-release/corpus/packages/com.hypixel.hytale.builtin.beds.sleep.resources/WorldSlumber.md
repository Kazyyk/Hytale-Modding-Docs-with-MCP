# WorldSlumber

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.resources | Implements: WorldSleep

public final class WorldSlumber implements WorldSleep

## Fields

- private final Instant startInstant
- private final Instant targetInstant
- private final InstantData startInstantData
- private final InstantData targetInstantData
- private final float irlDurationSeconds
- private float progressSeconds

## Methods

- @Nonnull public Instant getStartInstant()
- @Nonnull public Instant getTargetInstant()
- @Nonnull public InstantData getStartInstantData()
- @Nonnull public InstantData getTargetInstantData()
- public float getProgressSeconds()
- public void incrementProgressSeconds(float seconds)
- public float getIrlDurationSeconds()
- @Nonnull public SleepClock createSleepClock()

Also in this package: Awake, WorldSleep, WorldSomnolence

Complete API:
  public Instant getStartInstant()
  public Instant getTargetInstant()
  public InstantData getStartInstantData()
  public InstantData getTargetInstantData()
  public float getProgressSeconds()
  public void incrementProgressSeconds(float seconds)
  public float getIrlDurationSeconds()
  public SleepClock createSleepClock()

Fields:
private final Instant startInstant
private final Instant targetInstant
private final InstantData startInstantData
private final InstantData targetInstantData
private final float irlDurationSeconds
private float progressSeconds
