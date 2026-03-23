# PrefabLoadException

Type: class | Package: com.hypixel.hytale.server.core.prefab | Extends: RuntimeException

public class PrefabLoadException extends RuntimeException

Runtime exception thrown when a prefab fails to load. Carries a `Type` enum indicating whether the failure was a general `ERROR` or `NOT_FOUND`.

## Fields

- private PrefabLoadException.Type type

## Methods

- public PrefabLoadException.Type getType()

## Inner Types

### Type


public static enum Type

- ERROR
- NOT_FOUND

Also in this package: AssetPackPrefabPath, PrefabCopyableComponent, PrefabEntry, PrefabRotation, PrefabSaveException, PrefabStore, PrefabWeights, RotationExecutor, RotationExecutor_0, RotationExecutor_180, RotationExecutor_270, RotationExecutor_90, Type, Type, WeightMapValidator

Complete API:
  public PrefabLoadException.Type getType()

Fields:
private PrefabLoadException.Type type
