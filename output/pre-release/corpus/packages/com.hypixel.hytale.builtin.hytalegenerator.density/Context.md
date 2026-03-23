# Context

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density

public static class Context

Evaluation context for density functions. Provides position, field values, and random state to density function nodes during terrain generation.

Also in this package: Density

Complete API:
  public void assign(Density.Context other)
  public void assign(VectorProvider.Context context)
  public void assign(MaterialProvider.Context context)
  public void assign(EnvironmentProvider.Context context)
  public void assign(Pattern.Context context)
  public void assign(Prop.Context other)

Fields:
public Vector3d position
public Vector3d densityAnchor
public Vector3d positionsAnchor
public int switchState
public double distanceFromCellWall
public TerrainDensityProvider terrainDensityProvider
public double distanceToBiomeEdge
