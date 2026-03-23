# ActionStorePosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionStorePosition extends ActionBase

Stores a position from sensor info into a named slot in the NPC's `WorldSupport` for later retrieval. Each instance has a corresponding `BuilderActionStorePosition` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int slot
