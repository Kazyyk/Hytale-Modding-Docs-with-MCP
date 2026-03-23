# ShapeDistortionJsonLoader

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.cave.shape | Extends: SeedResource> extends JsonLoader<K, ShapeDistortion>

public class ShapeDistortionJsonLoader<K extends SeedResource> extends JsonLoader<K, ShapeDistortion>

## Methods

- public ShapeDistortion load()
- @Nullable private NoiseProperty loadWidth()
- @Nullable private NoiseProperty loadFloor()
- @Nullable private NoiseProperty loadCeiling()
- public ShapeDistortionJsonLoader(@Nonnull SeedString<K> seed, Path dataFolder, JsonElement json)

## Inner Types

- `ShapeDistortionJsonLoader.Constants`

Also in this package: CaveNodeShapeGeneratorJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CylinderCaveNodeShapeGeneratorJsonLoader, DistortedCaveNodeShapeGeneratorJsonLoader, EllipsoidCaveNodeShapeGeneratorJsonLoader, EmptyLineCaveNodeShapeGeneratorJsonLoader, PipeCaveNodeShapeGeneratorJsonLoader, PrefabCaveNodeShapeGeneratorJsonLoader

Complete API:
  public ShapeDistortion load()
  private NoiseProperty loadWidth()
  private NoiseProperty loadFloor()
  private NoiseProperty loadCeiling()
