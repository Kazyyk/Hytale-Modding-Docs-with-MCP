# DebugSupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class DebugSupport

Manages debug visualization state for NPC roles. Tracks debug flags (steering, avoidance, sensor ranges, path visualization), records sensor range data, entity check data, and path waypoint data for visual debug rendering.

## Constructors

- DebugSupport(NPCEntity parent, @Nonnull BuilderRole builder)

## Methods

- public RoleDebugDisplay getDebugDisplay()
- public boolean isTraceSuccess()
- public boolean isTraceFail()
- public boolean isTraceSensorFails()
- public void setLastFailingSensor(Sensor sensor)
- public Sensor getLastFailingSensor()
- public boolean isDebugRoleSteering()
- public boolean isDebugMotionSteering()
- public void setDisplayCustomString(@Nullable String displayCustomString)
- public String pollDisplayCustomString()
- public void setDisplayPathfinderString(@Nullable String displayPathfinderString)
- public String pollDisplayPathfinderString()
- public EnumSet<RoleDebugFlags> getDebugFlags()
- public void setDebugFlags(EnumSet<RoleDebugFlags> debugFlags)
- public boolean isDebugFlagSet(RoleDebugFlags flag)
- public boolean isAnyDebugFlagSet(@Nonnull EnumSet<RoleDebugFlags> flags)
- public void registerDebugFlagsListener(DebugFlagsChangeListener listener)
- public void removeDebugFlagsListener(DebugFlagsChangeListener listener)
- public void notifyDebugFlagsListeners(EnumSet<RoleDebugFlags> flags)
- public boolean isVisSensorRanges()
- public void beginSensorVisualization()
- public int recordSensorRange(double range, double minRange, double viewAngle)
- public void recordEntityCheck(@Nonnull Ref<EntityStore> entityRef, int sensorColorIndex, boolean matched)
- public List<SensorVisData> getSensorVisData()
- public Map<Ref<EntityStore>, List<EntityVisData>> getEntityVisData()
- public boolean hasSensorVisData()
- public void clearSensorVisData()
- public boolean isVisPath()
- public void clearPathVisualization()
- public void recordPathWaypoint(@Nonnull Vector3d position, boolean isCurrentTarget, boolean isEndNode)
- public void recordPathWaypoint(@Nonnull Vector3d position, boolean isCurrentTarget, boolean isEndNode, boolean isSeekTarget)
- public List<PathWaypointVisData> getPathVisData()
- public boolean hasPathVisData()

## Inner Types

- DebugFlagsChangeListener: Listener notified when debug flags change
- EntityVisData: Stores sensor color index and match result for an entity check
- PathWaypointVisData: Waypoint visualization data along an NPC path
- SensorVisData: Stores range, min range, color index, and view angle for a sensor

Also in this package: CombatSupport, DebugFlagsChangeListener, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PathWaypointVisData, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

Complete API:
  public RoleDebugDisplay getDebugDisplay()
  public boolean isTraceSuccess()
  public boolean isTraceFail()
  public boolean isTraceSensorFails()
  public void setLastFailingSensor(Sensor sensor)
  public Sensor getLastFailingSensor()
  public boolean isDebugRoleSteering()
  public boolean isDebugMotionSteering()
  public void setDisplayCustomString(String displayCustomString)
  public String pollDisplayCustomString()
  public void setDisplayPathfinderString(String displayPathfinderString)
  public String pollDisplayPathfinderString()
  public EnumSet<RoleDebugFlags> getDebugFlags()
  public void setDebugFlags(EnumSet<RoleDebugFlags> debugFlags)
  public boolean isDebugFlagSet(RoleDebugFlags flag)
  public boolean isAnyDebugFlagSet(EnumSet<RoleDebugFlags> flags)
  protected void onDebugFlagsChanged()
  public void registerDebugFlagsListener(DebugSupport.DebugFlagsChangeListener listener)
  public void removeDebugFlagsListener(DebugSupport.DebugFlagsChangeListener listener)
  public void notifyDebugFlagsListeners(EnumSet<RoleDebugFlags> flags)
  public boolean isVisSensorRanges()
  public void beginSensorVisualization()
  public int recordSensorRange(double range, double minRange, double viewAngle)
  public void recordEntityCheck(Ref<EntityStore> entityRef, int sensorColorIndex, boolean matched)
  public List<DebugSupport.SensorVisData> getSensorVisData()
  public Map<Ref<EntityStore>,List<DebugSupport.EntityVisData>> getEntityVisData()
  public boolean hasSensorVisData()
  public void clearSensorVisData()
  public boolean isVisPath()
  public void clearPathVisualization()
  public void recordPathWaypoint(Vector3d position, boolean isCurrentTarget, boolean isEndNode)
  public void recordPathWaypoint(Vector3d position, boolean isCurrentTarget, boolean isEndNode, boolean isSeekTarget)
  public List<DebugSupport.PathWaypointVisData> getPathVisData()
  public boolean hasPathVisData()

Fields:
protected final NPCEntity parent
protected RoleDebugDisplay debugDisplay
protected boolean debugRoleSteering
protected boolean debugMotionSteering
protected EnumSet<RoleDebugFlags> debugFlags
protected String displayCustomString
protected String displayPathfinderString
protected boolean traceSuccess
protected boolean traceFail
protected boolean traceSensorFails
protected Sensor lastFailingSensor
protected List<DebugSupport.DebugFlagsChangeListener> debugFlagsChangeListeners
protected boolean visSensorRanges
protected int currentSensorColorIndex
protected List<DebugSupport.SensorVisData> sensorVisDataList
protected Map<Ref<EntityStore>,List<DebugSupport.EntityVisData>> entityVisDataMap
protected boolean visPath
protected List<DebugSupport.PathWaypointVisData> pathVisDataList
