# DeployableSpawner

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public class DeployableSpawner

Asset-mapped deployable spawner definition. Links a `DeployableConfig` to an array of position offsets for multi-point spawning. Implements `JsonAssetWithMap`.

Also in this package: DeployableAoeConfig, DeployableConfig, DeployableTrapConfig, DeployableTrapSpawnerConfig, DeployableTurretConfig, Shape, StatConfig

Complete API:
  public static DefaultAssetMap<String,DeployableSpawner> getAssetMap()
  public Vector3d[] getPositionOffsets()
  public DeployableConfig getConfig()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,DeployableSpawner> CODEC
private static DefaultAssetMap<String,DeployableSpawner> ASSET_MAP
protected String id
protected AssetExtraInfo.Data data
private DeployableConfig config
private Vector3d[] positionOffsets
