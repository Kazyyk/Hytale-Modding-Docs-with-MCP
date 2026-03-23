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
