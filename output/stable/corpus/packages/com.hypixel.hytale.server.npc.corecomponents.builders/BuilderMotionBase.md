# BuilderMotionBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: Motion> extends BuilderBase<T>

public abstract class BuilderMotionBase<T extends Motion> extends BuilderBase<T>

## Methods

- @Override public boolean canRequireFeature()
- @Override public Builder<T> readCommonConfig(JsonElement data)
- @Override public final boolean isEnabled(ExecutionContext context)
- @Override public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)

Known subclasses: BuilderBodyMotionBase, BuilderHeadMotionBase, BuilderMotionSequence, BuilderMotionTimer

Also in this package: BuilderActionBase, BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderSensorWithEntityFilters, BuilderWeightedAction

Complete API:
  public boolean canRequireFeature()
  public Builder<T> readCommonConfig(JsonElement data)
  public final boolean isEnabled(ExecutionContext context)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
