# SensorBlockChange

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorBlockChange extends SensorBase

Detects when the block at a cached position has changed since it was last observed, using chunk section change counters. Each instance has a corresponding `BuilderSensorBlockChange` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  protected Ref<EntityStore> getPlayerTarget(Ref<EntityStore> parent, Store<EntityStore> store)
  protected Ref<EntityStore> getNpcTarget(Ref<EntityStore> parent, Store<EntityStore> store)
