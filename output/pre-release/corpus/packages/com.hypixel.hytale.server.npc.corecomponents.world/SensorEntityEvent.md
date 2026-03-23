# SensorEntityEvent

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorEntityEvent extends SensorBase

Listens for entity events (damage, interactions) from the NPC's blackboard event view and provides the event source position. Each instance has a corresponding `BuilderSensorEntityEvent` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  protected Ref<EntityStore> getPlayerTarget(Ref<EntityStore> parent, Store<EntityStore> store)
  protected Ref<EntityStore> getNpcTarget(Ref<EntityStore> parent, Store<EntityStore> store)

Fields:
private final boolean flockOnly
