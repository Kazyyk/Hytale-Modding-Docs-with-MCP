# Inventory

Type: class | Package: com.hypixel.hytale.server.core.inventory | Implements: NetworkSerializable<UpdatePlayerInventory>

public class Inventory implements NetworkSerializable<UpdatePlayerInventory>

Manages a living entity's item inventory. Contains multiple section containers (storage, armor, hotbar, utility, tools, backpack) and tracks the currently active slots. Dispatches `LivingEntityInventoryChangeEvent` when any section changes. Supports item movement between sections, smart-move logic based on item type and player settings, armor equipping, sorting, and serialization via `BuilderCodec`.

## Constants

- public static final short DEFAULT_HOTBAR_CAPACITY
- public static final short DEFAULT_UTILITY_CAPACITY
- public static final short DEFAULT_TOOLS_CAPACITY
- public static final short DEFAULT_ARMOR_CAPACITY
- public static final short DEFAULT_STORAGE_ROWS
- public static final short DEFAULT_STORAGE_COLUMNS
- public static final short DEFAULT_STORAGE_CAPACITY
- public static final int HOTBAR_SECTION_ID
- public static final int STORAGE_SECTION_ID
- public static final int ARMOR_SECTION_ID
- public static final int UTILITY_SECTION_ID
- public static final int TOOLS_SECTION_ID
- public static final int BACKPACK_SECTION_ID
- public static final byte INACTIVE_SLOT_INDEX
- public static final int VERSION
- public static final BuilderCodec<Inventory> CODEC

## Methods

- public void moveItem(int fromSectionId, int fromSlotId, int quantity, int toSectionId, int toSlotId)
- public void smartMoveItem(int fromSectionId, int fromSlotId, int quantity, SmartMoveType moveType, PlayerSettings settings)
- public ListTransaction<MoveTransaction<ItemStackTransaction>> takeAll(int inventorySectionId, PlayerSettings settings)
- public ListTransaction<MoveTransaction<ItemStackTransaction>> takeAllWithPriority(ItemContainer fromContainer, PlayerSettings settings)
- public ListTransaction<MoveTransaction<ItemStackTransaction>> putAll(int inventorySectionId)
- public ListTransaction<MoveTransaction<ItemStackTransaction>> quickStack(int inventorySectionId)
- public List<ItemStack> dropAllItemStacks()
- public void clear()
- public ItemContainer getStorage()
- public ItemContainer getArmor()
- public ItemContainer getHotbar()
- public ItemContainer getUtility()
- public ItemContainer getTools()
- public ItemContainer getBackpack()
- public void resizeBackpack(short capacity, List<ItemStack> remainder)
- public CombinedItemContainer getCombinedHotbarFirst()
- public CombinedItemContainer getCombinedStorageFirst()
- public CombinedItemContainer getCombinedBackpackStorageHotbar()
- public CombinedItemContainer getCombinedBackpackStorageHotbarFirst()
- public CombinedItemContainer getCombinedArmorHotbarUtilityStorage()
- public CombinedItemContainer getCombinedHotbarUtilityConsumableStorage()
- public CombinedItemContainer getCombinedEverything()
- public ItemContainer getContainerForItemPickup(Item item, PlayerSettings playerSettings)
- public ItemContainer getContainerForItemPickup(Item item, PlayerSettings playerSettings, PickupLocation overridePickupLocation)
- public void setActiveSlot(int inventorySectionId, byte slot)
- public byte getActiveSlot(int inventorySectionId)
- public byte getActiveHotbarSlot()
- public void setActiveHotbarSlot(byte slot)
- public ItemStack getActiveHotbarItem()
- public ItemStack getActiveToolItem()
- public ItemStack getItemInHand()
- public byte getActiveUtilitySlot()
- public void setActiveUtilitySlot(byte slot)
- public ItemStack getUtilityItem()
- public byte getActiveToolsSlot()
- public void setActiveToolsSlot(byte slot)
- public ItemStack getToolsItem()
- public ItemContainer getSectionById(int id)
- public boolean consumeIsDirty()
- public boolean consumeNeedsSaving()
- public void setEntity(LivingEntity entity)
- public void sortStorage(SortType type)
- public void setSortType(SortType type)
- public boolean containsBrokenItem()
- public UpdatePlayerInventory toPacket()
- public void doMigration(Function<String, String> blockMigration)
- public void setUsingToolsItem(boolean value)
- public boolean usingToolsItem()
- public static Inventory ensureCapacity(Inventory inventory, List<ItemStack> remainder)
- public void unregister()
- public void markChanged()

## Inner Types

