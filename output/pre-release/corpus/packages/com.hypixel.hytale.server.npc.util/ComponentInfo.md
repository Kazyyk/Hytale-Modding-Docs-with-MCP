# ComponentInfo

Type: class | Package: com.hypixel.hytale.server.npc.util

public class ComponentInfo

A diagnostic helper class that records component metadata (name, index, nesting depth) and field descriptions for NPC debugging output.

## Key Methods

- public void addField(String field)
- public String toString()
- public String getName()
- public int getIndex()
- public List<String> getFields()

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  public void addField(String field)
  public String toString()
  public String getName()
  public int getIndex()
  public List<String> getFields()

Fields:
private final String name
private final int index
private final int nestingDepth
private final List<String> fields
