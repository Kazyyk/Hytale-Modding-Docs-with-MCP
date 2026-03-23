# RoleSpawnParameters

Type: class | Package: com.hypixel.hytale.server.spawning.assets.spawns.config

public class RoleSpawnParameters

Configuration for role-specific spawn parameters. Loaded via a codec with the role parameter map.

Also in this package: BeaconNPCSpawn, DespawnParameters, NPCSpawn, WorldNPCSpawn

Complete API:
  public String getId()
  public double getWeight()
  public String getSpawnBlockSet()
  public int getSpawnBlockSetIndex()
  public int getSpawnFluidTagIndex()
  public String getFlockDefinitionId()
  public int getFlockDefinitionIndex()
  public FlockAsset getFlockDefinition()
  public String toString()

Fields:
public static final BuilderCodec<RoleSpawnParameters> CODEC
public static final RoleSpawnParameters[] EMPTY_ARRAY
protected String id
protected double weight
protected String spawnBlockSet
protected int spawnBlockSetIndex
protected String spawnFluidTag
protected int spawnFluidTagIndex
protected String flockDefinitionId
protected int flockDefinitionIndex
