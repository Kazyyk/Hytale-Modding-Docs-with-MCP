# PrefabCopyException

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Extends: java.lang.Exception

public class PrefabCopyException extends Exception

Thrown when a prefab copy operation fails. Used within the builder tools system to signal errors during clipboard copy operations involving prefabs.

## Constructor


public PrefabCopyException(String message)

Creates a new `PrefabCopyException` with the specified error message. Delegates to `Exception(String)`.

## Related Types

- BuilderToolsPlugin -- the plugin where prefab copy operations originate
- BuilderToolsPlugin.BuilderState -- performs copy/cut operations that may throw this exception
