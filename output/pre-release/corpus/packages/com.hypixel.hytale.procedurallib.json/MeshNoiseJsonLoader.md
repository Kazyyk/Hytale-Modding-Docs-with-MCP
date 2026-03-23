# MeshNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: AbstractCellJitterJsonLoader

public class MeshNoiseJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<K, NoiseFunction>

Loads mesh noise configurations. Supports both square grid (`MeshNoise`) and hexagonal (`HexMeshNoise`) cell types with configurable thickness, density, and jitter.

## Key Methods

- `load()`
- `loadGridMeshNoise()`
- `loadHexMeshNoise()`
- `loadCellType()`
- `loadThickness()`
- `loadDensity()`
- `loadLinesX/Y/Z()`

## Related Types

- MeshNoiseJsonLoader.Constants -- thickness, lines defaults

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseFunction load()
  protected MeshNoise loadGridMeshNoise()
  protected HexMeshNoise loadHexMeshNoise()
  protected CellType loadCellType()
  protected double loadThickness()
  protected IIntCondition loadDensity()
  protected boolean loadLinesX()
  protected boolean loadLinesY()
  protected boolean loadLinesZ()
  protected boolean loadLinesFlag(String key, boolean defaulValue)
