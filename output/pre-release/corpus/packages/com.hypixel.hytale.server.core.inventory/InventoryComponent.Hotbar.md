# InventoryComponent.Hotbar

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: InventoryComponent | Implements: Component<EntityStore>

public static class InventoryComponent.Hotbar extends InventoryComponent implements Component<EntityStore>

Hotbar inventory section with active slot tracking. Tracks which slot is currently selected by the player. Extends InventoryComponent.

## Static Fields

- public static BuilderCodec<InventoryComponent.Hotbar> CODEC

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Hotbar> getComponentType()
- public byte getActiveSlot()
- public void setActiveSlot(byte activeSlot)
- public ItemStack getActiveItem()
- public void ensureCapacity(short capacity, List<ItemStack> remainder)
- public Component<EntityStore> clone()
