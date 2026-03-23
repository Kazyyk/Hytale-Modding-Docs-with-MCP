# PlayerMovementManagerSystems.PostAssignmentSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerMovementManagerSystems.PostAssignmentSystem extends RefSystem<EntityStore>

An ECS ref system that resets the `MovementManager` to its defaults and sends an update after a player entity with both `MovementManager` and `PlayerRef` is added to the store. Calls `MovementManager.resetDefaultsAndUpdate()`.

## Related Types

- PlayerMovementManagerSystems -- parent container class
- PlayerMovementManagerSystems.AssignmentSystem -- ensures the component exists first
