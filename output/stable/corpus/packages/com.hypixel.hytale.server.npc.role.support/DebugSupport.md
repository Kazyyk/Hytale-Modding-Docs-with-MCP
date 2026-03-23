# DebugSupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class DebugSupport

Manages debug flags, trace logging toggles, and sensor visualization data for an NPC role. Notifies registered `DebugFlagsChangeListener` instances when flags change. Maintains optional lists of `SensorVisData` (range/color pairs) and `EntityVisData` (per-entity match results) for debug rendering.

## Constructors

- public DebugSupport(NPCEntity parent, @Nonnull BuilderRole builder)

## Methods

- @Nullable public RoleDebugDisplay getDebugDisplay()
- public boolean isTraceSuccess()
- public boolean isTraceFail()
- public boolean isTraceSensorFails()
- public void setLastFailingSensor(Sensor sensor)
- public Sensor getLastFailingSensor()
- public boolean isDebugRoleSteering()
- public boolean isDebugMotionSteering()
- public void setDisplayCustomString(String displayCustomString)
- @Nullable public String pollDisplayCustomString()
- public void setDisplayPathfinderString(String displayPathfinderString)
- @Nullable public String pollDisplayPathfinderString()
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
- @Nullable public List<SensorVisData> getSensorVisData()
- @Nullable public Map<Ref<EntityStore>, List<EntityVisData>> getEntityVisData()
- public boolean hasSensorVisData()
- public void clearSensorVisData()

## Inner Types

### DebugFlagsChangeListener (interface)


public interface DebugFlagsChangeListener {
    void onDebugFlagsChanged(EnumSet<RoleDebugFlags> flags);
}

### EntityVisData (record)


public record EntityVisData(int sensorColorIndex, boolean matched)

### SensorVisData (record)


public record SensorVisData(double range, double minRange, int colorIndex, double viewAngle)

Also in this package: CombatSupport, DebugFlagsChangeListener, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

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
