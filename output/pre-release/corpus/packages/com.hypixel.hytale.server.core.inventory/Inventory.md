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

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public void unregister()
  public void moveItem(int fromSectionId, int fromSlotId, int quantity, int toSectionId, int toSlotId)
  public void smartMoveItem(Ref<EntityStore> ref, int fromSectionId, int fromSlotId, int quantity, SmartMoveType moveType, PlayerSettings settings, ComponentAccessor<EntityStore> accessor)
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
  public CombinedItemContainer getCombinedHotbarFirst()
  public CombinedItemContainer getCombinedStorageFirst()
  public CombinedItemContainer getCombinedBackpackStorageHotbar()
  public CombinedItemContainer getCombinedBackpackStorageHotbarFirst()
  public CombinedItemContainer getCombinedArmorHotbarUtilityStorage()
  public CombinedItemContainer getCombinedHotbarUtilityConsumableStorage()
  public CombinedItemContainer getCombinedStorageHotbarBackpack()
  private ItemContainer getItemContainerForPickupLocation(PickupLocation pickupLocation)
  public ItemContainer getContainerForItemPickup(Item item, PlayerSettings playerSettings)
  public ItemContainer getContainerForItemPickup(Item item, PlayerSettings playerSettings, PickupLocation overridePickupLocation)
  public void setActiveSlot(Ref<EntityStore> ref, int inventorySectionId, byte slot, ComponentAccessor<EntityStore> componentAccessor)
  public void setActiveSlot(Holder<EntityStore> holder, int inventorySectionId, byte slot)
  public byte getActiveSlot(int inventorySectionId)
  public byte getActiveHotbarSlot()
  public void setActiveHotbarSlot(Ref<EntityStore> ref, byte slot, ComponentAccessor<EntityStore> componentAccessor)
  public ItemStack getActiveHotbarItem()
  public ItemStack getActiveToolItem()
  public ItemStack getItemInHand()
  public byte getActiveUtilitySlot()
  public void setActiveUtilitySlot(Ref<EntityStore> ref, byte slot, ComponentAccessor<EntityStore> componentAccessor)
  public void setActiveUtilitySlot(Holder<EntityStore> holder, byte slot)
  public ItemStack getUtilityItem()
  public byte getActiveToolsSlot()
  public void setActiveToolsSlot(Ref<EntityStore> ref, byte slot, ComponentAccessor<EntityStore> componentAccessor)
  public ItemStack getToolsItem()
  public ItemContainer getSectionById(int id)
  public void setEntity(LivingEntity entity)
  public void sortStorage()
  public static boolean containsBrokenItem(Ref<EntityStore> ref, ComponentAccessor<EntityStore> accessor)
  public void migrateToComponents(Holder<EntityStore> holder)
  public void backwardsCompatHook(Holder<EntityStore> holder)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
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
private ItemContainer deserializedStorage
private ItemContainer deserializedArmor
private ItemContainer deserializedHotbar
private ItemContainer deserializedUtility
private ItemContainer deserializedTools
private ItemContainer deserializedBackpack
private byte deserializedActiveHotbarSlot
private byte deserializedActiveUtilitySlot
private byte deserializedActiveToolsSlot
private InventoryComponent.Storage storage
private InventoryComponent.Armor armor
private InventoryComponent.Hotbar hotbar
private InventoryComponent.Utility utility
private InventoryComponent.Tool tools
private InventoryComponent.Backpack backpack
private LivingEntity entity
