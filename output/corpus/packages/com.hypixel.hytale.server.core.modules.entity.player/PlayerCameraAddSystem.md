# PlayerCameraAddSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public class PlayerCameraAddSystem extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has a `CameraManager` component. Queries entities that have a `PlayerRef` but lack a `CameraManager`, and adds one on entity creation.

## Related Types

- PlayerSystems -- other player initialization systems
