# SensorReadPosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorReadPosition extends SensorBase

Reads a previously stored position from a named slot in `WorldSupport` and provides it as sensor info. Each instance has a corresponding `BuilderSensorReadPosition` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final int slot
protected final boolean useMarkedTarget
protected final double minRange
protected final double range
protected final PositionProvider positionProvider
