# AmbienceFXConditions

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: NetworkSerializable

public class AmbienceFXConditions implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXConditions>

Implements `NetworkSerializable`.

## Constants

- public static final Range DEFAULT_ALTITUDE
- public static final Rangeb DEFAULT_WALLS
- public static final Rangeb DEFAULT_LIGHT_LEVEL
- public static final Rangef DEFAULT_DAY_TIME

## Fields

- protected boolean never
- protected String[] environmentIds
- protected transient int[] environmentIndices
- protected String[] weatherIds
- protected transient int[] weatherIndices
- protected String environmentTagPattern
- protected String weatherTagPattern
- protected String[] fluidFXIds
- protected transient int[] fluidFXIndices
- protected AmbienceFXBlockSoundSet[] surroundingBlockSoundSets
- protected Range altitude
- protected Rangeb walls
- protected boolean roof
- protected String roofMaterialTagPattern
- protected boolean floor
- protected Rangeb sunLightLevel
- protected Rangeb torchLightLevel
- protected Rangeb globalLightLevel
- protected Rangef dayTime

## Methods

- @Nonnull public com.hypixel.hytale.protocol.AmbienceFXConditions toPacket()
- public boolean isNever()
- public String[] getEnvironmentIds()
- public int[] getEnvironmentIndices()
- public String[] getWeatherIds()
- public int[] getWeatherIndices()
- public String[] getFluidFXIds()
- public int[] getFluidFXIndices()
- public AmbienceFXBlockSoundSet[] getSurroundingBlockSoundSets()
- public Range getAltitude()
- public Rangeb getWalls()
- public boolean getRoof()
- public boolean getFloor()
- public Rangeb getSunLightLevel()
- public Rangeb getTorchLightLevel()
- public Rangeb getGlobalLightLevel()
- public Rangef getDayTime()
- public boolean isRoof()
- public boolean isFloor()
- protected void processConfig()
- @Override public String toString()
