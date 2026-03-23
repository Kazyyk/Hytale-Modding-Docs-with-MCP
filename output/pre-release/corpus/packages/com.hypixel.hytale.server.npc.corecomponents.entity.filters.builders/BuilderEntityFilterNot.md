# BuilderEntityFilterNot

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterWithToggle

public class BuilderEntityFilterNot extends BuilderEntityFilterWithToggle

Extends `BuilderEntityFilterWithToggle`.

## Methods

- @Nullable public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public void registerTags(@Nonnull Set<String> tags)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- @Override public boolean validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
| `@Nullable public` | `IEntityFilter` | `getFilter(@Nonnull BuilderSupport support)` |
