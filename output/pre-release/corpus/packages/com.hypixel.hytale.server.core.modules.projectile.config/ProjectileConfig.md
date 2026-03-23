# ProjectileConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ProjectileConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.ProjectileConfig>, BallisticData

public class ProjectileConfig implements JsonAssetWithMap<String, DefaultAssetMap<String, ProjectileConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.ProjectileConfig>, BallisticData

Asset-backed configuration for projectile types. Defines physics behavior, model, launch force, spawn offsets and rotation, interaction bindings per `InteractionType`, and sound events for launch and flight. Implements `BallisticData` by delegating to spawn offset and physics config.

## Fields

- public static final AssetBuilderCodec<String, ProjectileConfig> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- protected String id
- protected PhysicsConfig physicsConfig
- protected String model
- protected double launchForce
- protected Vector3f spawnOffset
- protected Direction spawnRotationOffset
- protected Map<InteractionType, String> interactions
- protected String launchLocalSoundEventId
- protected String launchWorldSoundEventId
- protected String projectileSoundEventId

## Methods

- public static AssetStore<String, ProjectileConfig, DefaultAssetMap<String, ProjectileConfig>> getAssetStore()
- public static DefaultAssetMap<String, ProjectileConfig> getAssetMap()
- public String getId()
- public PhysicsConfig getPhysicsConfig()
- public Model getModel()
- public double getLaunchForce()
- public double getMuzzleVelocity()
- public double getGravity()
- public double getVerticalCenterShot()
- public double getHorizontalCenterShot()
- public double getDepthShot()
- public boolean isPitchAdjustShot()
- public Map<InteractionType, String> getInteractions()
- public int getLaunchWorldSoundEventIndex()
- public int getProjectileSoundEventIndex()
- public Vector3f getSpawnOffset()
- public Direction getSpawnRotationOffset()
- public Vector3d getCalculatedOffset(float pitch, float yaw)
- public com.hypixel.hytale.protocol.ProjectileConfig toPacket()

Also in this package: BallisticData, BallisticDataProvider, BounceConsumer, ImpactConsumer, PhysicsConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsConfig, StandardPhysicsProvider

Complete API:
  public static AssetStore<String,ProjectileConfig,DefaultAssetMap<String,ProjectileConfig>> getAssetStore()
  public static DefaultAssetMap<String,ProjectileConfig> getAssetMap()
  public String getId()
  protected void processConfig()
  public PhysicsConfig getPhysicsConfig()
  public Model getModel()
  public double getLaunchForce()
  public double getMuzzleVelocity()
  public double getGravity()
  public double getVerticalCenterShot()
  public double getHorizontalCenterShot()
  public double getDepthShot()
  public boolean isPitchAdjustShot()
  public Map<InteractionType,String> getInteractions()
  public int getLaunchWorldSoundEventIndex()
  public int getProjectileSoundEventIndex()
  public Vector3f getSpawnOffset()
  public Direction getSpawnRotationOffset()
  public Vector3d getCalculatedOffset(float pitch, float yaw)
  public com.hypixel.hytale.protocol.ProjectileConfig toPacket()

Fields:
public static final AssetBuilderCodec<String,ProjectileConfig> CODEC
private static AssetStore<String,ProjectileConfig,DefaultAssetMap<String,ProjectileConfig>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
protected PhysicsConfig physicsConfig
protected String model
protected Model generatedModel
protected double launchForce
protected Vector3f spawnOffset
protected Direction spawnRotationOffset
protected Map<InteractionType,String> interactions
protected String launchLocalSoundEventId
protected String launchWorldSoundEventId
protected String projectileSoundEventId
protected int launchLocalSoundEventIndex
protected int launchWorldSoundEventIndex
protected int projectileSoundEventIndex
