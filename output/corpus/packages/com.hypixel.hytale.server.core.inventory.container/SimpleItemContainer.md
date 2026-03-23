# SimpleItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class SimpleItemContainer extends ItemContainer

Concrete thread-safe item container backed by a `Short2ObjectMap<ItemStack>` with a `ReentrantReadWriteLock`. Supports per-slot filters, a global `FilterType`, and BSON codec serialization.

This is the most common container implementation used for player inventories, chests, and other fixed-capacity storage.

## Fields

- short capacity
- Short2ObjectMap<ItemStack> items

## Constructors


public SimpleItemContainer(short capacity)

Creates a container with the given capacity. Throws `IllegalArgumentException` if capacity is zero or negative.


public SimpleItemContainer(@Nonnull SimpleItemContainer other)

Copy constructor. Copies the items map and filters under the source's read lock.

## Methods


@Override
public short getCapacity()

Returns the fixed capacity of this container.


@Nonnull
public SimpleItemContainer clone()

Returns a copy of this container via the copy constructor.


@Override
public void setGlobalFilter(@Nonnull FilterType globalFilter)

Sets the global input/output filter.


@Override
public void setSlotFilter(FilterActionType actionType, short slot, @Nullable SlotFilter filter)

Sets or removes a per-slot filter for the given action type.


public static ItemContainer getNewContainer(short capacity)

Factory method that creates a new `SimpleItemContainer` with the given capacity.


public static boolean addOrDropItemStack(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull ItemContainer itemContainer, @Nonnull ItemStack itemStack)

Attempts to add an item stack to the container; drops any remainder as a world item.


public static boolean addOrDropItemStacks(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull ItemContainer itemContainer, List<ItemStack> itemStacks)

Attempts to add multiple item stacks; drops any remainders as world items.
