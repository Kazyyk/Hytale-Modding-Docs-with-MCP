# ModelVFX

Type: class | Package: com.hypixel.hytale.server.core.asset.type.modelvfx.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ModelVFX>>, NetworkSerializable<com.hypixel.hytale.protocol.ModelVFX>

public class ModelVFX implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ModelVFX>>, NetworkSerializable<com.hypixel.hytale.protocol.ModelVFX>

Class in the config subsystem.

## Fields

- STORE | AssetStore<String, ModelVFX, IndexedLookupTableAssetMap<String, ModelVFX>> | Static AssetStore<String, ModelVFX, IndexedLookupTableAssetMap<String, ModelVFX>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- switchTo | SwitchTo | SwitchTo field.
- effectDirection | EffectDirection | EffectDirection field.
- animationDuration | float | float field.
- loopOption | LoopOption | LoopOption field.
- curveType | CurveType | CurveType field.
- highlightThickness | float | float field.
- useBloomOnHighlight | boolean | boolean field.
- useProgressiveHighlight | boolean | boolean field.
- noiseScrollSpeed | Vector2f | Vector2f field.
- postColorOpacity | float | float field.

## Constructors

- ModelVFX(String id) | Creates a new ModelVFX instance.
- ModelVFX() | Creates a new ModelVFX instance.

## Methods

- getAssetStore() | AssetStore<String, ModelVFX, IndexedLookupTableAssetMap<String, ModelVFX>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, ModelVFX> | static public method.
- toPacket() | com.hypixel.hytale.protocol.ModelVFX | public method.
- getId() | String | public method.
- getSwitchTo() | SwitchTo | public method.
- getEffectDirection() | EffectDirection | public method.
- getAnimationDuration() | float | public method.
- getAnimationRange() | Vector2f | public method.
- getLoopOption() | LoopOption | public method.
- getCurveType() | CurveType | public method.
- getHighlightColor() | Color | public method.
- useBloomOnHighlight() | boolean | public method.
- useProgessiveHighlight() | boolean | public method.
- getHighlightThickness() | float | public method.
- getNoiseScale() | Vector2f | public method.
- getNoiseScrollSpeed() | Vector2f | public method.
- getPostColor() | Color | public method.
- getPostColorOpacity() | float | public method.
- toString() | String | public method.

Complete API:
  public static AssetStore<String,ModelVFX,IndexedLookupTableAssetMap<String,ModelVFX>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,ModelVFX> getAssetMap()
  public com.hypixel.hytale.protocol.ModelVFX toPacket()
  public String getId()
  public SwitchTo getSwitchTo()
  public EffectDirection getEffectDirection()
  public float getAnimationDuration()
  public Vector2f getAnimationRange()
  public LoopOption getLoopOption()
  public CurveType getCurveType()
  public Color getHighlightColor()
  public boolean useBloomOnHighlight()
  public boolean useProgessiveHighlight()
  public float getHighlightThickness()
  public Vector2f getNoiseScale()
  public Vector2f getNoiseScrollSpeed()
  public Color getPostColor()
  public float getPostColorOpacity()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ModelVFX> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
private static AssetStore<String,ModelVFX,IndexedLookupTableAssetMap<String,ModelVFX>> STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
private SwitchTo switchTo
private EffectDirection effectDirection
private float animationDuration
private Vector2f animationRange
private LoopOption loopOption
private CurveType curveType
private Color highlightColor
private float highlightThickness
private boolean useBloomOnHighlight
private boolean useProgressiveHighlight
private Vector2f noiseScale
private Vector2f noiseScrollSpeed
private Color postColor
private float postColorOpacity
