# BuilderSensorEntityPrioritiserBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderBase<ISensorEntityPrioritiser>

public abstract class BuilderSensorEntityPrioritiserBase extends BuilderBase<ISensorEntityPrioritiser>

## Fields

- private final Set<String> providedFilterTypes

## Constructors

- protected BuilderSensorEntityPrioritiserBase(Set<String> providedFilterTypes)

## Methods

- @Nonnull @Override public Class<ISensorEntityPrioritiser> category()
- @Override public boolean isEnabled(ExecutionContext context)
- @Override public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
- protected Set<String> getProvidedFilterTypes()

Known subclasses: BuilderSensorEntityPrioritiserAttitude

Also in this package: BuilderActionBase, BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorBase, BuilderSensorWithEntityFilters, BuilderWeightedAction

Complete API:
  public Class<ISensorEntityPrioritiser> category()
  public boolean isEnabled(ExecutionContext context)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  protected Set<String> getProvidedFilterTypes()

Fields:
private final Set<String> providedFilterTypes
