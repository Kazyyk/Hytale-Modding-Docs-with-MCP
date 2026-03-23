# ActionTimeout

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class ActionTimeout

Action that wraps a child action with a timeout, executing an alternative action if the timeout expires.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

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
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)

Fields:
protected final boolean delayAfter
protected final Action action
