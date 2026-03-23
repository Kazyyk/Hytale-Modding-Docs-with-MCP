# BuilderSensorWithEntityFilters

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderSensorBase

public abstract class BuilderSensorWithEntityFilters extends BuilderSensorBase

## Fields

- protected final BuilderObjectListHelper<IEntityFilter> filters

## Methods

- @Override public boolean validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
| `@Nonnull public` | `IEntityFilter[]` | `getFilters(@Nonnull BuilderSupport support, @Nullable ISensorEntityPrioritiser prioritiser, ComponentContext context)` |
| `@Nonnull protected` | `BuilderValidationHelper` | `createFilterValidationHelper(ComponentContext context)` |

Known subclasses: BuilderSensorEntityBase, BuilderSensorSelf, BuilderSensorTarget

Also in this package: BuilderActionBase, BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderWeightedAction

Complete API:
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public IEntityFilter[] getFilters(BuilderSupport support, ISensorEntityPrioritiser prioritiser, ComponentContext context)
  protected BuilderValidationHelper createFilterValidationHelper(ComponentContext context)

Fields:
protected final BuilderObjectListHelper<IEntityFilter> filters
