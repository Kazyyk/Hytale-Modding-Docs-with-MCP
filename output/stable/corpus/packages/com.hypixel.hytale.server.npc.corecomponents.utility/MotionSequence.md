# MotionSequence

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class MotionSequence

Generic base for sequencing motion steps with per-step lifecycle management.

Known subclasses: BodyMotionSequence, HeadMotionSequence

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void deactivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void setContext(IAnnotatedComponent parent, int index)
  public void restart()
  protected void doActivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  protected void activateNext(Ref<EntityStore> ref, int newIndex, Role role, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final boolean looped
protected final boolean restartOnActivate
protected final T[] steps
protected boolean finished
protected int index
protected T activeMotion
