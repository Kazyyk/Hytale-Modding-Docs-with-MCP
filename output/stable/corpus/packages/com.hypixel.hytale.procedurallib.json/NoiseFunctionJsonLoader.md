# NoiseFunctionJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class NoiseFunctionJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Dispatches noise function loading based on the `"NoiseType"` JSON key. Reads the noise type string, resolves it via `NoiseTypeJson`, and delegates to the appropriate type-specific loader.

## Key Methods

- `load()` -- reads NoiseType, dispatches to type-specific loader
- `newLoader(@Nonnull NoiseTypeJson noiseTypeJson)`

## Related Types

- NoiseTypeJson -- enum mapping noise types to loader classes

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseFunction load()
  protected JsonLoader<K,NoiseFunction> newLoader(NoiseTypeJson noiseTypeJson)
