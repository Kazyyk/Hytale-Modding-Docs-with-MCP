# SensorWithEntityFilters

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: SensorBase | Implements: IAnnotatedComponentCollection

public abstract class SensorWithEntityFilters extends SensorBase implements IAnnotatedComponentCollection

## Fields

- @Nonnull private final IEntityFilter[] filters

## Constructors

- public SensorWithEntityFilters(@Nonnull BuilderSensorBase builderSensorBase, @Nonnull IEntityFilter[] filters)

## Methods

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
| `@Override public` | `int` | `componentCount()` |
| `@Override public` | `IAnnotatedComponent` | `getComponent(int index)` |
| `@Override public` | `void` | `setContext(IAnnotatedComponent parent, int index)` |
| `protected` | `boolean` | `matchesFilters(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `protected` | `float` | `findViewAngleFromFilters()` |
