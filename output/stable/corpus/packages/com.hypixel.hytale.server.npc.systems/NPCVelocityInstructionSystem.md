# NPCVelocityInstructionSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: EntityTickingSystem<EntityStore>

public class NPCVelocityInstructionSystem extends EntityTickingSystem<EntityStore>

Processes velocity instructions from the physics system for NPC entities. Iterates over `Velocity.Instruction` entries and delegates to the role's motion controller:

- **Set** instructions: calls `role.processSetVelocityInstruction(velocity, config)`
- **Add** instructions: calls `role.processAddVelocityInstruction(velocity, config)`

After processing, all instructions are cleared from the velocity component. When `DebugUtils.DISPLAY_FORCES` is enabled, force debug visualizations are rendered.

## Execution Order

- GenericVelocityInstructionSystem | BEFORE
- EntityModule.getVelocityModifyingSystemType() | AFTER (via `SystemTypeDependency`)

## Query

Matches entities with `NPCEntity` and `Velocity` components.

## Related Types

- ComputeVelocitySystem -- computes velocity from position deltas
- SteeringSystem -- applies steering forces

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()

Fields:
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
