# SensorEvent

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorEvent extends SensorBase

Listens for named events from the NPC's blackboard event view, matching by event name. Each instance has a corresponding `BuilderSensorEvent` class for JSON deserialization.

Known subclasses: SensorBlockChange, SensorEntityEvent

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected boolean setTarget(MarkedEntitySupport support, Ref<EntityStore> target, ComponentAccessor<EntityStore> componentAccessor)
  protected abstract Ref<EntityStore> getPlayerTarget(Ref<EntityStore> var1, Store<EntityStore> var2)
  protected abstract Ref<EntityStore> getNpcTarget(Ref<EntityStore> var1, Store<EntityStore> var2)

Fields:
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final double range
protected final SensorEvent.EventSearchType searchType
protected final int lockOnTargetSlot
protected int playerEventMessageSlot
protected int npcEventMessageSlot
protected final EntityPositionProvider positionProvider
