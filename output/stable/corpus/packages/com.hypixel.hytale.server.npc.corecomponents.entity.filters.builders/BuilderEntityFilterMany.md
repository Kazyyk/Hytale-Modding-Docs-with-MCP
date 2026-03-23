# BuilderEntityFilterMany

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterWithToggle

public abstract class BuilderEntityFilterMany extends BuilderEntityFilterWithToggle

Abstract base class in the `builders` package.

## Fields

- @Nonnull protected BuilderObjectListHelper<IEntityFilter> objectListHelper

## Methods

- @Override public void registerTags(@Nonnull Set<String> tags)
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- @Override public boolean validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
