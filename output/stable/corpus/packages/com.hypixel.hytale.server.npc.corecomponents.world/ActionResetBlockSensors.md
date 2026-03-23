# ActionResetBlockSensors

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionResetBlockSensors extends ActionBase

Resets cached block targets for specified block sets on the NPC's `WorldSupport`, invalidating block reservation state. Each instance has a corresponding `BuilderActionResetBlockSensors` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int[] blockSets
