# ParticleAttractor

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.ParticleAttractor>

public class ParticleAttractor implements NetworkSerializable<com.hypixel.hytale.protocol.ParticleAttractor>

Configuration for a point attractor that influences particle motion.

Also in this package: Particle, ParticleAnimationFrame, ParticleCollision, ParticleSpawner, ParticleSpawnerGroup, ParticleSystem, WorldParticle

Complete API:
  public Vector3f getPosition()
  public Vector3f getRadialAxis()
  public float getTrailPositionMultiplier()
  public float getRadius()
  public float getRadialAcceleration()
  public float getRadialTangentAcceleration()
  public Vector3f getLinearAcceleration()
  public float getRadialImpulse()
  public float getRadialTangentImpulse()
  public Vector3f getLinearImpulse()
  public Vector3f getDampingMultiplier()
  public com.hypixel.hytale.protocol.ParticleAttractor toPacket()
  public String toString()

Fields:
public static final BuilderCodec<ParticleAttractor> CODEC
protected Vector3f position
protected Vector3f radialAxis
protected float trailPositionMultiplier
protected float radius
protected float radialAcceleration
protected float radialTangentAcceleration
protected Vector3f linearAcceleration
protected float radialImpulse
protected float radialTangentImpulse
protected Vector3f linearImpulse
protected Vector3f dampingMultiplier
