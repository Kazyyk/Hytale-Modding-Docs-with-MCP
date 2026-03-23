# PrefabCaveNodeShapeGeneratorJsonLoader

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.cave.shape | Extends: CaveNodeShapeGeneratorJsonLoader

public class PrefabCaveNodeShapeGeneratorJsonLoader extends CaveNodeShapeGeneratorJsonLoader

## Methods

- @Nonnull public PrefabCaveNodeShape.PrefabCaveNodeShapeGenerator load()
- @Nonnull protected List<WorldGenPrefabSupplier> loadPrefabs()
- @Nullable protected BlockMaskCondition loadMask()
- public PrefabCaveNodeShapeGeneratorJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)

## Inner Types

- `PrefabCaveNodeShapeGeneratorJsonLoader.Constants`

Also in this package: CaveNodeShapeGeneratorJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CylinderCaveNodeShapeGeneratorJsonLoader, DistortedCaveNodeShapeGeneratorJsonLoader, EllipsoidCaveNodeShapeGeneratorJsonLoader, EmptyLineCaveNodeShapeGeneratorJsonLoader, PipeCaveNodeShapeGeneratorJsonLoader, ShapeDistortionJsonLoader

Complete API:
  public PrefabCaveNodeShape.PrefabCaveNodeShapeGenerator load()
  protected List<WorldGenPrefabSupplier> loadPrefabs()
  protected BlockMaskCondition loadMask()
