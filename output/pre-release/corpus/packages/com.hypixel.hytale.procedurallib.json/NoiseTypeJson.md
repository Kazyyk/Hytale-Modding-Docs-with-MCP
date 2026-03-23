# NoiseTypeJson

Type: enum | Package: com.hypixel.hytale.procedurallib.json

public enum NoiseTypeJson

Maps noise type names to their corresponding JSON loader classes. Each constant holds a reflectively-obtained constructor for the loader, enabling dynamic loader instantiation based on the `"NoiseType"` key in JSON configuration.

## Enum Constants

- CELL | NoiseType.CELL | CellNoiseJsonLoader
- CONSTANT | NoiseType.CONSTANT | ConstantNoiseJsonLoader
- DISTANCE | NoiseType.DISTANCE | DistanceNoiseJsonLoader
- PERLIN | NoiseType.PERLIN | PerlinNoiseJsonLoader
- SIMPLEX | NoiseType.SIMPLEX | SimplexNoiseJsonLoader
- OLD_SIMPLEX | NoiseType.OLD_SIMPLEX | OldSimplexNoiseJsonLoader
- VALUE | NoiseType.VALUE | ValueNoiseJsonLoader
- MESH | NoiseType.MESH | MeshNoiseJsonLoader
- GRID | NoiseType.GRID | GridNoiseJsonLoader
- BRANCH | NoiseType.BRANCH | BranchNoiseJsonLoader
- POINT | NoiseType.POINT | PointNoiseJsonLoader

## Methods


@Nonnull
public <K extends SeedResource> JsonLoader<K, NoiseFunction> newLoader(SeedString<K> seed, Path dataFolder, JsonElement json)

Reflectively constructs a new loader instance for this noise type.

## Related Types

- NoiseFunctionJsonLoader -- uses this enum to dispatch to the correct loader

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public JsonLoader<K,NoiseFunction> newLoader(SeedString<K> seed, Path dataFolder, JsonElement json)

Fields:
private final NoiseType noiseType
private final Constructor constructor
