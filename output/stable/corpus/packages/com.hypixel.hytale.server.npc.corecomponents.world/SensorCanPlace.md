# SensorCanPlace

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorCanPlace extends SensorBase

Checks whether a block can be placed at the current target position, validating block type and placement rules. Each instance has a corresponding `BuilderSensorCanPlace` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public void clearOnce()
  public InfoProvider getSensorInfo()

Fields:
protected static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
protected final SensorCanPlace.Direction direction
protected final SensorCanPlace.Offset offset
protected final double retryDelay
protected final boolean allowEmptyMaterials
protected final Vector3d transform
protected final CachedPositionProvider positionProvider
protected final Vector3d cachedPosition
protected boolean cachedResult
protected double delay
