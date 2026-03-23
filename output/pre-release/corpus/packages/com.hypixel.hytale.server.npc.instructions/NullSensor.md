# NullSensor

Type: class | Package: com.hypixel.hytale.server.npc.instructions | Implements: Sensor

public class NullSensor implements Sensor

## Methods

- @Override public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- @Override public InfoProvider getSensorInfo()
- @Override public boolean processDelay(float dt)
- @Override public void clearOnce()
- @Override public void setOnce()
- @Override public boolean isTriggered()
- @Override public void getInfo(Role role, ComponentInfo holder)
- @Override public void setContext(IAnnotatedComponent parent, int index)
- @Override @Nullable public IAnnotatedComponent getParent()
- @Override public int getIndex()

Also in this package: Action, ActionList, BodyMotion, HeadMotion, Instruction, InstructionHolder, InstructionRandomized, Motion, RoleStateChange, Sensor

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  public boolean processDelay(float dt)
  public void clearOnce()
  public void setOnce()
  public boolean isTriggered()
  public void getInfo(Role role, ComponentInfo holder)
  public void setContext(IAnnotatedComponent parent, int index)
  public IAnnotatedComponent getParent()
  public int getIndex()
