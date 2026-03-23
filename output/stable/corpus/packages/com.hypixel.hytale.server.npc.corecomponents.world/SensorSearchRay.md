# SensorSearchRay

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorSearchRay extends SensorBase

Performs raycasting to find blocks or entities along a search ray pattern, with configurable spread and distance. Each instance has a corresponding `BuilderSensorSearchRay` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final int id
protected final float angle
protected final double range
protected final int blockSet
protected final float minRetestAngle
protected final double minRetestMoveSquared
protected final double throttleTime
protected final PositionProvider positionProvider
protected final Vector3d lastCheckedPosition
protected float lastCheckedYaw
protected short lastBlockRevision
protected double throttleTimeRemaining
