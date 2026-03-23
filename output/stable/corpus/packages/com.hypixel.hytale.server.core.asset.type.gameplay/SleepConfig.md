# SleepConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class SleepConfig

Sleep system configuration controlling the required player percentage for sleeping and the time-skip speed.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public float getWakeUpHour()
  public double[] getAllowedSleepHoursRange()
  public LocalTime getSleepStartTime()
  public boolean isWithinSleepHoursRange(LocalDateTime gameTime)
  public Duration computeDurationUntilSleep(LocalDateTime now)
  private static float getFractionalHourOfDay(LocalDateTime dateTime)

Fields:
public static final BuilderCodec<SleepConfig> CODEC
public static final SleepConfig DEFAULT
private float wakeUpHour
private double[] allowedSleepHoursRange