- Inventory.ItemPickupType | enum | Pickup types: `PASSIVE`, `INTERACTION

Also in this package: ItemContext, ItemPickupType, ItemStack, MaterialQuantity, Metadata, ResourceQuantity

Complete API:
  protected void registerChangeEvents()
  private void registerBackpackListener()
  public void unregister()
  private void unregisterBackpackChange()
  public void markChanged()
  public void moveItem(int fromSectionId, int fromSlotId, int quantity, int toSectionId, int toSlotId)
  public void smartMoveItem(int fromSectionId, int fromSlotId, int quantity, SmartMoveType moveType, PlayerSettings settings)
  private boolean tryEquipArmorPart(ItemStack itemStack, int fromSectionId, short fromSlotId, int quantity, ItemContainer targetContainer, boolean forceEquip)
  private MoveTransaction<ItemStackTransaction> moveItemFromCheckToInventory(ItemStack itemStack, ItemContainer targetContainer, short fromSlotId, int quantity, PlayerSettings settings)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> takeAll(int inventorySectionId, PlayerSettings settings)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> takeAllWithPriority(ItemContainer fromContainer, PlayerSettings settings)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> putAll(int inventorySectionId)
  public ListTransaction<MoveTransaction<ItemStackTransaction>> quickStack(int inventorySectionId)
  public List<ItemStack> dropAllItemStacks()
  public void clear()
  public ItemContainer getStorage()
  public ItemContainer getArmor()
  public ItemContainer getHotbar()
  public ItemContainer getUtility()
  public ItemContainer getTools()
  public ItemContainer getBackpack()
  public void resizeBackpack(short capacity, List<ItemStack> remainder)
  public CombinedItemContainer getCombinedHotbarFirst()
  public CombinedItemContainer getCombinedStorageFirst()
  public CombinedItemContainer getCombinedBackpackStorageHotbar()
  public CombinedItemContainer getCombinedBackpackStorageHotbarFirst()
  public CombinedItemContainer getCombinedArmorHotbarUtilityStorage()
  public CombinedItemContainer getCombinedHotbarUtilityConsumableStorage()
  public CombinedItemContainer getCombinedEverything()
  private ItemContainer getItemContainerForPickupLocation(PickupLocation pickupLocation)
  public ItemContainer getContainerForItemPickup(Item item, PlayerSettings playerSettings)
  public ItemContainer getContainerForItemPickup(Item item, PlayerSettings playerSettings, PickupLocation overridePickupLocation)
  public void setActiveSlot(int inventorySectionId, byte slot)
  public byte getActiveSlot(int inventorySectionId)
  public byte getActiveHotbarSlot()
  public void setActiveHotbarSlot(byte slot)
  public ItemStack getActiveHotbarItem()
  public ItemStack getActiveToolItem()
  public ItemStack getItemInHand()
  public byte getActiveUtilitySlot()
  public void setActiveUtilitySlot(byte slot)
  public ItemStack getUtilityItem()
  public byte getActiveToolsSlot()
  public void setActiveToolsSlot(byte slot)
  public ItemStack getToolsItem()
  public ItemContainer getSectionById(int id)
  public boolean consumeIsDirty()
  public boolean consumeNeedsSaving()
  public void setEntity(LivingEntity entity)
  public void sortStorage(SortType type)
  public void setSortType(SortType type)
  public boolean containsBrokenItem()
  public UpdatePlayerInventory toPacket()
  public void doMigration(Function<String,String> blockMigration)
  private void postDecode()
  private void buildCombinedContains()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Inventory ensureCapacity(Inventory inventory, List<ItemStack> remainder)
  public void setUsingToolsItem(boolean value)
  public boolean usingToolsItem()

Fields:
public static final short DEFAULT_HOTBAR_CAPACITY
public static final short DEFAULT_UTILITY_CAPACITY
public static final short DEFAULT_TOOLS_CAPACITY
public static final short DEFAULT_ARMOR_CAPACITY
public static final short DEFAULT_STORAGE_ROWS
public static final short DEFAULT_STORAGE_COLUMNS
public static final short DEFAULT_STORAGE_CAPACITY
public static final int HOTBAR_SECTION_ID
public static final int STORAGE_SECTION_ID
public static final int ARMOR_SECTION_ID
public static final int UTILITY_SECTION_ID
public static final int TOOLS_SECTION_ID
public static final int BACKPACK_SECTION_ID
public static final byte INACTIVE_SLOT_INDEX
public static final int VERSION
public static final BuilderCodec<Inventory> CODEC
private final AtomicBoolean isDirty
private final AtomicBoolean needsSaving
private ItemContainer storage
private ItemContainer armor
private ItemContainer hotbar
private ItemContainer utility
private ItemContainer tools
private ItemContainer backpack
private CombinedItemContainer combinedHotbarStorageBackpack
private CombinedItemContainer combinedHotbarFirst
private CombinedItemContainer combinedStorageFirst
private CombinedItemContainer combinedBackpackStorageHotbar
private CombinedItemContainer combinedBackpackHotbarStorage
private CombinedItemContainer combinedStorageHotbarBackpack
private CombinedItemContainer combinedArmorHotbarStorage
private CombinedItemContainer combinedArmorHotbarUtilityStorage
private CombinedItemContainer combinedHotbarUtilityConsumableStorage
private CombinedItemContainer combinedEverything
private byte activeHotbarSlot
private byte activeUtilitySlot
private byte activeToolsSlot
private LivingEntity entity
private SortType sortType
private EventRegistration armorChange
private EventRegistration storageChange
private EventRegistration hotbarChange
private EventRegistration utilityChange
private EventRegistration toolChange
private EventRegistration backpackChange
private boolean _usingToolsItem
