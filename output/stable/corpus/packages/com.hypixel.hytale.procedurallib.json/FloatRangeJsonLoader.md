# FloatRangeJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class FloatRangeJsonLoader<K extends SeedResource> extends JsonLoader<K, IFloatRange>

Loads float range configurations. Mirrors `DoubleRangeJsonLoader` but uses `float` precision. Supports constant, normal (min/max), and array range types with an optional transform function.

## Key Methods

- `load()`

## Related Types

- FloatRangeJsonLoader.Constants -- KEY_MIN, KEY_MAX
- FloatRangeJsonLoader.FloatToFloatFunction -- functional interface for value transformation
