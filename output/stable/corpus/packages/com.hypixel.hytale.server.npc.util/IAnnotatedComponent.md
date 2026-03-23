# IAnnotatedComponent

Type: interface | Package: com.hypixel.hytale.server.npc.util

public interface IAnnotatedComponent

Interface for NPC components that can provide debug annotation and hierarchical breadcrumb paths. Used by the NPC debugging infrastructure.

## Methods

- void getInfo(Role var1, ComponentInfo var2)
- void setContext(IAnnotatedComponent var1, int var2)
- IAnnotatedComponent getParent()
- int getIndex()
- default String getLabel()
- default void getBreadCrumbs(@Nonnull StringBuilder sb)
- default String getBreadCrumbs()

Known implementors: Action, AnnotatedComponentBase, IAnnotatedComponentCollection, IEntityFilter, Motion, Sensor

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 3 more)

Complete API:
  void getInfo(Role var1, ComponentInfo var2)
  void setContext(IAnnotatedComponent var1, int var2)
  IAnnotatedComponent getParent()
  int getIndex()
  default String getLabel()
  default void getBreadCrumbs(StringBuilder sb)
  default String getBreadCrumbs()
