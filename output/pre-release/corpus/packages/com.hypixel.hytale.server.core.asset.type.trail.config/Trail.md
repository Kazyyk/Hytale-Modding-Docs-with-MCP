# Trail

Type: class | Package: com.hypixel.hytale.server.core.asset.type.trail.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, Trail>>, NetworkSerializable<com.hypixel.hytale.protocol.Trail>

public class Trail implements JsonAssetWithMap<String, DefaultAssetMap<String, Trail>>, NetworkSerializable<com.hypixel.hytale.protocol.Trail>

Class in the config subsystem.

## Fields

- ASSET_STORE | AssetStore<String, Trail, DefaultAssetMap<String, Trail>> | Static AssetStore<String, Trail, DefaultAssetMap<String, Trail>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- texture | String | String field.
- renderMode | FXRenderMode | FXRenderMode field.
- intersectionHighlight | IntersectionHighlight | IntersectionHighlight field.
- lifeSpan | int | int field.
- roll | float | float field.
- lightInfluence | float | float field.
- smooth | boolean | boolean field.
- start | Edge | Edge field.
- end | Edge | Edge field.
- animation | Animation | Animation field.
- cachedPacket | SoftReference<com.hypixel.hytale.protocol.Trail> | SoftReference<com.hypixel.hytale.protocol.Trail> field.

## Constructors

- Trail() | Creates a new Trail instance.

## Methods

- getAssetStore() | AssetStore<String, Trail, DefaultAssetMap<String, Trail>> | static public method.
- getAssetMap() | DefaultAssetMap<String, Trail> | static public method.
- toPacket() | com.hypixel.hytale.protocol.Trail | public method.
- getId() | String | public method.
- getTexture() | String | public method.
- getRenderMode() | FXRenderMode | public method.
- getIntersectionHighlight() | IntersectionHighlight | public method.
- getLifeSpan() | int | public method.
- getRoll() | float | public method.
- getLightInfluence() | float | public method.
- isSmooth() | boolean | public method.
- getStart() | Edge | public method.
- getEnd() | Edge | public method.
- getAnimation() | Animation | public method.
- toString() | String | public method.

Also in this package: Animation, Edge

Complete API:
  public static AssetStore<String,Trail,DefaultAssetMap<String,Trail>> getAssetStore()
  public static DefaultAssetMap<String,Trail> getAssetMap()
  public com.hypixel.hytale.protocol.Trail toPacket()
  public String getId()
  public String getTexture()
  public FXRenderMode getRenderMode()
  public IntersectionHighlight getIntersectionHighlight()
  public int getLifeSpan()
  public float getRoll()
  public float getLightInfluence()
  public boolean isSmooth()
  public Edge getStart()
  public Edge getEnd()
  public Animation getAnimation()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,Trail> CODEC
private static AssetStore<String,Trail,DefaultAssetMap<String,Trail>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
protected String texture
protected FXRenderMode renderMode
protected IntersectionHighlight intersectionHighlight
protected int lifeSpan
protected float roll
protected float lightInfluence
protected boolean smooth
protected Edge start
protected Edge end
protected Animation animation
protected SoftReference<com.hypixel.hytale.protocol.Trail> cachedPacket
