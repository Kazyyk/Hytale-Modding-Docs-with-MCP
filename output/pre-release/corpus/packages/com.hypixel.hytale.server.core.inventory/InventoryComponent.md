# InventoryComponent

Type: class | Package: com.hypixel.hytale.server.core.inventory | Implements: Component<EntityStore>

public abstract class InventoryComponent implements Component<EntityStore>

Abstract base for all inventory section components (hotbar, storage, armor, utility, tools, backpack). Each concrete subclass represents one inventory section attached to an entity via the ECS. Manages dirty tracking, change event registration, and codec-based serialization. Provides static helper methods to retrieve combined inventory views across multiple sections.

## Constants

- public static final byte INACTIVE_SLOT_INDEX
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

## Static Fields

- public static final BuilderCodec<InventoryComponent> CODEC
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] HOTBAR_STORAGE_BACKPACK
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] HOTBAR_FIRST
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] STORAGE_FIRST
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] BACKPACK_STORAGE_HOTBAR
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] BACKPACK_HOTBAR_STORAGE
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] STORAGE_HOTBAR_BACKPACK
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] ARMOR_HOTBAR_UTILITY_STORAGE
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] HOTBAR_UTILITY_CONSUMABLE_STORAGE
- public static ComponentType<EntityStore, ? extends InventoryComponent>[] EVERYTHING

## Constructors

- public InventoryComponent()
- public InventoryComponent(short capacity)

## Methods

- public void ensureCapacity(short capacity, List<ItemStack> remainder)
- public void markDirty()
- public boolean consumeIsDirty()
- public boolean consumeNeedsSaving()
- public ItemContainer getInventory()
- public ConcurrentLinkedQueue<ItemContainer.ItemContainerChangeEvent> getChangeEvents()
- public abstract Component<EntityStore> clone()
- public static void setupCombined(ComponentType<EntityStore, Storage> storageInventoryComponentType, ComponentType<EntityStore, Armor> armorInventoryComponentType, ComponentType<EntityStore, Hotbar> hotbarInventoryComponentType, ComponentType<EntityStore, Utility> utilityInventoryComponentType, ComponentType<EntityStore, Backpack> backpackInventoryComponentType, ComponentType<EntityStore, Tool> toolInventoryComponentType)
- public static ComponentType<EntityStore, ? extends InventoryComponent> getComponentTypeById(int id)
- public static CombinedItemContainer getCombined(ComponentAccessor<EntityStore> accessor, Ref<EntityStore> ref, ComponentType<EntityStore, ? extends InventoryComponent>... types)
- public static CombinedItemContainer getCombined(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index, ComponentType<EntityStore, ? extends InventoryComponent>... types)
- public static ItemStack getItemInHand(ComponentAccessor<EntityStore> accessor, Ref<EntityStore> ref)

## Inner Classes

- InventoryComponent.Armor | Armor inventory section with slot filters
- InventoryComponent.Backpack | Resizable backpack inventory section
- InventoryComponent.Combined | Cache for combined multi-section item containers
- InventoryComponent.Hotbar | Hotbar inventory section with active slot tracking
- InventoryComponent.Storage | Main storage inventory section
- InventoryComponent.Tool | Tool inventory section with active slot and wielding state
- InventoryComponent.Utility | Utility inventory section with slot filters and active slot

## Relationships

- Implements `Component<EntityStore>`
- Change events dispatched as InventoryChangeEvent by InventorySystems
