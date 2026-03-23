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

Known subclasses: SensorEntityBase, SensorSelf, SensorTarget

Also in this package: ActionBase, ActionWithDelay, AnnotatedComponentBase, BlockTarget, BodyMotionBase, EntityFilterBase, HeadMotionBase, IEntityFilter, ISensorEntityCollector, ISensorEntityPrioritiser, MotionBase, SensorBase, WeightedAction

Complete API:
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
  protected boolean matchesFilters(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  protected float findViewAngleFromFilters()

Fields:
private final IEntityFilter[] filters
