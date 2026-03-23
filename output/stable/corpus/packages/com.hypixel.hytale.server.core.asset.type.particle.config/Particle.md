# Particle

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.Particle>

public class Particle implements NetworkSerializable<com.hypixel.hytale.protocol.Particle>

Configuration for a single particle type including visual properties and lifecycle parameters.

Also in this package: ParticleAnimationFrame, ParticleAttractor, ParticleCollision, ParticleSpawner, ParticleSpawnerGroup, ParticleSystem, WorldParticle

Complete API:
  public String getTexture()
  public Size getFrameSize()
  public ParticleUVOption getUvOption()
  public ParticleScaleRatioConstraint getScaleRatioConstraint()
  public SoftParticle getSoftParticle()
  public float getSoftParticlesFadeFactor()
  public boolean isUseSpriteBlending()
  public ParticleAnimationFrame getInitialAnimationFrame()
  public ParticleAnimationFrame getCollisionAnimationFrame()
  public Int2ObjectMap<ParticleAnimationFrame> getAnimation()
  public com.hypixel.hytale.protocol.Particle toPacket()
  public String toString()

Fields:
public static final BuilderCodec<Particle> CODEC
protected String texture
protected Size frameSize
protected ParticleUVOption uvOption
protected ParticleScaleRatioConstraint scaleRatioConstraint
protected SoftParticle softParticle
protected float softParticlesFadeFactor
protected boolean useSpriteBlending
protected ParticleAnimationFrame initialAnimationFrame
protected ParticleAnimationFrame collisionAnimationFrame
protected Int2ObjectMap<ParticleAnimationFrame> animation
