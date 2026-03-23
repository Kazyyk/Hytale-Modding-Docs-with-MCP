# SensorBlockType

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: SensorBase

public class SensorBlockType extends SensorBase

Checks whether the NPC is standing on or inside a specific block type. Each instance has a corresponding `BuilderSensorBlockType` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, HeadMotionObserve, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorCanPlace (and 11 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public void done()
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void setContext(IAnnotatedComponent parent, int index)

Fields:
protected final Sensor sensor
protected final int blockSet
