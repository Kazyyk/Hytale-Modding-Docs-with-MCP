# WeightedAction

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: AnnotatedComponentBase | Implements: Action

public class WeightedAction extends AnnotatedComponentBase implements Action

## Fields

- @Nullable private final Action action
- private final double weight

## Constructors

- public WeightedAction(@Nonnull BuilderWeightedAction builder, @Nonnull BuilderSupport support)

## Methods

- public double getWeight()
- @Override public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public void activate(Role role, InfoProvider infoProvider)
- @Override public void deactivate(Role role, InfoProvider infoProvider)
- @Override public boolean isActivated()
- @Override public void getInfo(Role role, ComponentInfo holder)
- @Override public boolean processDelay(float dt)
- @Override public void clearOnce()
- @Override public void setOnce()
- @Override public boolean isTriggered()
- @Override public void registerWithSupport(Role role)
- @Override public void motionControllerChanged(@Nullable Ref<EntityStore> ref,
        @Nonnull NPCEntity npcComponent,
        MotionController motionController,
        @Nullable ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `loaded(Role role)` |
| `@Override public` | `void` | `spawned(Role role)` |
| `@Override public` | `void` | `unloaded(Role role)` |
| `@Override public` | `void` | `removed(Role role)` |
| `@Override public` | `void` | `teleported(Role role, World from, World to)` |
