# PositionProbeWater

Type: class | Package: com.hypixel.hytale.server.npc.util | Extends: PositionProbeBase

public class PositionProbeWater extends PositionProbeBase

A position probe for NPCs operating in water. Extends `PositionProbeBase` with swim-depth-aware water detection.

## Key Methods

- public boolean probePosition( Ref<EntityStore> ref, Box boundingBox, Vector3d position, CollisionResult collisionResult, double swimDepth, ComponentAccessor<EntityStore> componentAccessor )
- public String toString()

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  public boolean probePosition(Ref<EntityStore> ref, Box boundingBox, Vector3d position, CollisionResult collisionResult, double swimDepth, ComponentAccessor<EntityStore> componentAccessor)
  private boolean blockTest(int code, BoxBlockIntersectionEvaluator boxBlockIntersection, CollisionConfig config)
  protected void reset()
  public String toString()

Fields:
private double ySwim
