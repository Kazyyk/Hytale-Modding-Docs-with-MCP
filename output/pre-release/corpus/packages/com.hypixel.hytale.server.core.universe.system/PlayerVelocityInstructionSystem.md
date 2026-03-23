# PlayerVelocityInstructionSystem

Type: class | Package: com.hypixel.hytale.server.core.universe.system | Extends: EntityTickingSystem<EntityStore>

public class PlayerVelocityInstructionSystem extends EntityTickingSystem<EntityStore>

ECS system extending `EntityTickingSystem<EntityStore>`. Processes entities each tick.

## Methods

- getDependencies() | Set<Dependency<EntityStore>> | public method.
- getQuery() | Query<EntityStore> | public method.

Also in this package: PlayerRefAddedSystem, WorldConfigSaveSystem

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()

Fields:
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
