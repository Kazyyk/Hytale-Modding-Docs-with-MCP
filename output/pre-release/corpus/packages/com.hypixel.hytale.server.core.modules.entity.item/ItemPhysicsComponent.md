# ItemPhysicsComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: Component<EntityStore>

public class ItemPhysicsComponent

Deprecated component storing per-frame physics state (scaled velocity, collision result) for item entities.

Also in this package: EnsureRequiredComponents, ItemComponent, ItemMergeSystem, ItemPhysicsSystem, ItemPrePhysicsSystem, ItemSystems, PickupItemComponent, PickupItemSystem, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public static ComponentType<EntityStore,ItemPhysicsComponent> getComponentType()
  public Component<EntityStore> clone()

Fields:
public Vector3d scaledVelocity
public CollisionResult collisionResult
