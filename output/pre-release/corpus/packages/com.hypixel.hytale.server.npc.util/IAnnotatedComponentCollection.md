# IAnnotatedComponentCollection

Type: interface | Package: com.hypixel.hytale.server.npc.util | Extends: IAnnotatedComponent

public interface IAnnotatedComponentCollection extends IAnnotatedComponent

Interface extending `IAnnotatedComponent` for components that contain multiple child components, supporting indexed access.

## Methods

- int componentCount()
- IAnnotatedComponent getComponent(int var1)

Known implementors: ActionSequence, ActionTimeout, BodyMotionSequence, EntityFilterMany, EntityFilterNot, HeadMotionSequence, Instruction, MotionSequence, Role, SensorAdjustPosition, SensorBlockType, SensorMany, SensorNot, SensorValueProviderWrapper, SensorWithEntityFilters

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  int componentCount()
  IAnnotatedComponent getComponent(int var1)
