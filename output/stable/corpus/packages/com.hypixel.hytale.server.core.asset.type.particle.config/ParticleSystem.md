# ParticleSystem

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config

public class ParticleSystem

Top-level particle system configuration containing spawner groups and global parameters.

Also in this package: Particle, ParticleAnimationFrame, ParticleAttractor, ParticleCollision, ParticleSpawner, ParticleSpawnerGroup, WorldParticle

Complete API:
  public static AssetStore<String,ParticleSystem,DefaultAssetMap<String,ParticleSystem>> getAssetStore()
  public static DefaultAssetMap<String,ParticleSystem> getAssetMap()
  public com.hypixel.hytale.protocol.ParticleSystem toPacket()
  public String getId()
  public float getLifeSpan()
  public ParticleSpawnerGroup[] getSpawners()
  public float getCullDistance()
  public float getBoundingRadius()
  public boolean isImportant()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ParticleSystem> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ParticleSystem,DefaultAssetMap<String,ParticleSystem>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected float lifeSpan
protected ParticleSpawnerGroup[] spawners
protected float cullDistance
protected float boundingRadius
protected boolean isImportant
private SoftReference<com.hypixel.hytale.protocol.ParticleSystem> cachedPacket
