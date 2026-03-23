# SleepConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay.sleep

public class SleepConfig

## Fields

- public static final BuilderCodec<SleepConfig> CODEC
- public static final SleepConfig DEFAULT
- private float wakeUpHour
- private double[] allowedSleepHoursRange
- private SleepSoundsConfig sounds

## Methods

- public float getWakeUpHour()
- @Nullable public double[] getAllowedSleepHoursRange()
- public SleepSoundsConfig getSounds()
- @Nullable public LocalTime getSleepStartTime()
- public boolean isWithinSleepHoursRange(LocalDateTime gameTime)
- public Duration computeDurationUntilSleep(LocalDateTime now)
- private static float getFractionalHourOfDay(LocalDateTime dateTime)

Also in this package: SleepSoundsConfig

Complete API:
  public float getWakeUpHour()
  public double[] getAllowedSleepHoursRange()
  public SleepSoundsConfig getSounds()
  public LocalTime getSleepStartTime()
  public boolean isWithinSleepHoursRange(LocalDateTime gameTime)
  public Duration computeDurationUntilSleep(LocalDateTime now)
  private static float getFractionalHourOfDay(LocalDateTime dateTime)

Fields:
public static final BuilderCodec<SleepConfig> CODEC
public static final SleepConfig DEFAULT
private float wakeUpHour
private double[] allowedSleepHoursRange
private SleepSoundsConfig sounds
