# ActionSequence

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class ActionSequence

Action that executes a list of child actions in sequence.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public void clearOnce()
  public void setOnce()
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void setContext(IAnnotatedComponent parent, int index)

Fields:
protected final ActionList actions
