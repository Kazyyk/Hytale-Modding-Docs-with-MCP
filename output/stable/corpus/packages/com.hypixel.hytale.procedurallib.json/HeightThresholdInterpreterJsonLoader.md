# HeightThresholdInterpreterJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class HeightThresholdInterpreterJsonLoader<K extends SeedResource> extends JsonLoader<K, IHeightThresholdInterpreter>

Loads height threshold interpreter configurations. Dispatches to either `NoiseHeightThresholdInterpreterJsonLoader` (when "Thresholds" key is present) or `BasicHeightThresholdInterpreterJsonLoader`.

## Key Methods

- `load()`
