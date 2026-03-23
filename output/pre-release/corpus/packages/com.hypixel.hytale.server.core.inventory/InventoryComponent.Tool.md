# InventoryComponent.Tool

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: InventoryComponent | Implements: Component<EntityStore>

public static class InventoryComponent.Tool extends InventoryComponent implements Component<EntityStore>

Tool inventory section with active slot and wielding state tracking. The `usingToolsItem` flag indicates whether the entity is currently using a tool item versus a hotbar item. Extends InventoryComponent.

## Static Fields

- public static BuilderCodec<InventoryComponent.Tool> CODEC

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Tool> getComponentType()
- public byte getActiveSlot()
- public void setActiveSlot(byte activeSlot)
- public ItemStack getActiveItem()
- public boolean isUsingToolsItem()
- public void setUsingToolsItem(boolean usingToolsItem)
- public void ensureCapacity(short capacity, List<ItemStack> remainder)
- public Component<EntityStore> clone()
