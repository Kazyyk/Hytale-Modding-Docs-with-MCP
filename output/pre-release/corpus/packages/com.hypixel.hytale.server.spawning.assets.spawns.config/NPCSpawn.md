# NPCSpawn

Type: class | Package: com.hypixel.hytale.server.spawning.assets.spawns.config

public class NPCSpawn

Abstract base for NPC spawn configurations. Defines common codec fields including model, group size range, cooldown, day/night time restrictions, and spawn suppression rules.

Known subclasses: BeaconNPCSpawn, WorldNPCSpawn

Also in this package: BeaconNPCSpawn, DespawnParameters, RoleSpawnParameters, WorldNPCSpawn

Complete API:
  private static void validateLightRange(ValidationResults results, String parameter, double[] lightRange)
  public abstract String getId()
  public RoleSpawnParameters[] getNPCs()
  public NPCSpawn.DespawnParameters getDespawnParameters()
  public String[] getEnvironments()
  public IntSet getEnvironmentIds()
  public double[] getDayTimeRange()
  public int[] getMoonPhaseRange()
  public double[] getLightRange(LightType lightType)
  public boolean isScaleDayTimeRange()
  public String toString()

Fields:
public static final float HOURS_PER_DAY
public static final BuilderCodec<NPCSpawn> BASE_CODEC
public static final double[] DEFAULT_DAY_TIME_RANGE
public static final int[] DEFAULT_MOON_PHASE_RANGE
public static final double[] FULL_LIGHT_RANGE
protected AssetExtraInfo.Data data
protected String id
protected RoleSpawnParameters[] npcs
protected NPCSpawn.DespawnParameters despawnParameters
protected String[] environments
protected IntSet environmentIds
protected double[] dayTimeRange
protected int[] moonPhaseRange
protected Map<LightType,double[]> lightTypeMap
protected boolean scaleDayTimeRange
