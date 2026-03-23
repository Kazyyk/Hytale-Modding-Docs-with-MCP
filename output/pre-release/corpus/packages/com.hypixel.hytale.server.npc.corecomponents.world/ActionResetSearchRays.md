# ActionResetSearchRays

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionResetSearchRays extends ActionBase

Resets the NPC's search ray state, clearing cached search results and targets. Each instance has a corresponding `BuilderActionResetSearchRays` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int[] searchRayIds
