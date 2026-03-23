# BuilderWeightedAction

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderBase<WeightedAction>

public class BuilderWeightedAction extends BuilderBase<WeightedAction>

## Fields

- private final BuilderObjectReferenceHelper<Action> action
- private final DoubleHolder weight

## Methods

- @Nonnull public WeightedAction build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public Class<WeightedAction> category()
- @Override public boolean isEnabled(ExecutionContext context)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<WeightedAction> readConfig(@Nonnull JsonElement data)
- @Override public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
- @Nullable public Action getAction(@Nonnull BuilderSupport support)
- public double getWeight(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBase, BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderSensorWithEntityFilters

Complete API:
  public WeightedAction build(BuilderSupport builderSupport)
  public Class<WeightedAction> category()
  public boolean isEnabled(ExecutionContext context)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<WeightedAction> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public Action getAction(BuilderSupport support)
  public double getWeight(BuilderSupport support)

Fields:
private final BuilderObjectReferenceHelper<Action> action
private final DoubleHolder weight
