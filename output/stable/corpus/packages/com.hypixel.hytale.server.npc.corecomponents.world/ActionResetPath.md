# ActionResetPath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionResetPath extends ActionBase

Clears the NPC's current path via `PathManager`, stopping path-following behavior. Each instance has a corresponding `BuilderActionResetPath` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
