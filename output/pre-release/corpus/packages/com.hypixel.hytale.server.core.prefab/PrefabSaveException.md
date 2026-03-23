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

Also in this package: AssetPackPrefabPath, PrefabCopyableComponent, PrefabEntry, PrefabLoadException, PrefabRotation, PrefabStore, PrefabWeights, RotationExecutor, RotationExecutor_0, RotationExecutor_180, RotationExecutor_270, RotationExecutor_90, Type, Type, WeightMapValidator

Complete API:
  public PrefabSaveException.Type getType()

Fields:
private PrefabSaveException.Type type
