# DeployableConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public abstract class DeployableConfig

Abstract base configuration for all deployable types. Defines common properties: ID, model, model scale, max live count, live duration, invulnerability, sound events (deploy/despawn/die/ambient), particles, hitbox collision, debug visuals, wall placement, and stat values. Codec-registered via `CodecMapCodec` with a `Type` discriminator.

Known subclasses: DeployableAoeConfig, DeployableTurretConfig

Also in this package: DeployableAoeConfig, DeployableSpawner, DeployableTrapConfig, DeployableTrapSpawnerConfig, DeployableTurretConfig, Shape, StatConfig

Complete API:
  private static void processConfig(DeployableConfig config)
  protected static void playAnimation(Store<EntityStore> store, Ref<EntityStore> ref, DeployableConfig config, String animationSetKey)
  protected static void stopAnimation(Store<EntityStore> store, ArchetypeChunk<EntityStore> archetypeChunk, int index)
  public Model getModel()
  public Model getModelPreview()
  public int getHitboxCollisionConfigIndex()
  public long getLiveDurationInMillis()
  public float getLiveDuration()
  public String getId()
  public int getMaxLiveCount()
  public boolean getInvulnerable()
  public Map<String,DeployableConfig.StatConfig> getStatValues()
  public int getDespawnSoundEventIndex()
  public int getDeploySoundEventIndex()
  public int getDieSoundEventIndex()
  public int getAmbientSoundEventIndex()
  public ModelParticle[] getSpawnParticles()
  public ModelParticle[] getDespawnParticles()
  public boolean getDebugVisuals()
  public boolean getAllowPlaceOnWalls()
  public boolean getWireframeDebugVisuals()
  public boolean getCountTowardsGlobalLimit()
  public void tick(DeployableComponent deployableComponent, float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void firstTick(DeployableComponent deployableComponent, float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public com.hypixel.hytale.protocol.DeployableConfig toPacket()
  public String toString()

Fields:
public static final CodecMapCodec<DeployableConfig> CODEC
public static final BuilderCodec<DeployableConfig> BASE_CODEC
protected Map<String,DeployableConfig.StatConfig> statValues
protected String deploySoundEventId
protected String despawnSoundEventId
protected String dieSoundEventId
protected String ambientSoundEventId
protected ModelParticle[] spawnParticles
protected ModelParticle[] despawnParticles
protected transient int deploySoundEventIndex
protected transient int despawnSoundEventIndex
protected transient int dieSoundEventIndex
protected transient int ambientSoundEventIndex
protected Model generatedModel
protected Model generatedModelPreview
protected String hitboxCollisionConfigId
protected int hitboxCollisionConfigIndex
private String id
private int maxLiveCount
private String model
private String modelPreview
private float modelScale
private float liveDuration
private boolean invulnerable
private boolean debugVisuals
private boolean allowPlaceOnWalls
private boolean wireframeDebugVisuals
private boolean countTowardsGlobalLimit
