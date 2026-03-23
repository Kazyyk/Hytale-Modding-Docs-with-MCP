# WorldParticle

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.WorldParticle>

public class WorldParticle implements NetworkSerializable<com.hypixel.hytale.protocol.WorldParticle>

Configuration for world-space particle effects tied to specific locations.

Also in this package: Particle, ParticleAnimationFrame, ParticleAttractor, ParticleCollision, ParticleSpawner, ParticleSpawnerGroup, ParticleSystem

Complete API:
  public String getSystemId()
  public Color getColor()
  public float getScale()
  public Vector3f getPositionOffset()
  public Direction getRotationOffset()
  public com.hypixel.hytale.protocol.WorldParticle toPacket()
  public String toString()

Fields:
public static final String SYSTEM_ID_DOC
public static final String COLOR_DOC
public static final String SCALE_DOC
public static final String POSITION_OFFSET_DOC
public static final String ROTATION_OFFSET_DOC
public static final BuilderCodec<WorldParticle> CODEC
public static final ArrayCodec<WorldParticle> ARRAY_CODEC
protected String systemId
protected Color color
protected float scale
protected Vector3f positionOffset
protected Direction rotationOffset
