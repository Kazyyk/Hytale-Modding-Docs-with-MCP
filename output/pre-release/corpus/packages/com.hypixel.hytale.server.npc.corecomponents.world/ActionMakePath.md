# ActionMakePath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionMakePath extends ActionBase

Builds a transient path from a `TransientPathDefinition` and assigns it to the NPC's `PathManager`. Executes once per activation. Each instance has a corresponding `BuilderActionMakePath` class for JSON deserialization.

Also in this package: ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final TransientPathDefinition pathDefinition
protected boolean built
