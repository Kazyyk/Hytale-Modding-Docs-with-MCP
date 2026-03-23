# BuilderEntityFilterWithToggle

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderBase<IEntityFilter>

public abstract class BuilderEntityFilterWithToggle extends BuilderBase<IEntityFilter>

## Fields

- protected final BooleanHolder enabled

## Methods

- @Nonnull @Override public Builder<IEntityFilter> readCommonConfig(@Nonnull JsonElement data)
- @Nonnull @Override public Class<IEntityFilter> category()
- @Override public boolean isEnabled(ExecutionContext context)

Known subclasses: BuilderEntityFilterBase, BuilderEntityFilterMany, BuilderEntityFilterNot

Also in this package: BuilderActionBase, BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderSensorWithEntityFilters, BuilderWeightedAction

Complete API:
  public Builder<IEntityFilter> readCommonConfig(JsonElement data)
  public Class<IEntityFilter> category()
  public boolean isEnabled(ExecutionContext context)

Fields:
protected final BooleanHolder enabled
