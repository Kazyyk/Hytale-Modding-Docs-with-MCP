# SensorTime

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorTime extends SensorBase

Checks whether the current game time falls within a configured range, using the world's `WorldTimeResource`. Each instance has a corresponding `BuilderSensorTime` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public InfoProvider getSensorInfo()
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)

Fields:
protected final double minTime
protected final double maxTime
protected final boolean checkDay
protected final boolean checkYear
protected final boolean scaleDayTimeRange
