# LightRangePredicate

Type: class | Package: com.hypixel.hytale.server.spawning.util

public class LightRangePredicate

Predicate that tests whether a world position's light levels fall within configured ranges. Supports six independent light channels: combined light, sky light, sunlight, and RGB block light. Used by the spawning system to enforce light-based spawn conditions.

## Methods

- public static int lightToPrecentage(byte light)
- public void setLightRange(@Nonnull LightType type, double[] lightRange)
- public void setLightRange(@Nullable double[] lightRange)
- public void setSkyLightRange(@Nullable double[] lightRange)
- public void setSunlightRange(@Nullable double[] lightRange)
- public void setRedLightRange(@Nullable double[] lightRange)
- public void setGreenLightRange(@Nullable double[] lightRange)
- public void setBlueLightRange(@Nullable double[] lightRange)
- public boolean test(@Nonnull World world, @Nonnull Vector3d position, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean test(@Nullable BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)
- public static byte calculateLightValue(@Nonnull BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)

Also in this package: ChunkColumnMask, Debug, FloodFillEntryPoolProviderSimple, FloodFillEntryPoolSimple, FloodFillPositionSelector, RandomChunkColumnIterator, SortBufferProvider, WeightedPosition

Complete API:
  public static int lightToPrecentage(byte light)
  public void setLightRange(LightType type, double[] lightRange)
  public void setLightRange(double[] lightRange)
  public void setSkyLightRange(double[] lightRange)
  public void setSunlightRange(double[] lightRange)
  public void setRedLightRange(double[] lightRange)
  public void setGreenLightRange(double[] lightRange)
  public void setBlueLightRange(double[] lightRange)
  public boolean isTestLightValue()
  public boolean isTestSkyLightValue()
  public boolean isTestSunlightValue()
  public boolean isTestRedLightValue()
  public boolean isTestGreenLightValue()
  public boolean isTestBlueLightValue()
  public boolean test(World world, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public boolean test(BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)
  public boolean testLight(byte lightValue)
  public boolean testSkyLight(byte lightValue)
  public boolean testSunlight(byte lightValue)
  public boolean testRedLight(byte lightValue)
  public boolean testGreenLight(byte lightValue)
  public boolean testBlueLight(byte lightValue)
  public static byte calculateLightValue(BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)
  private boolean test(byte lightValue, byte min, byte max)
  private byte lightPercentageToAbsolute(double light)
  private boolean isPartialRange(byte min, byte max)

Fields:
private byte lightValueMin
private byte lightValueMax
private byte skyLightValueMin
private byte skyLightValueMax
private byte sunlightValueMin
private byte sunlightValueMax
private byte redLightValueMin
private byte redLightValueMax
private byte greenLightValueMin
private byte greenLightValueMax
private byte blueLightValueMin
private byte blueLightValueMax
private boolean testLightValue
private boolean testSkyLightValue
private boolean testSunlightValue
private boolean testRedLightValue
private boolean testGreenLightValue
private boolean testBlueLightValue
