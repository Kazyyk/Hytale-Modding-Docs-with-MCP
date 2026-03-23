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
