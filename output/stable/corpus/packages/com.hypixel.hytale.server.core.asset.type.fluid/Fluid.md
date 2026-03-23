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
