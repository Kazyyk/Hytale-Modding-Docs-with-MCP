# ParticleCollision

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.ParticleCollision>

public class ParticleCollision implements NetworkSerializable<com.hypixel.hytale.protocol.ParticleCollision>

Configuration for particle collision behavior with world geometry.

Also in this package: Particle, ParticleAnimationFrame, ParticleAttractor, ParticleSpawner, ParticleSpawnerGroup, ParticleSystem, WorldParticle

Complete API:
  public ParticleCollisionBlockType getParticleMapCollision()
  public ParticleCollisionAction getType()
  public ParticleRotationInfluence getParticleRotationInfluence()
  public com.hypixel.hytale.protocol.ParticleCollision toPacket()
  public String toString()

Fields:
public static final BuilderCodec<ParticleCollision> CODEC
private ParticleCollisionBlockType blockType
private ParticleCollisionAction action
private ParticleRotationInfluence particleRotationInfluence
