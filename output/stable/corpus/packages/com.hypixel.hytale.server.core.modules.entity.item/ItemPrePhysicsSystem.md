# ItemPrePhysicsSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: EntityTickingSystem<EntityStore>

public class ItemPrePhysicsSystem

ECS system running before main physics. Moves items out of solid blocks by finding nearest open space, and applies gravity with terminal velocity.

Also in this package: EnsureRequiredComponents, ItemComponent, ItemMergeSystem, ItemPhysicsComponent, ItemPhysicsSystem, ItemSystems, PickupItemComponent, PickupItemSystem, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public static void moveOutOfBlock(WorldChunk chunk, Vector3d position, Velocity velocityComponent, Box boundingBox)
  public static void applyGravity(float dt, Box boundingBox, PhysicsValues values, Vector3d position, Velocity velocity)

Fields:
public static final NearestBlockUtil.IterationElement[] SEARCH_ELEMENTS
public static final double VERTICAL_CLIMB_SCALE
private final ComponentType<EntityStore,BoundingBox> boundingBoxComponentType
private final ComponentType<EntityStore,Velocity> velocityComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,PhysicsValues> physicsValuesComponentType
private final Query<EntityStore> query
