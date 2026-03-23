# ActionTriggerSpawners

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: ActionBase

public class ActionTriggerSpawners extends ActionBase

Triggers manual spawn markers within a radius of the NPC's position using the spawn marker spatial index. Each instance has a corresponding `BuilderActionTriggerSpawners` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public void registerWithSupport(Role role)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected Ref<EntityStore> filterMarker(Ref<EntityStore> targetRef, Store<EntityStore> store)

Fields:
protected static final ComponentType<EntityStore,SpawnMarkerEntity> SPAWN_MARKER_ENTITY_COMPONENT_TYPE
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final String spawner
protected final double range
protected final double rangeSquared
protected final int count
protected final List<Ref<EntityStore>> triggerList
protected Ref<EntityStore> parentRef
