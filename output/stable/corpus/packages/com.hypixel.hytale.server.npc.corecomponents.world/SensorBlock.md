# SensorBlock

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorBlock extends SensorBase

Detects blocks from a configured block set within range. Caches found blocks with chunk revision tracking and optional block reservation via `ResourceView`. Each instance has a corresponding `BuilderSensorBlock` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final double range
protected final double yRange
protected final int blockSet
protected final boolean pickRandom
protected final boolean reserveBlock
protected final PositionProvider positionProvider
