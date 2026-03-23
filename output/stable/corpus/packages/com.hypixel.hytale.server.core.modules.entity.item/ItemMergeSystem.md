# ItemMergeSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: EntityTickingSystem<EntityStore>

public class ItemMergeSystem

ECS system that merges nearby identical item entities within a 2-block radius. Combines stacks up to the item's max stack size and refreshes despawn timers.

Also in this package: EnsureRequiredComponents, ItemComponent, ItemPhysicsComponent, ItemPhysicsSystem, ItemPrePhysicsSystem, ItemSystems, PickupItemComponent, PickupItemSystem, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
public static final float RADIUS
private final ComponentType<EntityStore,ItemComponent> itemComponentComponentType
private final ComponentType<EntityStore,Interactable> interactableComponentType
private final ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> itemSpatialComponent
private final Query<EntityStore> query
