# BuilderActionPickUpItem

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items.builders | Extends: BuilderActionWithDelay

public class BuilderActionPickUpItem extends BuilderActionWithDelay

NPC behavior action builder for ActionPickUpItem functionality.

## Fields

- protected final DoubleHolder range
- protected final EnumHolder<ActionPickUpItem.StorageTarget> pickupTarget
- protected AssetArrayHolder items
- protected boolean hoover

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- @Nonnull public BuilderActionPickUpItem readConfig(@Nonnull JsonElement data)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- public String[] getItems(BuilderSupport support)
- public boolean getHoover()
- public double getRange(@Nonnull BuilderSupport support)
- public ActionPickUpItem.StorageTarget getStorageTarget(@Nonnull BuilderSupport support)

Also in this package: BuilderActionDropItem, BuilderActionInventory, BuilderSensorDroppedItem

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderActionPickUpItem readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public String[] getItems(BuilderSupport support)
  public boolean getHoover()
  public double getRange(BuilderSupport support)
  public ActionPickUpItem.StorageTarget getStorageTarget(BuilderSupport support)

Fields:
protected final DoubleHolder range
protected final EnumHolder<ActionPickUpItem.StorageTarget> pickupTarget
protected AssetArrayHolder items
protected boolean hoover
