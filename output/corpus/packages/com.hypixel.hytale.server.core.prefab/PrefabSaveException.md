# PrefabSaveException

Type: class | Package: com.hypixel.hytale.server.core.prefab | Extends: RuntimeException

public class PrefabSaveException extends RuntimeException

Runtime exception thrown when a prefab fails to save. Carries a `Type` enum indicating whether the failure was a general `ERROR` or `ALREADY_EXISTS` (for non-overwrite saves).

## Fields

- private PrefabSaveException.Type type

## Methods

- public PrefabSaveException.Type getType()

## Inner Types

### Type


public static enum Type

- ERROR
- ALREADY_EXISTS
