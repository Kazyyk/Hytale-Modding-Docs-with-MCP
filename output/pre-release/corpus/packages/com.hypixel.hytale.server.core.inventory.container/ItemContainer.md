# ItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public abstract class ItemContainer

Abstract base class for all item containers in the inventory system. Provides thread-safe read/write locking, slot-based item manipulation (add, remove, move, swap, sort), filtering via `SlotFilter` and `FilterType`, change event registration, and protocol serialization. Concrete implementations include `SimpleItemContainer`, `EmptyItemContainer`, `DelegateItemContainer`, `FetchedItemContainer`, `ItemStackItemContainer`, and `CombinedItemContainer`.

## Static Fields

- public static final CodecMapCodec<ItemContainer> CODEC
- public static final boolean DEFAULT_ADD_ALL_OR_NOTHING
- public static final boolean DEFAULT_REMOVE_ALL_OR_NOTHING
- public static final boolean DEFAULT_FULL_STACKS
- public static final boolean DEFAULT_EXACT_AMOUNT
- public static final boolean DEFAULT_FILTER

## Abstract Methods

- public abstract short getCapacity()
- public abstract void setGlobalFilter(FilterType globalFilter)
- public abstract void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
- public abstract ItemContainer clone()

## Key Methods

- public ClearTransaction clear()
- public ItemStackSlotTransaction addItemStackToSlot(short slot, ItemStack itemStack)
- public ItemStackSlotTransaction setItemStackForSlot(short slot, ItemStack itemStack)
- public ItemStack getItemStack(short slot)
- public SlotTransaction removeItemStackFromSlot(short slot)
- public ItemStackTransaction addItemStack(ItemStack itemStack)
- public ItemStackTransaction removeItemStack(ItemStack itemStack)
- public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, ItemContainer containerTo)
- public ListTransaction<SlotTransaction> sortItems(SortType sort)
- public EventRegistration<Void, ItemContainerChangeEvent> registerChangeEvent(Consumer<ItemContainerChangeEvent> consumer)
- public boolean isEmpty()
- public InventorySection toPacket()

## Relationships

- Implemented by `SimpleItemContainer`, `EmptyItemContainer`, `DelegateItemContainer`, `FetchedItemContainer`, `ItemStackItemContainer`
- Used by InventoryComponent

Known subclasses: CombinedItemContainer, DelegateItemContainer, EmptyItemContainer, FetchedItemContainer, ItemStackItemContainer, SimpleItemContainer

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public abstract short getCapacity()
  public abstract void setGlobalFilter(FilterType var1)
  public abstract void setSlotFilter(FilterActionType var1, short var2, SlotFilter var3)
  public abstract ItemContainer clone()
  protected abstract V readAction(Supplier<V> var1)
  protected abstract V readAction(Function<X,V> var1, X var2)
  protected abstract V writeAction(Supplier<V> var1)
  protected abstract V writeAction(Function<X,V> var1, X var2)
  protected abstract void lockForRead()
  protected abstract void unlockForRead()
  protected abstract void lockForWrite()
  protected abstract void unlockForWrite()
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
  public EventRegistration<Void,ItemContainer.ItemContainerChangeEvent> registerChangeEvent(Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  public EventRegistration<Void,ItemContainer.ItemContainerChangeEvent> registerChangeEvent(EventPriority priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  public EventRegistration<Void,ItemContainer.ItemContainerChangeEvent> registerChangeEvent(short priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
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
