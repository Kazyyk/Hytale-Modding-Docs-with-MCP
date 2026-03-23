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
