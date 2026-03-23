# PickupItemSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: EntityTickingSystem<EntityStore>

public class PickupItemSystem

ECS system that lerps pickup item entities toward their target position over their lifetime, removing them on completion or invalid target.

Also in this package: EnsureRequiredComponents, ItemComponent, ItemMergeSystem, ItemPhysicsComponent, ItemPhysicsSystem, ItemPrePhysicsSystem, ItemSystems, PickupItemComponent, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static boolean updateMovement(PickupItemComponent pickupItemComponent, Vector3d current, Vector3d target, float dt)
  public Query<EntityStore> getQuery()

Fields:
private static final float EYE_HEIGHT_SCALE
private final ComponentType<EntityStore,PickupItemComponent> pickupItemComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Query<EntityStore> query
