# SensorAdjustPosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class SensorAdjustPosition

Sensor that adjusts the NPC's target position based on configurable offsets and conditions.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

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
protected final Vector3d offset
protected final PositionProvider positionProvider
