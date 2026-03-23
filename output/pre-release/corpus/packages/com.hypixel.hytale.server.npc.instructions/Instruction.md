# Instruction

Type: class | Package: com.hypixel.hytale.server.npc.instructions | Implements: RoleStateChange, IAnnotatedComponentCollection

public class Instruction implements RoleStateChange, IAnnotatedComponentCollection

## Fields

- public static final Instruction[] EMPTY_ARRAY
- protected IAnnotatedComponent parent
- protected final String name
- protected final String tag
- protected final Sensor sensor
- protected int index
- protected final Instruction[] instructionList
- protected final BodyMotion bodyMotion
- protected final HeadMotion headMotion
- protected final ActionList actions
- protected final double weight
- protected final boolean treeMode
- protected final boolean invertTreeModeResult
- protected boolean continueAfter
- protected Instruction parentTreeModeStep

## Methods

- public Sensor getSensor()
- @Nullable public String getDebugTag()
- public double getWeight()
- public boolean isContinueAfter()
- @Nullable public BodyMotion getBodyMotion()
- @Nullable public HeadMotion getHeadMotion()
- @Override public void registerWithSupport(Role role)
- @Override public void motionControllerChanged( @Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, MotionController motionController, @Nullable ComponentAccessor<EntityStore> componentAccessor )
- @Override public void loaded(Role role)
- @Override public void spawned(Role role)
- @Override public void unloaded(Role role)
- @Override public void removed(Role role)
- @Override public void teleported(Role role, World from, World to)
- @Override public int componentCount()
- @Override public IAnnotatedComponent getComponent(int index)
- @Override public void getInfo(Role role, @Nonnull ComponentInfo holder)
- @Override public IAnnotatedComponent getParent()
- @Override public int getIndex()
- @Override @Nonnull public String getLabel()
- @Override public void setContext(IAnnotatedComponent parent, int index)
- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public void executeActions(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public void execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public void clearOnce()
- public void onEndMotion()
- public void onMatched(@Nonnull Role role)
- public void onCompleted(@Nonnull Role role)
- public void notifyChildSensorMatch()
- public void reset()
- protected void forEachInstruction(@Nonnull Consumer<Instruction> instructionConsumer)
- protected <T> void forEachInstruction(@Nonnull BiConsumer<Instruction, T> instructionConsumer, T obj)
- protected <T, U, V> void forEachInstruction(@Nonnull QuadConsumer<Instruction, T, U, V> instructionConsumer, T t, U u, V v)
- @Nonnull public static Instruction createRootInstruction(Instruction[] instructions, @Nonnull BuilderSupport support)

Known subclasses: InstructionRandomized

Also in this package: Action, ActionList, BodyMotion, HeadMotion, InstructionHolder, InstructionRandomized, Motion, NullSensor, RoleStateChange, Sensor

Complete API:
  public Sensor getSensor()
  public String getDebugTag()
  public double getWeight()
  public boolean isContinueAfter()
  public BodyMotion getBodyMotion()
  public HeadMotion getHeadMotion()
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void getInfo(Role role, ComponentInfo holder)
  public IAnnotatedComponent getParent()
  public int getIndex()
  public String getLabel()
  public void setContext(IAnnotatedComponent parent, int index)
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public void executeActions(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public void execute(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public void clearOnce()
  public void onEndMotion()
  public void onMatched(Role role)
  public void onCompleted(Role role)
  public void notifyChildSensorMatch()
  public void reset()
  protected void forEachInstruction(Consumer<Instruction> instructionConsumer)
  protected void forEachInstruction(BiConsumer<Instruction,T> instructionConsumer, T obj)
  protected void forEachInstruction(QuadConsumer<Instruction,T,U,V> instructionConsumer, T t, U u, V v)
  public static Instruction createRootInstruction(Instruction[] instructions, BuilderSupport support)

Fields:
public static final Instruction[] EMPTY_ARRAY
public static final HytaleLogger LOGGER
protected IAnnotatedComponent parent
protected final String name
protected final String tag
protected final Sensor sensor
protected int index
protected final Instruction[] instructionList
protected final BodyMotion bodyMotion
protected final HeadMotion headMotion
protected final ActionList actions
protected final double weight
protected final boolean treeMode
protected final boolean invertTreeModeResult
protected boolean continueAfter
protected Instruction parentTreeModeStep
