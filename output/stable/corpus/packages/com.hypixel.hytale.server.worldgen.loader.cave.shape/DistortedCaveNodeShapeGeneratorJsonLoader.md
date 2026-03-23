# DistortedCaveNodeShapeGeneratorJsonLoader

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.cave.shape | Extends: CaveNodeShapeGeneratorJsonLoader

public class DistortedCaveNodeShapeGeneratorJsonLoader extends CaveNodeShapeGeneratorJsonLoader

## Methods

- @Nonnull public CaveNodeShapeEnum.CaveNodeShapeGenerator load()
- @Nonnull private DistortedShape.Factory loadShape()
- @Nullable private IDoubleRange loadWidth()
- @Nullable private IDoubleRange loadHeight()
- @Nullable private IDoubleRange loadMidWidth()
- @Nullable private IDoubleRange loadMidHeight()
- @Nullable private IDoubleRange loadLength()
- private boolean loadInheritParentRadius()
- @Nullable private ShapeDistortion loadShapeDistortion()
- private GeneralNoise.InterpolationFunction loadInterpolation()
- public DistortedCaveNodeShapeGeneratorJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)

## Inner Types

- `DistortedCaveNodeShapeGeneratorJsonLoader.Constants`

Also in this package: CaveNodeShapeGeneratorJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CylinderCaveNodeShapeGeneratorJsonLoader, EllipsoidCaveNodeShapeGeneratorJsonLoader, EmptyLineCaveNodeShapeGeneratorJsonLoader, PipeCaveNodeShapeGeneratorJsonLoader, PrefabCaveNodeShapeGeneratorJsonLoader, ShapeDistortionJsonLoader

Complete API:
  public CaveNodeShapeEnum.CaveNodeShapeGenerator load()
  private DistortedShape.Factory loadShape()
  private IDoubleRange loadWidth()
  private IDoubleRange loadHeight()
  private IDoubleRange loadMidWidth()
  private IDoubleRange loadMidHeight()
  private IDoubleRange loadLength()
  private boolean loadInheritParentRadius()
  private ShapeDistortion loadShapeDistortion()
  private GeneralNoise.InterpolationFunction loadInterpolation()
