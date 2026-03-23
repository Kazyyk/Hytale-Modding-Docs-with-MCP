# Model

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config | Implements: com.hypixel.hytale.server.core.io.NetworkSerializable

public class Model implements NetworkSerializable<com.hypixel.hytale.protocol.Model>

Resolved runtime model constructed from a ModelAsset at a specific scale. Owns all visual properties: bounding boxes (standing, crouching, sitting, sleeping), eye height with offsets, animation set map, camera settings, light, particles, trails, physics values, detail boxes, attachments, gradient IDs, phobia configuration, and the model/texture paths. Provides static factory methods for creating scaled, unit-scale, random-scale, and static models. Caches the network packet via a `SoftReference`.

## Constants

- public static final String UNKNOWN_TEXTURE

## Key Accessors

- public String getModelAssetId()
- public float getScale()
- @Nullable public Box getBoundingBox()
- @Nullable public Box getBoundingBox(@Nullable MovementStates movementStates)
- @Nullable public Box getCrouchBoundingBox()
- @Nullable public Box getSittingBoundingBox()
- @Nullable public Box getSleepingBoundingBox()
- public String getModel()
- public String getTexture()
- public String getGradientSet()
- public String getGradientId()
- public float getEyeHeight()
- public float getEyeHeight(@Nullable Ref<EntityStore> ref, @Nullable ComponentAccessor<EntityStore> componentAccessor)
- public float getCrouchOffset()
- public float getSittingOffset()
- public float getSleepingOffset()
- public Map<String, ModelAsset.AnimationSet> getAnimationSetMap()
- public CameraSettings getCamera()
- public ColorLight getLight()
- public ModelParticle[] getParticles()
- public ModelTrail[] getTrails()
- public PhysicsValues getPhysicsValues()
- public Map<String, DetailBox[]> getDetailBoxes()
- public ModelAttachment[] getAttachments()
- public Phobia getPhobia()
- @Nonnull public Model.ModelReference toReference()
- @Nonnull public com.hypixel.hytale.protocol.Model toPacket()

## Static Factory Methods

- @Nonnull public static Model createRandomScaleModel(@Nonnull ModelAsset modelAsset)
- @Nonnull public static Model createUnitScaleModel(@Nonnull ModelAsset modelAsset)
- @Nonnull public static Model createUnitScaleModel(@Nonnull ModelAsset modelAsset, @Nullable Box boundingBox)
- @Nonnull public static Model createScaledModel(@Nonnull ModelAsset modelAsset, float scale)
- @Nonnull public static Model createStaticScaledModel(@Nonnull ModelAsset modelAsset, float scale)
- @Nonnull public static Model createScaledModel(@Nonnull ModelAsset modelAsset, float scale, @Nullable Map<String, String> randomAttachmentIds, @Nullable Box overrideBoundingBox, boolean staticModel)

## Inner Types

### ModelReference


public static class ModelReference

Serializable reference to a model asset by ID, scale, random attachment choices, and static flag. Can resolve back to a full `Model` via `toModel()`.

Also in this package: Animation, AnimationSet, DetailBox, ModelAsset, ModelAttachment, ModelParticle, ModelReference

Complete API:
  public com.hypixel.hytale.protocol.Model toPacket()
  public String getModelAssetId()
  public float getScale()
  public Map<String,String> getRandomAttachmentIds()
  public ModelAttachment[] getAttachments()
  public Box getBoundingBox(MovementStates movementStates)
  public Box getBoundingBox()
  public Box getCrouchBoundingBox()
  public Box getSittingBoundingBox()
  public Box getSleepingBoundingBox()
  public String getModel()
  public String getTexture()
  public String getGradientSet()
  public String getGradientId()
  public float getEyeHeight()
  public float getCrouchOffset()
  public float getSittingOffset()
  public float getSleepingOffset()
  public Map<String,ModelAsset.AnimationSet> getAnimationSetMap()
  public String getFirstBoundAnimationId(String id, String fallbackId)
  public String getFirstBoundAnimationId(String preferenceOrder)
  public CameraSettings getCamera()
  public ColorLight getLight()
  public ModelParticle[] getParticles()
  public ModelTrail[] getTrails()
  public PhysicsValues getPhysicsValues()
  public Map<String,DetailBox[]> getDetailBoxes()
  public Phobia getPhobia()
  public String getPhobiaModelAssetId()
  public Model.ModelReference toReference()
  public float getEyeHeight(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Model createRandomScaleModel(ModelAsset modelAsset)
  public static Model createStaticScaledModel(ModelAsset modelAsset, float scale)
  public static Model createUnitScaleModel(ModelAsset modelAsset)
  public static Model createUnitScaleModel(ModelAsset modelAsset, Box boundingBox)
  public static Model createScaledModel(ModelAsset modelAsset, float scale)
  public static Model createScaledModel(ModelAsset modelAsset, float scale, Map<String,String> randomAttachmentIds)
  public static Model createScaledModel(ModelAsset modelAsset, float scale, Map<String,String> randomAttachmentIds, Box overrideBoundingBox)
  public static Model createScaledModel(ModelAsset modelAsset, float scale, Map<String,String> randomAttachmentIds, Box overrideBoundingBox, boolean staticModel)

Fields:
public static final String UNKNOWN_TEXTURE
private final String modelAssetId
private final float scale
private final Map<String,String> randomAttachmentIds
private final ModelAttachment[] attachments
private final Box boundingBox
private final Box crouchBoundingBox
private final Box sittingBoundingBox
private final Box sleepingBoundingBox
private final String model
private final String texture
private final String gradientSet
private final String gradientId
private final float eyeHeight
private final float crouchOffset
private final float sittingOffset
private final float sleepingOffset
private final Map<String,ModelAsset.AnimationSet> animationSetMap
private final CameraSettings camera
private final ColorLight light
private final ModelParticle[] particles
private final ModelTrail[] trails
private final PhysicsValues physicsValues
private final Map<String,DetailBox[]> detailBoxes
private final Phobia phobia
private final String phobiaModelAssetId
private transient SoftReference<com.hypixel.hytale.protocol.Model> cachedPacket
