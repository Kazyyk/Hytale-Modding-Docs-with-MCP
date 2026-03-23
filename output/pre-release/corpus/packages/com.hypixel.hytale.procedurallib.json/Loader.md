# Loader

Type: class | Package: com.hypixel.hytale.procedurallib.json

public abstract class Loader<K extends SeedResource, T>

Abstract base class for all resource loaders in the procedural generation system. Provides seed-based resource loading with a data folder path for resolving file references.

## Type Parameters

- `K` -- the seed resource type, must extend `SeedResource`
- `T` -- the type of resource produced by this loader

## Constructor


public Loader(SeedString<K> seed, Path dataFolder)

## Accessors

- getSeed() | SeedString<K> | The seed string used for deterministic generation.
- getDataFolder() | Path | The root data folder for resolving file references.

## Abstract Methods


@Nullable
public abstract T load()

Loads and returns the resource, or `null` if loading fails.

## Related Types

- SeedString -- wraps seed values for deterministic generation
- SeedResource -- interface providing thread-local result buffers
- JsonLoader -- JSON-specific subclass

Known subclasses: ChunkGeneratorJsonLoader, JsonLoader, ZonesJsonLoader

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public SeedString<K> getSeed()
  public Path getDataFolder()
  public abstract T load()

Fields:
protected SeedString<K> seed
protected final Path dataFolder
