# IEntityByPriorityFilter

Type: interface | Package: com.hypixel.hytale.server.npc.util | Extends: TriPredicate

public interface IEntityByPriorityFilter extends TriPredicate<Ref<EntityStore>, Ref<EntityStore>, ComponentAccessor<EntityStore>>

Interface extending `TriPredicate` for filtering entities by priority during NPC target selection. Provides initialization from a `Role`, highest-priority target retrieval, and cleanup.

## Methods

- void init(Role var1)
- Ref<EntityStore> getHighestPriorityTarget()
- void cleanup()

Known implementors: AttitudePrioritiser, DefaultPrioritiser

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 3 more)

Complete API:
  void init(Role var1)
  Ref<EntityStore> getHighestPriorityTarget()
  void cleanup()
