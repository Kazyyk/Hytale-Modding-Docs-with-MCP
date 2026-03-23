# RemoveReason

Type: enum | Package: com.hypixel.hytale.component | Extends: java.lang.Enum

public enum RemoveReason

Indicates why an entity is being removed from a Store. Passed to `RefSystem.onEntityRemove()` and `HolderSystem.onEntityRemoved()` so systems can distinguish between permanent deletion and temporary unloading.

## Enum Constants

- REMOVE | The entity is being permanently removed (e.g., death, despawn, explicit deletion). The entity's references are invalidated and it will not return.
- UNLOAD | The entity is being temporarily unloaded (e.g., chunk unload). It may be restored later via `LOAD`. Systems should preserve state rather than clean up.

## Related Types

- AddReason -- the corresponding enum for entity addition
- Store -- `removeEntity()` accepts a `RemoveReason`
- CommandBuffer -- `removeEntity()` and `tryRemoveEntity()` accept a `RemoveReason`
