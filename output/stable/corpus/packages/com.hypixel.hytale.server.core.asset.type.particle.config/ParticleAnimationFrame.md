# ParticleAnimationFrame

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.ParticleAnimationFrame>

public class ParticleAnimationFrame implements NetworkSerializable<com.hypixel.hytale.protocol.ParticleAnimationFrame>

A single frame in a particle sprite animation sequence.

Also in this package: Particle, ParticleAttractor, ParticleCollision, ParticleSpawner, ParticleSpawnerGroup, ParticleSystem, WorldParticle

Complete API:
  public Range getFrameIndex()
  public RangeVector2f getScale()
  public RangeVector3f getRotation()
  public Color getColor()
  public float getOpacity()
  public com.hypixel.hytale.protocol.ParticleAnimationFrame toPacket()
  public String toString()

Fields:
public static final int UNASSIGNED_OPACITY
public static final BuilderCodec<ParticleAnimationFrame> CODEC
protected Range frameIndex
protected RangeVector2f scale
protected RangeVector3f rotation
protected Color color
protected float opacity
