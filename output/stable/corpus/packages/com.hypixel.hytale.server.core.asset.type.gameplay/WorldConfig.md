# WorldConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class WorldConfig

World-level configuration including daylight cycle duration, time pause state, moon phase, and starting day time.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SleepConfig, SpawnConfig, WorldMapConfig

Complete API:
  public boolean isBlockBreakingAllowed()
  public boolean isBlockGatheringAllowed()
  public boolean isBlockPlacementAllowed()
  public int getDaytimeDurationSeconds()
  public int getNighttimeDurationSeconds()
  public int getTotalMoonPhases()
  public float getBlockPlacementFragilityTimer()
  public SleepConfig getSleepConfig()

Fields:
public static final BuilderCodec<WorldConfig> CODEC
public static final int DEFAULT_TOTAL_DAY_DURATION_SECONDS
public static final int DEFAULT_DAYTIME_DURATION_SECONDS
public static final int DEFAULT_NIGHTTIME_DURATION_SECONDS
protected boolean allowBlockBreaking
protected boolean allowBlockGathering
protected boolean allowBlockPlacement
protected int daytimeDurationSeconds
protected int nighttimeDurationSeconds
private int totalMoonPhases
protected float blockPlacementFragilityTimer
private SleepConfig sleepConfig
