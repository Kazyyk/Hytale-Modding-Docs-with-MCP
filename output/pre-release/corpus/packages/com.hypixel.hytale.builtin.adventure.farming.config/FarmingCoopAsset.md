# FarmingCoopAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config | Implements: JsonAssetWithMap

public class FarmingCoopAsset implements JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,FarmingCoopAsset> CODEC
- private static AssetStore<String,FarmingCoopAsset,DefaultAssetMap<String,FarmingCoopAsset>> ASSET_STORE
- private AssetExtraInfo.Data data
- protected String id
- protected int maxResidents
- protected Map<String,String> produceDrops
- protected IntRange residentRoamTime
- protected Vector3d residentSpawnOffset
- protected String[] acceptedNpcGroupIds
- protected int[] acceptedNpcGroupIndexes
- protected boolean captureWildNPCsInRange
- protected float wildCaptureRadius

## Methods

- public static AssetStore<String,FarmingCoopAsset,DefaultAssetMap<String,FarmingCoopAsset>> getAssetStore()
- public static DefaultAssetMap<String,FarmingCoopAsset> getAssetMap()
- public String getId()
- public Map<String,String> getProduceDrops()
- public int getMaxResidents()
- public IntRange getResidentRoamTime()
- @Nonnull public Vector3d getResidentSpawnOffset()
- public int[] getAcceptedNpcGroupIndexes()
- public float getWildCaptureRadius()
- public boolean getCaptureWildNPCsInRange()
- @Nonnull @Override public String toString()

Complete API:
  public static AssetStore<String,FarmingCoopAsset,DefaultAssetMap<String,FarmingCoopAsset>> getAssetStore()
  public static DefaultAssetMap<String,FarmingCoopAsset> getAssetMap()
  public String getId()
  public Map<String,String> getProduceDrops()
  public int getMaxResidents()
  public IntRange getResidentRoamTime()
  public Vector3d getResidentSpawnOffset()
  public int[] getAcceptedNpcGroupIndexes()
  public float getWildCaptureRadius()
  public boolean getCaptureWildNPCsInRange()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,FarmingCoopAsset> CODEC
private static AssetStore<String,FarmingCoopAsset,DefaultAssetMap<String,FarmingCoopAsset>> ASSET_STORE
private AssetExtraInfo.Data data
protected String id
protected int maxResidents
protected Map<String,String> produceDrops
protected IntRange residentRoamTime
protected Vector3d residentSpawnOffset
protected String[] acceptedNpcGroupIds
protected int[] acceptedNpcGroupIndexes
protected boolean captureWildNPCsInRange
protected float wildCaptureRadius
