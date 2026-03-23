# ModelAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config | Implements: com.hypixel.hytale.assetstore.map.JsonAssetWithMap

public class ModelAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ModelAsset>>

JSON asset definition for model configuration. Defines all visual and physics properties: model/texture paths, gradient references, bounding box, eye height, crouch/sitting/sleeping offsets, camera settings, scale range, animation sets, default and random attachments, particles, trails, light, detail boxes, physics values, icon properties, and phobia configuration. The `CODEC` field provides the full deserialization codec with UI metadata annotations.

## Key Accessors

- public String getId()
- public String getModel()
- public String getTexture()
- public String getGradientSet()
- public String getGradientId()
- public float getEyeHeight()
- public float getCrouchOffset()
- public float getSittingOffset()
- public float getSleepingOffset()
- @Nonnull public Box getBoundingBox()
- public Map<String, ModelAsset.AnimationSet> getAnimationSetMap()
- public CameraSettings getCamera()
- public ColorLight getLight()
- public ModelParticle[] getParticles()
- public ModelTrail[] getTrails()
- public PhysicsValues getPhysicsValues()
- public ModelAttachment[] getDefaultAttachments()
- public ModelAttachment[] getAttachments(@Nullable Map<String, String> randomAttachmentIds)
- public float getMinScale()
- public float getMaxScale()
- public float generateRandomScale()
- @Nullable public Map<String, String> generateRandomAttachmentIds()
- public Map<String, DetailBox[]> getDetailBoxes()
- public Phobia getPhobia()
- public static DefaultAssetMap<String, ModelAsset> getAssetMap()

## Inner Types

### Animation


public static class Animation

Single animation entry with path, speed, blending duration, looping flag, weight, footstep intervals, sound event, and passive loop count.

### AnimationSet


public static class AnimationSet

Named collection of animations with a delay range between passive animation switches.

Also in this package: Animation, AnimationSet, DetailBox, Model, ModelAttachment, ModelParticle, ModelReference

Complete API:
  public static AssetStore<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> getAssetStore()
  public static DefaultAssetMap<String,ModelAsset> getAssetMap()
  public String getId()
  public String getModel()
  public String getTexture()
  public String getGradientId()
  public String getGradientSet()
  public float getEyeHeight()
  public float getCrouchOffset()
  public float getSittingOffset()
  public float getSleepingOffset()
  public Map<String,ModelAsset.AnimationSet> getAnimationSetMap()
  public CameraSettings getCamera()
  public Box getBoundingBox()
  public ColorLight getLight()
  public ModelParticle[] getParticles()
  public ModelTrail[] getTrails()
  public PhysicsValues getPhysicsValues()
  public ModelAttachment[] getDefaultAttachments()
  public Map<String,Map<String,ModelAttachment>> getRandomAttachmentSets()
  public float getMinScale()
  public float getMaxScale()
  public AssetIconProperties getIconProperties()
  public String getIcon()
  public float generateRandomScale()
  public Map<String,String> generateRandomAttachmentIds()
  public ModelAttachment[] getAttachments(Map<String,String> randomAttachmentIds)
  public Map<String,DetailBox[]> getDetailBoxes()
  public Phobia getPhobia()
  public String getPhobiaModelAssetId()
  public String toString()

Fields:
public static final BuilderCodec<ModelTrail> MODEL_TRAIL_CODEC
public static final ArrayCodec<ModelTrail> MODEL_TRAIL_ARRAY_CODEC
public static final AssetBuilderCodec<String,ModelAsset> CODEC
public static final ModelAsset DEBUG
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> ASSET_STORE
protected AssetExtraInfo.Data extraData
protected String id
protected String model
protected String texture
protected String gradientSet
protected String gradientId
protected float eyeHeight
protected float crouchOffset
protected float sittingOffset
protected float sleepingOffset
protected Map<String,ModelAsset.AnimationSet> animationSetMap
protected CameraSettings camera
protected Box boundingBox
protected ColorLight light
protected ModelParticle[] particles
protected ModelTrail[] trails
protected PhysicsValues physicsValues
protected ModelAttachment[] defaultAttachments
protected Map<String,Map<String,ModelAttachment>> randomAttachmentSets
protected float minScale
protected float maxScale
protected String icon
protected AssetIconProperties iconProperties
protected Map<String,DetailBox[]> detailBoxes
protected Map<String,IWeightedMap<String>> weightedRandomAttachmentSets
protected Phobia phobia
protected String phobiaModelAssetId
