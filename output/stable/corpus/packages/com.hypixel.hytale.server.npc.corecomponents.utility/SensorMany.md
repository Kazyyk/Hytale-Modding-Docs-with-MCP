# SensorMany

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class SensorMany

Abstract base for composite sensors operating over a list of child sensors.

Known subclasses: SensorAnd, SensorOr

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public void done()
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public InfoProvider getSensorInfo()
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void setContext(IAnnotatedComponent parent, int index)
  protected abstract WrappedInfoProvider createInfoProvider()

Fields:
protected final Sensor[] sensors
protected final int autoUnlockTargetSlot
protected final WrappedInfoProvider infoProvider
