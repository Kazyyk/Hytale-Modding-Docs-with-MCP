# SpawnMarkerSuppressionSystem

Type: class | Package: com.hypixel.hytale.server.spawning.suppression.system | Extends: RefSystem<EntityStore>

public class SpawnMarkerSuppressionSystem extends RefSystem<EntityStore>

ECS system that suppresses spawn markers when they are within range of an active spawn suppressor entity. Checks spatial distance on entity add/load.

Also in this package: ChunkAdded, ChunkSuppressionSystems, EnsureNetworkSendable, Load, SpawnSuppressionSystems, Suppressor, Ticking

Complete API:
  public void onEntityAdded(Ref<EntityStore> reference, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> reference, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,SpawnMarkerEntity> spawnMarkerEntityComponentType
private final ResourceType<EntityStore,SpawnSuppressionController> spawnSuppressionControllerResourceType
private final ComponentType<EntityStore,UUIDComponent> uuidComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final Query<EntityStore> query
