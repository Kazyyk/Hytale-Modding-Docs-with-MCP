# KnockbackPredictionSystems.SimulateKnockback

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

@Deprecated
public static class KnockbackPredictionSystems.SimulateKnockback extends EntityTickingSystem<EntityStore>

**Deprecated.** An ECS ticking system that runs the server-side knockback physics simulation. Runs AFTER `PlayerSystems.ProcessPlayerInput`. Simulates gravity, drag, friction, jumping, and collision detection at a fixed 60 Hz time step to predict knockback trajectory. Handles velocity requests (add/set), wish movement conversion, and blends the client position with the simulation position near the end of the knockback window.

Removes the `KnockbackSimulation` component when the simulation timer expires or the entity is dead.

Queries entities with `Player`, `TransformComponent`, `KnockbackSimulation`, `BoundingBox`, `MovementStatesComponent`, `MovementManager`, and `PlayerRef`.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- simulation state managed by this system

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private float convertWishMovement(KnockbackSimulation simulation, MovementStates movementStates, MovementSettings movementSettings)
  private float computeMoveForce(KnockbackSimulation simulation, MovementStates movementStates, MovementSettings movementSettings)
  private static float convertToNewRange(float value, float oldMinRange, float oldMaxRange, float newMinRange, float newMaxRange)
  public void applyMovementOffset(World world, Box hitBox, KnockbackSimulation simulation, MovementStates movementStates, Vector3d movementOffset)
  private void doMoveCycle(World world, Box hitBox, KnockbackSimulation simulation, MovementStates movementStates, Vector3d offset)
  private boolean checkCollision(KnockbackSimulation simulation, World world, Box hitBox, Vector3d position, Vector3d moveOffset, KnockbackPredictionSystems.CollisionAxis axis, CollisionResult result)

Fields:
private static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
private static final Set<Dependency<EntityStore>> DEPENDENCIES
