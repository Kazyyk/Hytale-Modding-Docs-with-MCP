# ParticleSpawnerGroup

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.ParticleSpawnerGroup>

public class ParticleSpawnerGroup implements NetworkSerializable<com.hypixel.hytale.protocol.ParticleSpawnerGroup>

A group of particle spawners that are managed together.

Also in this package: Particle, ParticleAnimationFrame, ParticleAttractor, ParticleCollision, ParticleSpawner, ParticleSystem, WorldParticle

Complete API:
  public com.hypixel.hytale.protocol.ParticleSpawnerGroup toPacket()
  public String getSpawnerId()
  public Vector3f getPositionOffset()
  public Direction getRotationOffset()
  public boolean isFixedRotation()
  public Rangef getSpawnRate()
  public Rangef getLifeSpan()
  public float getStartDelay()
  public Rangef getWaveDelay()
  public int getTotalSpawners()
  public int getMaxConcurrent()
  public InitialVelocity getInitialVelocity()
  public RangeVector3f getEmitOffset()
  public ParticleAttractor[] getAttractors()
  public String toString()

Fields:
public static final BuilderCodec<ParticleSpawnerGroup> CODEC
protected String spawnerId
protected Vector3f positionOffset
protected Direction rotationOffset
protected boolean fixedRotation
protected Rangef spawnRate
protected Rangef lifeSpan
protected float startDelay
protected Rangef waveDelay
protected int totalSpawners
protected int maxConcurrent
protected InitialVelocity initialVelocity
protected RangeVector3f emitOffset
protected ParticleAttractor[] attractors
