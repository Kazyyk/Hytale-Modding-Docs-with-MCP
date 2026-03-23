# LocalSpawnForceTriggerSystem

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: EntityTickingSystem<EntityStore>

public class LocalSpawnForceTriggerSystem extends EntityTickingSystem<EntityStore>

System that handles forced re-triggering of local spawn controllers with a randomized delay (0-5 seconds). Activated when spawn beacons are removed or other events require immediate re-evaluation.

## Methods

- public Query<EntityStore> getQuery()
- public void tick(float dt, int systemIndex, Store<EntityStore> store)
- public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Also in this package: LocalSpawnBeacon, LocalSpawnBeaconSystem, LocalSpawnController, LocalSpawnControllerSystem, LocalSpawnSetupSystem, LocalSpawnState

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final double[] RERUN_TIME_RANGE
private final Archetype<EntityStore> archetype
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final ComponentType<EntityStore,LocalSpawnController> spawnControllerComponentType
private final ResourceType<EntityStore,LocalSpawnState> localSpawnStateResourceType
