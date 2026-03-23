# CoordinateRotatorJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class CoordinateRotatorJsonLoader<K extends SeedResource> extends JsonLoader<K, CoordinateRotator>

Loads coordinate rotator configurations. Creates `CoordinateRotator` (or `CoordinateOriginRotator` if origin is non-zero) from pitch/yaw angles in degrees (converted to radians). Returns `CoordinateRotator.NONE` when both angles are zero.

## Key Methods

- `load()`

## Related Types

- CoordinateRotatorJsonLoader.Constants -- KEY_PITCH, KEY_YAW, KEY_ORIGIN_X/Y/Z
