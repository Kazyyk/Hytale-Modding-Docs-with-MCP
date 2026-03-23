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

Known subclasses: BuilderEntityFilterAnd, BuilderEntityFilterOr

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterEntityEffect, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public void registerTags(Set<String> tags)
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)

Fields:
protected BuilderObjectListHelper<IEntityFilter> objectListHelper
