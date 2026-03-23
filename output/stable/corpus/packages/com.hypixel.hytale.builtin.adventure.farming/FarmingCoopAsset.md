# FarmingCoopAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, FarmingCoopAsset>>

public class FarmingCoopAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, FarmingCoopAsset>>

Data-driven asset defining the configuration for a farming coop block. Loaded from `Farming/Coops` by FarmingPlugin. Configures maximum residents, produce drops, NPC group acceptance, wild capture behavior, and resident spawn offsets.

## Fields

- protected String id
- protected int maxResidents
- protected Map<String, String> produceDrops
- protected IntRange residentRoamTime
- @Nonnull protected Vector3d residentSpawnOffset
- protected String[] acceptedNpcGroupIds
- protected int[] acceptedNpcGroupIndexes
- protected boolean captureWildNPCsInRange
- protected float wildCaptureRadius

## Methods

- public static AssetStore<String, FarmingCoopAsset, DefaultAssetMap<String, FarmingCoopAsset>> getAssetStore()
- public static DefaultAssetMap<String, FarmingCoopAsset> getAssetMap()
- public String getId()
- public Map<String, String> getProduceDrops()
- public int getMaxResidents()
- public IntRange getResidentRoamTime()
- @Nonnull public Vector3d getResidentSpawnOffset()
- public int[] getAcceptedNpcGroupIndexes()
- public float getWildCaptureRadius()
- public boolean getCaptureWildNPCsInRange()
