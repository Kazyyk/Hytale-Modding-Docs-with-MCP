# ItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public abstract class ItemContainer

Abstract base class for all item containers in the inventory system. Provides thread-safe slot-based storage for `ItemStack` instances with support for add, remove, move, replace, and clear operations. Enforces capacity limits, slot filters, and global filters. Subclasses must implement the internal slot access methods and the locking strategy.

Fires `ItemContainerChangeEvent` through both internal and external event bus registries when container contents change.

## Constants

- boolean DEFAULT_ADD_ALL_OR_NOTHING
- boolean DEFAULT_REMOVE_ALL_OR_NOTHING
- boolean DEFAULT_FULL_STACKS
- boolean DEFAULT_EXACT_AMOUNT
- boolean DEFAULT_FILTER

## Abstract Methods


public abstract short getCapacity()

Returns the total number of slots in this container.


public abstract void setGlobalFilter(FilterType var1)

Sets the global input/output filter for the entire container.


public abstract void setSlotFilter(FilterActionType var1, short var2, SlotFilter var3)

Sets a per-slot filter for a specific action type and slot index.


public abstract ItemContainer clone()

Creates a copy of this container.


protected abstract <V> V readAction(Supplier<V> var1)

Executes an action under the container's read lock.


protected abstract <V> V writeAction(Supplier<V> var1)

Executes an action under the container's write lock.


@Nullable
protected abstract ItemStack internal_getSlot(short var1)

Returns the item stack at the given slot without locking.


@Nullable
protected abstract ItemStack internal_setSlot(short var1, ItemStack var2)

Sets the item stack at the given slot without locking. Returns the previous item.


@Nullable
protected abstract ItemStack internal_removeSlot(short var1)

Removes and returns the item stack at the given slot without locking.


protected abstract boolean cantAddToSlot(short var1, ItemStack var2, ItemStack var3)

Returns `true` if the item cannot be added to the given slot (filter check).


protected abstract boolean cantRemoveFromSlot(short var1)

Returns `true` if items cannot be removed from the given slot (filter check).


protected abstract boolean cantDropFromSlot(short var1)

Returns `true` if items cannot be dropped from the given slot (filter check).


protected abstract boolean cantMoveToSlot(ItemContainer var1, short var2)

Returns `true` if items cannot be moved to this container from the source container and slot.

## Public Methods


@Nonnull
public InventorySection toPacket()

Converts this container to a protocol `InventorySection` for network transmission.


@Nonnull
public Map<Integer, ItemWithAllMetadata> toProtocolMap()

Builds a protocol-compatible map of slot index to `ItemWithAllMetadata`.


public EventRegistration registerChangeEvent(@Nonnull Consumer<ItemContainer.ItemContainerChangeEvent> consumer)

Registers a change event listener at default priority.


public ClearTransaction clear()

Removes all items from the container.


public boolean canAddItemStackToSlot(short slot, @Nonnull ItemStack itemStack, boolean allOrNothing, boolean filter)

Tests whether an item stack can be added to a specific slot.


@Nonnull
public ItemStackSlotTransaction addItemStackToSlot(short slot, @Nonnull ItemStack itemStack)

Adds an item stack to a specific slot with default options.


@Nullable
public ItemStack getItemStack(short slot)

Returns the item stack at the given slot, or `null` if empty.


@Nonnull
public SlotTransaction removeItemStackFromSlot(short slot)

Removes the entire item stack from a slot.


@Nonnull
public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, @Nonnull ItemContainer containerTo)

Moves an item stack from a slot in this container to another container.


@Nonnull
public ListTransaction<ItemStackSlotTransaction> replaceAll(SlotReplacementFunction func)

Replaces all non-empty slots using the given replacement function.

## Inner Types

### ItemContainerChangeEvent


public record ItemContainerChangeEvent(ItemContainer container, Transaction transaction) implements IEvent

Event fired when any slot in the container changes. Carries the originating container and the transaction that caused the change.

### TempItemData


public record TempItemData(String itemId, int quantity)

Lightweight holder for an item ID and quantity, used during internal transaction processing.

## See Also

- SimpleItemContainer -- concrete thread-safe implementation backed by `Short2ObjectMap`.
- CombinedItemContainer -- composite container spanning multiple child containers.
- DelegateItemContainer -- wrapper that adds per-slot filters over a delegate.
- EmptyItemContainer -- zero-capacity singleton container.
- ItemStackItemContainer -- container stored inside an item stack's metadata.

