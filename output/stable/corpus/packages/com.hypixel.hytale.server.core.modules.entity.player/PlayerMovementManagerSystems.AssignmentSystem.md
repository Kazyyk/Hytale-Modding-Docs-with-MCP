# PlayerMovementManagerSystems.AssignmentSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerMovementManagerSystems.AssignmentSystem extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has a `MovementManager` component. Queries entities with `PlayerRef` but without `MovementManager`, and adds the component on entity creation.

## Related Types

- PlayerMovementManagerSystems -- parent container class
- PlayerMovementManagerSystems.PostAssignmentSystem -- resets defaults after assignment
