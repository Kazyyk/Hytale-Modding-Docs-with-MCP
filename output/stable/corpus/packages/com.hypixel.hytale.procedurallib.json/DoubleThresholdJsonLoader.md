# DoubleThresholdJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class DoubleThresholdJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleThreshold>

Loads double threshold configurations. Produces `DefaultDoubleThresholdCondition` (null input), `DoubleThreshold.Single` (primitive or [low, high]), or `DoubleThreshold.Multiple` (array of [low, high] pairs).

## Key Methods

- `load()`

## Related Types

- DoubleThresholdJsonLoader.Constants -- error messages
