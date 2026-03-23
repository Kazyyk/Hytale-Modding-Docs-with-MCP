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
