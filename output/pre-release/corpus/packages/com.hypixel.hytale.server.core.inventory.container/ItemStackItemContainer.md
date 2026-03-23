# ItemStackItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class ItemStackItemContainer extends ItemContainer

Item container backed by an item stack's BSON metadata. Stores sub-items inside the metadata of a parent item stack (e.g., a bag or backpack item). Writes changes back to the parent container whenever items are modified. Not clonable.

## Static Fields

- public static KeyedCodec<BsonDocument> CONTAINER_CODEC
- public static KeyedCodec<Short> CAPACITY_CODEC
- public static KeyedCodec<ItemStack[]> ITEMS_CODEC

## Methods

- public ItemContainer getParentContainer()
- public short getItemStackSlot()
- public ItemStack getOriginalItemStack()
- public boolean isItemStackValid()
- public short getCapacity()
- public ItemStack getItemStack(short slot)
- public static void writeToItemStack(ItemContainer itemContainer, short slot, ItemStack originalItemStack, ItemStack[] items)
- public static ItemStackItemContainer getContainer(ItemContainer itemContainer, short slot)
- public static ItemStackItemContainer makeContainerWithCapacity(ItemContainer itemContainer, short slot, short capacity)
- public static ItemStackItemContainer ensureContainer(ItemContainer itemContainer, short slot, short capacity)
- public static ItemStackItemContainer ensureConfiguredContainer(ItemContainer itemContainer, short slot, ItemStackContainerConfig config)

## Relationships

- Extends `ItemContainer`
