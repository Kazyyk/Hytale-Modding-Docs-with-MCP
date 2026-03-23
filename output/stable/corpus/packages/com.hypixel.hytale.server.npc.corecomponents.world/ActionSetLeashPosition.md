# ActionSetLeashPosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionSetLeashPosition extends ActionBase

Stores a leash anchor position from sensor info into the NPC's blackboard for boundary enforcement. Each instance has a corresponding `BuilderActionSetLeashPosition` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected static void setLeashPosition(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final boolean toTarget
protected final boolean toCurrent
