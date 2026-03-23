# GridNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class GridNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Loads grid noise configurations. Creates `GridNoise` with per-axis thickness values. ThicknessZ defaults to `0.0` if no shared default is given.

## Key Methods

- `load()`
- `loadDefaultThickness()`
- `loadThicknessX/Y/Z(double)`

## Related Types

- GridNoiseJsonLoader.Constants -- axis thickness keys and defaults

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseFunction load()
  protected double loadDefaultThickness()
  protected double loadThicknessX(double defaultThickness)
  protected double loadThicknessY(double defaultThickness)
  protected double loadThicknessZ(double defaultThickness)
  protected double loadThickness(String key, double defaultThickness)