Known subclasses: CombinedItemContainer, DelegateItemContainer, EmptyItemContainer, ItemStackItemContainer, SimpleItemContainer

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public abstract short getCapacity()
  public abstract void setGlobalFilter(FilterType var1)
  public abstract void setSlotFilter(FilterActionType var1, short var2, SlotFilter var3)
  public abstract ItemContainer clone()
  protected abstract V readAction(Supplier<V> var1)
  protected abstract V readAction(Function<X,V> var1, X var2)
  protected abstract V writeAction(Supplier<V> var1)
  protected abstract V writeAction(Function<X,V> var1, X var2)
  protected abstract ClearTransaction internal_clear()
  protected abstract ItemStack internal_getSlot(short var1)
  protected abstract ItemStack internal_setSlot(short var1, ItemStack var2)
  protected abstract ItemStack internal_removeSlot(short var1)
  protected abstract boolean cantAddToSlot(short var1, ItemStack var2, ItemStack var3)
  protected abstract boolean cantRemoveFromSlot(short var1)
  protected abstract boolean cantDropFromSlot(short var1)
  protected abstract boolean cantMoveToSlot(ItemContainer var1, short var2)
  public InventorySection toPacket()
  public Map<Integer,ItemWithAllMetadata> toProtocolMap()
  public EventRegistration registerChangeEvent(Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  public EventRegistration registerChangeEvent(EventPriority priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  public EventRegistration registerChangeEvent(short priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  public ClearTransaction clear()
  public boolean canAddItemStackToSlot(short slot, ItemStack itemStack, boolean allOrNothing, boolean filter)
  public ItemStackSlotTransaction addItemStackToSlot(short slot, ItemStack itemStack)
  public ItemStackSlotTransaction addItemStackToSlot(short slot, ItemStack itemStack, boolean allOrNothing, boolean filter)
  public ItemStackSlotTransaction setItemStackForSlot(short slot, ItemStack itemStack)
  public ItemStackSlotTransaction setItemStackForSlot(short slot, ItemStack itemStack, boolean filter)
  public ItemStack getItemStack(short slot)
  public ItemStackSlotTransaction replaceItemStackInSlot(short slot, ItemStack itemStackToRemove, ItemStack itemStack)
  public ListTransaction<ItemStackSlotTransaction> replaceAll(SlotReplacementFunction func)
  private ListTransaction<ItemStackSlotTransaction> replaceAll(SlotReplacementFunction func, boolean ignoreEmpty)
  protected ItemStackSlotTransaction internal_replaceItemStack(short slot, ItemStack itemStackToRemove, ItemStack itemStack)
  public SlotTransaction removeItemStackFromSlot(short slot)
  public SlotTransaction removeItemStackFromSlot(short slot, boolean filter)
  public ItemStackSlotTransaction removeItemStackFromSlot(short slot, int quantityToRemove)
  public ItemStackSlotTransaction removeItemStackFromSlot(short slot, int quantityToRemove, boolean allOrNothing, boolean filter)
  public ItemStackSlotTransaction internal_removeItemStack(short slot, int quantityToRemove)
  public ItemStackSlotTransaction removeItemStackFromSlot(short slot, ItemStack itemStackToRemove, int quantityToRemove)
  public ItemStackSlotTransaction removeItemStackFromSlot(short slot, ItemStack itemStackToRemove, int quantityToRemove, boolean allOrNothing, boolean filter)
  public MaterialSlotTransaction removeMaterialFromSlot(short slot, MaterialQuantity material)
  public MaterialSlotTransaction removeMaterialFromSlot(short slot, MaterialQuantity material, boolean allOrNothing, boolean exactAmount, boolean filter)
  public ResourceSlotTransaction removeResourceFromSlot(short slot, ResourceQuantity resource)
  public ResourceSlotTransaction removeResourceFromSlot(short slot, ResourceQuantity resource, boolean allOrNothing, boolean exactAmount, boolean filter)
  public TagSlotTransaction removeTagFromSlot(short slot, int tagIndex, int quantity)
  public TagSlotTransaction removeTagFromSlot(short slot, int tagIndex, int quantity, boolean allOrNothing, boolean filter)
  public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, ItemContainer containerTo)
  public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, ItemContainer containerTo, boolean filter)
  public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, ItemContainer containerTo, boolean allOrNothing, boolean filter)
  protected MoveTransaction<ItemStackTransaction> internal_moveItemStackFromSlot(short slot, ItemContainer containerTo, boolean allOrNothing, boolean filter)
  public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, int quantity, ItemContainer containerTo)
  public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, int quantity, ItemContainer containerTo, boolean allOrNothing, boolean filter)
  protected MoveTransaction<ItemStackTransaction> internal_moveItemStackFromSlot(short slot, int quantity, ItemContainer containerTo, boolean allOrNothing, boolean filter)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> moveItemStackFromSlot(short slot, ItemContainer containerTo)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> moveItemStackFromSlot(short slot, boolean allOrNothing, boolean filter, ItemContainer containerTo)
  private ListTransaction<MoveTransaction<ItemStackTransaction>> internal_moveItemStackFromSlot(short slot, boolean allOrNothing, boolean filter, ItemContainer[] containerTo)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> moveItemStackFromSlot(short slot, int quantity, ItemContainer containerTo)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> moveItemStackFromSlot(short slot, int quantity, boolean allOrNothing, boolean filter, ItemContainer containerTo)
  private ListTransaction<MoveTransaction<ItemStackTransaction>> internal_moveItemStackFromSlot(short slot, int quantity, boolean allOrNothing, boolean filter, ItemContainer[] containerTo)
  public MoveTransaction<SlotTransaction> moveItemStackFromSlotToSlot(short slot, int quantity, ItemContainer containerTo, short slotTo)
  public MoveTransaction<SlotTransaction> moveItemStackFromSlotToSlot(short slot, int quantity, ItemContainer containerTo, short slotTo, boolean filter)
  protected MoveTransaction<SlotTransaction> internal_moveItemStackFromSlot(short slot, int quantity, ItemContainer containerTo, short slotTo, boolean filter)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> moveAllItemStacksTo(ItemContainer containerTo)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> moveAllItemStacksTo(Predicate<ItemStack> itemPredicate, ItemContainer containerTo)
  protected ListTransaction<MoveTransaction<ItemStackTransaction>> internal_moveAllItemStacksTo(Predicate<ItemStack> itemPredicate, ItemContainer[] containerTo)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> quickStackTo(ItemContainer containerTo)
  public ListTransaction<MoveTransaction<SlotTransaction>> combineItemStacksIntoSlot(ItemContainer containerTo, short slotTo)
  protected ListTransaction<MoveTransaction<SlotTransaction>> internal_combineItemStacksIntoSlot(ItemContainer containerTo, short slotTo)
  public ListTransaction<MoveTransaction<SlotTransaction>> swapItems(short srcPos, ItemContainer containerTo, short destPos, short length)
  protected ListTransaction<MoveTransaction<SlotTransaction>> internal_swapItems(short srcPos, ItemContainer containerTo, short destPos, short length)
  protected MoveTransaction<SlotTransaction> internal_swapItems(ItemContainer containerTo, short slotFrom, short slotTo)
  public boolean canAddItemStack(ItemStack itemStack)
  public boolean canAddItemStack(ItemStack itemStack, boolean fullStacks, boolean filter)
  public ItemStackTransaction addItemStack(ItemStack itemStack)
  public ItemStackTransaction addItemStack(ItemStack itemStack, boolean allOrNothing, boolean fullStacks, boolean filter)
  public boolean canAddItemStacks(List<ItemStack> itemStacks)
  public boolean canAddItemStacks(List<ItemStack> itemStacks, boolean fullStacks, boolean filter)
  public ListTransaction<ItemStackTransaction> addItemStacks(List<ItemStack> itemStacks)
  public ListTransaction<ItemStackTransaction> addItemStacks(List<ItemStack> itemStacks, boolean allOrNothing, boolean fullStacks, boolean filter)
  public ListTransaction<ItemStackSlotTransaction> addItemStacksOrdered(List<ItemStack> itemStacks)
  public ListTransaction<ItemStackSlotTransaction> addItemStacksOrdered(short offset, List<ItemStack> itemStacks)
  public ListTransaction<ItemStackSlotTransaction> addItemStacksOrdered(List<ItemStack> itemStacks, boolean allOrNothing, boolean filter)
  public ListTransaction<ItemStackSlotTransaction> addItemStacksOrdered(short offset, List<ItemStack> itemStacks, boolean allOrNothing, boolean filter)
  public boolean canRemoveItemStack(ItemStack itemStack)
  public boolean canRemoveItemStack(ItemStack itemStack, boolean exactAmount, boolean filter)
  public ItemStackTransaction removeItemStack(ItemStack itemStack)
  public ItemStackTransaction removeItemStack(ItemStack itemStack, boolean allOrNothing, boolean filter)
  public boolean canRemoveItemStacks(List<ItemStack> itemStacks)
  public boolean canRemoveItemStacks(List<ItemStack> itemStacks, boolean exactAmount, boolean filter)
  public ListTransaction<ItemStackTransaction> removeItemStacks(List<ItemStack> itemStacks)
  public ListTransaction<ItemStackTransaction> removeItemStacks(List<ItemStack> itemStacks, boolean allOrNothing, boolean filter)
  public boolean canRemoveTag(int tagIndex, int quantity)
  public boolean canRemoveTag(int tagIndex, int quantity, boolean exactAmount, boolean filter)
  public TagTransaction removeTag(int tagIndex, int quantity)
  public TagTransaction removeTag(int tagIndex, int quantity, boolean allOrNothing, boolean exactAmount, boolean filter)
  public boolean canRemoveResource(ResourceQuantity resource)
  public boolean canRemoveResource(ResourceQuantity resource, boolean exactAmount, boolean filter)
  public ResourceTransaction removeResource(ResourceQuantity resource)
  public ResourceTransaction removeResource(ResourceQuantity resource, boolean allOrNothing, boolean exactAmount, boolean filter)
  public boolean canRemoveResources(List<ResourceQuantity> resources)
  public boolean canRemoveResources(List<ResourceQuantity> resources, boolean exactAmount, boolean filter)
  public ListTransaction<ResourceTransaction> removeResources(List<ResourceQuantity> resources)
  public ListTransaction<ResourceTransaction> removeResources(List<ResourceQuantity> resources, boolean allOrNothing, boolean exactAmount, boolean filter)
  public boolean canRemoveMaterial(MaterialQuantity material)
  public boolean canRemoveMaterial(MaterialQuantity material, boolean exactAmount, boolean filter)
  public MaterialTransaction removeMaterial(MaterialQuantity material)
  public MaterialTransaction removeMaterial(MaterialQuantity material, boolean allOrNothing, boolean exactAmount, boolean filter)
  public boolean canRemoveMaterials(List<MaterialQuantity> materials)
  public boolean canRemoveMaterials(List<MaterialQuantity> materials, boolean exactAmount, boolean filter)
  public List<TestRemoveItemSlotResult> getSlotMaterialsToRemove(List<MaterialQuantity> materials, boolean exactAmount, boolean filter)
  public ListTransaction<MaterialTransaction> removeMaterials(List<MaterialQuantity> materials)
  public ListTransaction<MaterialTransaction> removeMaterials(List<MaterialQuantity> materials, boolean allOrNothing, boolean exactAmount, boolean filter)
  public ListTransaction<MaterialSlotTransaction> removeMaterialsOrdered(short offset, List<MaterialQuantity> materials)
  public ListTransaction<MaterialSlotTransaction> removeMaterialsOrdered(List<MaterialQuantity> materials, boolean allOrNothing, boolean exactAmount, boolean filter)
  public ListTransaction<MaterialSlotTransaction> removeMaterialsOrdered(short offset, List<MaterialQuantity> materials, boolean allOrNothing, boolean exactAmount, boolean filter)
  public boolean isEmpty()
  public int countItemStacks(Predicate<ItemStack> itemPredicate)
  public boolean containsItemStacksStackableWith(ItemStack itemStack)
  public void forEach(ShortObjectConsumer<ItemStack> action)
  public void forEachWithMeta(ShortBiObjConsumer<ItemStack,T> consumer, T meta)
  public List<ItemStack> removeAllItemStacks()
  public List<ItemStack> dropAllItemStacks()
  public List<ItemStack> dropAllItemStacks(boolean filter)
  public ListTransaction<SlotTransaction> sortItems(SortType sort)
  protected ListTransaction<SlotTransaction> internal_sortItems(SortType sort)
  protected void sendUpdate(Transaction transaction)
  public boolean containsContainer(ItemContainer itemContainer)
  public void doMigration(Function<String,String> blockMigration)
  public static ItemResourceType getMatchingResourceType(Item item, String resourceId)
  public static void validateQuantity(int quantity)
  public static void validateSlotIndex(short slot, int capacity)
  public static T copy(ItemContainer from, T to, List<ItemStack> remainder)
  public static T ensureContainerCapacity(T inputContainer, short capacity, ShortFunction<T> newContainerSupplier, List<ItemStack> remainder)
  public static ItemContainer getNewContainer(short capacity, ShortFunction<ItemContainer> supplier)

Fields:
public static final CodecMapCodec<ItemContainer> CODEC
public static final boolean DEFAULT_ADD_ALL_OR_NOTHING
public static final boolean DEFAULT_REMOVE_ALL_OR_NOTHING
public static final boolean DEFAULT_FULL_STACKS
public static final boolean DEFAULT_EXACT_AMOUNT
public static final boolean DEFAULT_FILTER
protected static final HytaleLogger LOGGER
protected final SyncEventBusRegistry<Void,ItemContainer.ItemContainerChangeEvent> externalChangeEventRegistry
protected final SyncEventBusRegistry<Void,ItemContainer.ItemContainerChangeEvent> internalChangeEventRegistry
