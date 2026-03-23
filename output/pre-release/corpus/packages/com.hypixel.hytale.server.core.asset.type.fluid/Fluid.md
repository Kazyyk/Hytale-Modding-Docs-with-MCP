# Fluid

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid | Implements: com.hypixel.hytale.assetstore.map.JsonAssetWithMap, com.hypixel.hytale.server.core.io.NetworkSerializable

public class Fluid implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Fluid>>, NetworkSerializable<com.hypixel.hytale.protocol.Fluid>

JSON-loaded fluid asset type. Defines all visual and behavioral properties of a fluid: max level (0-15), textures, shader effects, draw type, opacity, alpha blending, FluidFX reference, particles, ticker (simulation behavior), light emission, entity damage, block sound/particle sets, particle color, and interaction map. Supports asset inheritance and clone-based variant creation.

## Constants

- public static final int EMPTY_ID
- public static final String EMPTY_KEY
- public static final Fluid EMPTY
- public static final int UNKNOWN_ID
- public static final Fluid UNKNOWN
- public static final String UNKNOWN_TEXTURE

## Asset Properties (JSON-configurable)

- int maxFluidLevel
- BlockTypeTextures[] textures
- ShaderType[] effect
- FluidDrawType drawType
- Opacity opacity
- boolean requiresAlphaBlending
- String fluidFXId
- ModelParticle[] particles
- FluidTicker ticker
- int damageToEntities
- ColorLight light
- Color particleColor
- String blockSoundSetId
- String blockParticleSetId
- Map<InteractionType, String> interactions

## Key Methods

- public static AssetStore<...> getAssetStore()
- public static IndexedLookupTableAssetMap<String, Fluid> getAssetMap()
- public String getId()
- public boolean isUnknown()
- public int getMaxFluidLevel()
- public boolean hasEffect(ShaderType shader)
- public FluidTicker getTicker()
- public int getDamageToEntities()
- public String getFluidFXId()
- public int getFluidFXIndex()
- public ColorLight getLight()
- public Color getParticleColor()
- public boolean isTrigger()
- public Map<InteractionType, String> getInteractions()
- @Nonnull public Fluid clone(String newKey)
- @Nonnull public com.hypixel.hytale.protocol.Fluid toPacket()
- public static int getFluidIdOrUnknown(String key, String message, Object... params)

## Inner Types

### ConversionResult (deprecated static class)


@Deprecated(forRemoval = true)
public static class ConversionResult

Legacy conversion result holding a block type string, fluid ID, and fluid level. Used by the deprecated `convertBlockToFluid` and `convertLegacyName` methods.

## Related Types

- FluidTicker -- tick behavior for fluid simulation
- FluidTypePacketGenerator -- network packet generation

Also in this package: Accessor, AliveStatus, CachedAccessor, ConversionResult, DefaultFluidTicker, FiniteFluidTicker, FireFluidTicker, FlammabilityConfig, FluidCollisionConfig, FluidTicker, FluidTypePacketGenerator, SpreadOutcome

Complete API:
  public static AssetStore<String,Fluid,IndexedLookupTableAssetMap<String,Fluid>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,Fluid> getAssetMap()
  public AssetExtraInfo.Data getData()
  public String getId()
  public boolean isUnknown()
  public int getMaxFluidLevel()
  public boolean hasEffect(ShaderType shader)
  public FluidTicker getTicker()
  public int getDamageToEntities()
  public String getFluidFXId()
  public int getFluidFXIndex()
  public ColorLight getLight()
  public Color getParticleColor()
  public boolean isTrigger()
  public Map<InteractionType,String> getInteractions()
  protected void processConfig()
  public static Fluid getUnknownFor(String key)
  public Fluid clone(String newKey)
  public static int getFluidIdOrUnknown(String key, String message, Object params)
  public static int getFluidIdOrUnknown(IndexedLookupTableAssetMap<String,Fluid> assetMap, String key, String message, Object params)
  public com.hypixel.hytale.protocol.Fluid toPacket()
  public static String convertLegacyName(String fluidName, byte level)
  public static Fluid.ConversionResult convertBlockToFluid(String blockTypeStr)

Fields:
public static final AssetBuilderCodec<String,Fluid> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
public static final String UNKNOWN_TEXTURE
public static final BlockTextures[] UNKNOWN_BLOCK_TEXTURES
public static final ShaderType[] DEFAULT_SHADER_EFFECTS
public static final ISectionPalette.KeySerializer KEY_SERIALIZER
public static final ToIntFunction<ByteBuf> KEY_DESERIALIZER
public static final int EMPTY_ID
public static final String EMPTY_KEY
public static final Fluid EMPTY
public static final int UNKNOWN_ID
public static final Fluid UNKNOWN
private static AssetStore<String,Fluid,IndexedLookupTableAssetMap<String,Fluid>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected boolean unknown
private int maxFluidLevel
private BlockTypeTextures[] textures
private ShaderType[] effect
protected ModelParticle[] particles
private FluidDrawType drawType
private Opacity opacity
private boolean requiresAlphaBlending
private String fluidFXId
protected transient int fluidFXIndex
private FluidTicker ticker
protected int damageToEntities
protected ColorLight light
protected Color particleColor
protected String blockSoundSetId
protected transient int blockSoundSetIndex
public String blockParticleSetId
protected Map<InteractionType,String> interactions
protected transient boolean isTrigger
