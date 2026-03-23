# ParticleSpawner

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config

public class ParticleSpawner

Configuration for a particle spawner defining emission rate, shape, and particle properties.

Also in this package: Particle, ParticleAnimationFrame, ParticleAttractor, ParticleCollision, ParticleSpawnerGroup, ParticleSystem, WorldParticle

Complete API:
  public static AssetStore<String,ParticleSpawner,DefaultAssetMap<String,ParticleSpawner>> getAssetStore()
  public static DefaultAssetMap<String,ParticleSpawner> getAssetMap()
  public com.hypixel.hytale.protocol.ParticleSpawner toPacket()
  public String getId()
  public Particle getParticle()
  public FXRenderMode getRenderMode()
  public EmitShape getShape()
  public RangeVector3f getEmitOffset()
  public boolean getUseEmitDirection()
  public float getCameraOffset()
  public ParticleRotationInfluence getParticleRotationInfluence()
  public boolean isParticleRotateWithSpawner()
  public boolean isLowRes()
  public float getTrailSpawnerPositionMultiplier()
  public float getTrailSpawnerRotationMultiplier()
  public ParticleCollision getParticleCollision()
  public float getLightInfluence()
  public boolean isLinearFiltering()
  public Range getTotalParticles()
  public float getLifeSpan()
  public int getMaxConcurrentParticles()
  public Rangef getParticleLifeSpan()
  public Rangef getSpawnRate()
  public boolean isSpawnBurst()
  public Rangef getWaveDelay()
  public InitialVelocity getInitialVelocity()
  public float getVelocityStretchMultiplier()
  public UVMotion getUVMotion()
  public ParticleAttractor[] getAttractors()
  public IntersectionHighlight getIntersectionHighlight()
  public String toString()

Fields:
public static final String PARTICLE_PATH
public static final String PARTICLE_EXTENSION
public static final AssetBuilderCodec<String,ParticleSpawner> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ParticleSpawner,DefaultAssetMap<String,ParticleSpawner>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected Particle particle
protected FXRenderMode renderMode
protected EmitShape shape
protected RangeVector3f emitOffset
protected boolean useEmitDirection
protected float cameraOffset
protected ParticleRotationInfluence particleRotationInfluence
protected boolean particleRotateWithSpawner
protected boolean isLowRes
protected float trailSpawnerPositionMultiplier
protected float trailSpawnerRotationMultiplier
protected ParticleCollision particleCollision
protected float lightInfluence
protected boolean linearFiltering
protected Range totalParticles
protected float lifeSpan
protected int maxConcurrentParticles
protected Rangef particleLifeSpan
protected Rangef spawnRate
protected boolean spawnBurst
protected Rangef waveDelay
protected InitialVelocity initialVelocity
protected float velocityStretchMultiplier
protected UVMotion uvMotion
protected ParticleAttractor[] attractors
protected IntersectionHighlight intersectionHighlight
private SoftReference<com.hypixel.hytale.protocol.ParticleSpawner> cachedPacket
