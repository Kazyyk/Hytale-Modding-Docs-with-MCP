# InventoryComponent.Utility

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: InventoryComponent | Implements: Component<EntityStore>

public static class InventoryComponent.Utility extends InventoryComponent implements Component<EntityStore>

Utility inventory section with slot filters that restrict to usable utility items. Tracks the active utility slot. Extends InventoryComponent.

## Static Fields

- public static BuilderCodec<InventoryComponent.Utility> CODEC

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Utility> getComponentType()
- public byte getActiveSlot()
- public void setActiveSlot(byte activeSlot)
- public ItemStack getActiveItem()
- public void ensureCapacity(short capacity, List<ItemStack> remainder)
- public Component<EntityStore> clone()
