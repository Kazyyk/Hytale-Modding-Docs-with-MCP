# BuilderActionInventory

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items.builders | Extends: BuilderActionBase

public class BuilderActionInventory extends BuilderActionBase

NPC behavior action builder for ActionInventory functionality.

## Fields

- protected final EnumHolder<ActionInventory.Operation> operation
- protected final AssetHolder item
- protected final IntHolder count
- protected final BooleanHolder useTarget
- protected final IntHolder slot

## Methods

- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Action> readConfig(@Nonnull JsonElement data)
- @Override public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
- public ActionInventory.Operation getOperation(@Nonnull BuilderSupport builderSupport)
- public String getItem(@Nonnull BuilderSupport builderSupport)
- public int getCount(@Nonnull BuilderSupport builderSupport)
- public boolean getUseTarget(@Nonnull BuilderSupport support)
- public int getSlot(@Nonnull BuilderSupport support)

Also in this package: BuilderActionDropItem, BuilderActionPickUpItem, BuilderSensorDroppedItem

Complete API:
  public Action build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Action> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public ActionInventory.Operation getOperation(BuilderSupport builderSupport)
  public String getItem(BuilderSupport builderSupport)
  public int getCount(BuilderSupport builderSupport)
  public boolean getUseTarget(BuilderSupport support)
  public int getSlot(BuilderSupport support)

Fields:
protected final EnumHolder<ActionInventory.Operation> operation
protected final AssetHolder item
protected final IntHolder count
protected final BooleanHolder useTarget
protected final IntHolder slot
