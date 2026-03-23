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

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public IEntityFilter build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public IEntityFilter getFilter(BuilderSupport support)

Fields:
protected final BuilderObjectReferenceHelper<IEntityFilter> filter
