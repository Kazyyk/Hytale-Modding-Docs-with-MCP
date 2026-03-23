# FadeContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class FadeContainer

Container defining zone border fade parameters for world generation. Stores mask and terrain fade start distances, gradient lengths, and an optional fade heightmap value.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry, UniquePrefabContainer (and 2 more)

Complete API:
  public double getMaskFadeStart()
  public double getMaskFadeLength()
  public double getMaskFadeSum()
  public double getHeightFadeStart()
  public double getHeightFadeLength()
  public double getHeightFadeSum()
  public double getFadeHeightmap()
  public double getMaskFactor(ZoneGeneratorResult result)
  public double getTerrainFactor(ZoneGeneratorResult result)
  public double getFactor(ZoneGeneratorResult result, double distanceFromBorder, double gradientWidth)
  public boolean shouldFade()
  public String toString()
  private static double limit(double d)

Fields:
public static final double NO_FADE_HEIGHTMAP
protected final double maskFadeStart
protected final double maskFadeLength
protected final double maskFadeSum
protected final double terrainFadeStart
protected final double terrainFadeLength
protected final double terrainFadeSum
protected final double fadeHeightmap
