# WorldNPCSpawn

Type: class | Package: com.hypixel.hytale.server.spawning.assets.spawns.config | Extends: NPCSpawn | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, WorldNPCSpawn>>

public class WorldNPCSpawn extends NPCSpawn implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, WorldNPCSpawn>>

NPC spawn configuration for world-level ambient spawning. Adds biome-based spawn weighting and density control.

Also in this package: BeaconNPCSpawn, DespawnParameters, NPCSpawn, RoleSpawnParameters

Complete API:
  public static IndexedLookupTableAssetMap<String,WorldNPCSpawn> getAssetMap()
  public String getId()
  public double[] getMoonPhaseWeightModifiers()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,WorldNPCSpawn> CODEC
private static IndexedLookupTableAssetMap<String,WorldNPCSpawn> ASSET_MAP
protected double[] moonPhaseWeightModifiers
