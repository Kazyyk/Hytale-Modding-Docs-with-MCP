# SimpleItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class SimpleItemContainer extends ItemContainer

Standard fixed-capacity item container backed by a `Short2ObjectMap<ItemStack>`. Provides thread-safe read/write operations via `ReentrantReadWriteLock`. Supports slot filtering, global filtering, codec serialization, and utility methods for adding/dropping items with overflow handling.

## Static Fields

- public static final BuilderCodec<SimpleItemContainer> CODEC

## Constructors

- public SimpleItemContainer(short capacity)
- public SimpleItemContainer(SimpleItemContainer other)

## Methods

- public short getCapacity()
- public SimpleItemContainer clone()
- public boolean isEmpty()
- public void setGlobalFilter(FilterType globalFilter)
- public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
- public ItemStack getItemStack(short slot)
- public static ItemContainer getNewContainer(short capacity)
- public static boolean addOrDropItemStack(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, ItemStack itemStack)
- public static boolean addOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)
- public static boolean tryAddOrderedOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)

## Relationships

- Extends `ItemContainer`
- Used by InventoryComponent and ItemContainerBlock
