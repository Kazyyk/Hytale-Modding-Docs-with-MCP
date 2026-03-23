# ItemPhysicsSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: EntityTickingSystem<EntityStore>

public class ItemPhysicsSystem

ECS system applying physics to item entities. Resolves block collisions, cancels velocity on ground contact, and removes items that fall below Y=-32.

Also in this package: EnsureRequiredComponents, ItemComponent, ItemMergeSystem, ItemPhysicsComponent, ItemPrePhysicsSystem, ItemSystems, PickupItemComponent, PickupItemSystem, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final HytaleLogger LOGGER
private final ComponentType<EntityStore,ItemPhysicsComponent> itemPhysicsComponentType
private final ComponentType<EntityStore,BoundingBox> boundingBoxComponentType
private final ComponentType<EntityStore,Velocity> velocityComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Query<EntityStore> query
