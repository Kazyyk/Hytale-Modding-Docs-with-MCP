# ModelParticle

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config | Implements: com.hypixel.hytale.server.core.io.NetworkSerializable

public class ModelParticle implements NetworkSerializable<com.hypixel.hytale.protocol.ModelParticle>

Binds a particle system to a model node. Specifies the particle system ID, target entity part, optional node name, color override, scale, position/rotation offsets, and whether the particle is detached from the model (spawns in world space vs. follows the model).

## Fields

- protected String systemId
- @Nonnull protected EntityPart targetEntityPart
- protected String targetNodeName
- protected Color color
- protected float scale
- protected Vector3f positionOffset
- protected Direction rotationOffset
- protected boolean detachedFromModel

## Methods

- public String getSystemId()
- public EntityPart getTargetEntityPart()
- public String getTargetNodeName()
- public Color getColor()
- public float getScale()
- public Vector3f getPositionOffset()
- public Direction getRotationOffset()
- public boolean isDetachedFromModel()
- public void setSystemId(String systemId)
- public void setTargetNodeName(String targetNodeName)
- public void setPositionOffset(Vector3f positionOffset)
- public void setDetachedFromModel(boolean detachedFromModel)
- public ModelParticle scale(float scale)
- public ModelParticle clone()
- @Nonnull public com.hypixel.hytale.protocol.ModelParticle toPacket()

Also in this package: Animation, AnimationSet, DetailBox, Model, ModelAsset, ModelAttachment, ModelReference

Complete API:
  public com.hypixel.hytale.protocol.ModelParticle toPacket()
  public String getSystemId()
  public void setSystemId(String systemId)
  public EntityPart getTargetEntityPart()
  public String getTargetNodeName()
  public void setTargetNodeName(String targetNodeName)
  public Color getColor()
  public float getScale()
  public Vector3f getPositionOffset()
  public void setPositionOffset(Vector3f positionOffset)
  public Direction getRotationOffset()
  public boolean isDetachedFromModel()
  public void setDetachedFromModel(boolean detachedFromModel)
  public ModelParticle scale(float scale)
  public String toString()
  public ModelParticle clone()

Fields:
public static final BuilderCodec<ModelParticle> CODEC
public static final ArrayCodec<ModelParticle> ARRAY_CODEC
protected String systemId
protected EntityPart targetEntityPart
protected String targetNodeName
protected Color color
protected float scale
protected Vector3f positionOffset
protected Direction rotationOffset
protected boolean detachedFromModel
