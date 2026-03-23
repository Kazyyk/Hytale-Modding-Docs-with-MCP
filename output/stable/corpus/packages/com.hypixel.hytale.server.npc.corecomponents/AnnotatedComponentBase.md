# AnnotatedComponentBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Implements: IAnnotatedComponent

public abstract class AnnotatedComponentBase implements IAnnotatedComponent

## Fields

- protected IAnnotatedComponent parent
- protected int index

## Methods

- @Override public void getInfo(Role role, ComponentInfo holder)
- @Override public void setContext(IAnnotatedComponent parent, int index)
- @Override public IAnnotatedComponent getParent()
- @Override public int getIndex()

Known subclasses: ActionBase, EntityFilterBase, MotionBase, SensorBase, WeightedAction

Also in this package: ActionBase, ActionWithDelay, BlockTarget, BodyMotionBase, EntityFilterBase, HeadMotionBase, IEntityFilter, ISensorEntityCollector, ISensorEntityPrioritiser, MotionBase, SensorBase, SensorWithEntityFilters, WeightedAction

Complete API:
  public void getInfo(Role role, ComponentInfo holder)
  public void setContext(IAnnotatedComponent parent, int index)
  public IAnnotatedComponent getParent()
  public int getIndex()

Fields:
protected IAnnotatedComponent parent
protected int index
