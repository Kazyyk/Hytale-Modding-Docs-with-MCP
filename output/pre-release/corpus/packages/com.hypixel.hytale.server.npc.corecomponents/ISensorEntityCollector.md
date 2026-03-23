# ISensorEntityCollector

Type: interface | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: RoleStateChange

public interface ISensorEntityCollector extends RoleStateChange

## Methods

- void init(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nonnull ComponentAccessor<EntityStore> var3)
- void collectMatching(@Nonnull Ref<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull ComponentAccessor<EntityStore> var3)
- void collectNonMatching(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2)
- boolean terminateOnFirstMatch()
- void cleanup()

Known implementors: CombatTargetCollector

Also in this package: ActionBase, ActionWithDelay, AnnotatedComponentBase, BlockTarget, BodyMotionBase, EntityFilterBase, HeadMotionBase, IEntityFilter, ISensorEntityPrioritiser, MotionBase, SensorBase, SensorWithEntityFilters, WeightedAction

Complete API:
  void init(Ref<EntityStore> var1, Role var2, ComponentAccessor<EntityStore> var3)
  void collectMatching(Ref<EntityStore> var1, Ref<EntityStore> var2, ComponentAccessor<EntityStore> var3)
  void collectNonMatching(Ref<EntityStore> var1, ComponentAccessor<EntityStore> var2)
  boolean terminateOnFirstMatch()
  void cleanup()

Fields:
ISensorEntityCollector DEFAULT
