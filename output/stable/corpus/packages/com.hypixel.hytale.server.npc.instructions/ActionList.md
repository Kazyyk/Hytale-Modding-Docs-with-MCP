# ActionList

Type: class | Package: com.hypixel.hytale.server.npc.instructions

public class ActionList

## Fields

- public static final ActionList EMPTY_ACTION_LIST
- protected final Action[] actions
- protected boolean blocking
- protected boolean atomic
- protected int actionIndex

## Methods

- public void setBlocking(boolean blocking)
- public void setAtomic(boolean atomic)
- public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean hasCompletedRun()
- public void setContext(IAnnotatedComponent parent)
- public void registerWithSupport(Role role)
- public void motionControllerChanged( @Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, MotionController motionController, @Nullable ComponentAccessor<EntityStore> componentAccessor )
- public void loaded(Role role)
- public void spawned(Role role)
- public void unloaded(Role role)
- public void removed(Role role)
- public void teleported(Role role, World from, World to)
- public void clearOnce()
- public void onEndMotion()
- public void setOnce()
- public int actionCount()
- public IAnnotatedComponent getComponent(int index)

Also in this package: Action, BodyMotion, HeadMotion, Instruction, InstructionHolder, InstructionRandomized, Motion, NullSensor, RoleStateChange, Sensor

Complete API:
  public void setBlocking(boolean blocking)
  public void setAtomic(boolean atomic)
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean hasCompletedRun()
  public void setContext(IAnnotatedComponent parent)
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public void clearOnce()
  public void onEndMotion()
  public void setOnce()
  public int actionCount()
  public IAnnotatedComponent getComponent(int index)

Fields:
public static final ActionList EMPTY_ACTION_LIST
protected final Action[] actions
protected boolean blocking
protected boolean atomic
protected int actionIndex
