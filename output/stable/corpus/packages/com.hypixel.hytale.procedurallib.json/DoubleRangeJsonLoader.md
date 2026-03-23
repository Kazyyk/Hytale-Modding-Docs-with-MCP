# DoubleRangeJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class DoubleRangeJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleRange>

Loads double range configurations. Supports constant (single value), normal (min/max), array (1 or 2 elements), and threshold-based (Thresholds/Values arrays) range types. Applies an optional transform function.

## Key Methods

- `load()`
- `loadThreshold()`

## Related Types

- DoubleRangeJsonLoader.Constants -- KEY_MIN, KEY_MAX, KEY_THRESHOLDS, KEY_VALUES
- DoubleRangeJsonLoader.DoubleToDoubleFunction -- functional interface for value transformation
