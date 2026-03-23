# BasicHeightThresholdInterpreterJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class BasicHeightThresholdInterpreterJsonLoader<K extends SeedResource> extends JsonLoader<K, BasicHeightThresholdInterpreter>

Loads basic height threshold interpreter configurations. Creates a `BasicHeightThresholdInterpreter` from parallel arrays of integer positions and float threshold values.

## Key Methods

- `load()`
- `loadPositions()`
- `loadValues()`

## Related Types

- BasicHeightThresholdInterpreterJsonLoader.Constants -- KEY_POSITIONS, KEY_VALUES

Also in this package: AbstractCellJitterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public BasicHeightThresholdInterpreter load()
  protected int[] loadPositions()
  protected float[] loadValues()

Fields:
protected final int length
