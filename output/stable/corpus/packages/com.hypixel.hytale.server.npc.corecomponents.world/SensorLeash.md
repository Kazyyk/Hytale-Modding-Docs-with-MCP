# SensorLeash

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorLeash extends SensorBase

Checks whether the NPC has strayed beyond a configured distance from its leash position, providing the leash position as sensor info. Each instance has a corresponding `BuilderSensorLeash` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final double range
protected final double rangeSq
protected final PositionProvider positionProvider
