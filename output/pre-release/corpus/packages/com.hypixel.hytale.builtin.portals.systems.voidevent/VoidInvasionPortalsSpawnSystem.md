# VoidInvasionPortalsSpawnSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.voidevent | Extends: DelayedEntitySystem<EntityStore>

public class VoidInvasionPortalsSpawnSystem extends DelayedEntitySystem<EntityStore>

Delayed entity system (2.0s interval) that spawns invasion portals during void events. Searches for valid positions near random players using spatial queries with clustering constraints. Limited to 24 portals.

## Fields

- private static final | int | MAX_PORTALS | Maximum invasion portals (24)

## Methods

- public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public Query<EntityStore> getQuery()

Also in this package: Instantiate, StartVoidEventInFragmentSystem, VoidEventRefSystem, VoidEventStagesSystem, VoidInvasionData, VoidSpawnerSystems

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static CompletableFuture<Vector3d> findPortalSpawnPosition(World world, VoidEvent voidEvent, CommandBuffer<EntityStore> commandBuffer)
  private static Transform findRandomPlayerTransform(World world, CommandBuffer<EntityStore> commandBuffer)
  private static SpatialHashGrid<Ref<EntityStore>> cleanupAndGetSpawners(VoidEvent voidEvent)
  public Query<EntityStore> getQuery()

Fields:
private static final HytaleLogger LOGGER
private static final int MAX_PORTALS
private final ResourceType<EntityStore,VoidInvasionPortalsSpawnSystem.VoidInvasionData> voidInvasionDataResourceType
