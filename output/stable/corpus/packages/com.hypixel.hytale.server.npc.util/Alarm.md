# Alarm

Type: class | Package: com.hypixel.hytale.server.npc.util | Extends: PersistentParameter

public class Alarm extends PersistentParameter<Instant>

A persistent NPC parameter that stores an `Instant` timestamp. Used to set time-based alarms that can be checked against the current time to determine if they have passed.

## Key Methods

- public static final BuilderCodec<Alarm> CODEC = BuilderCodec.builder(Alarm.class, Alarm::new)
- public boolean isSet()
- public boolean hasPassed(Instant instant)

Also in this package: AimingData, AimingHelper, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 3 more)

Complete API:
  protected void set0(Instant value)
  public boolean isSet()
  public boolean hasPassed(Instant instant)

Fields:
public static final BuilderCodec<Alarm> CODEC
protected Instant alarmInstant
