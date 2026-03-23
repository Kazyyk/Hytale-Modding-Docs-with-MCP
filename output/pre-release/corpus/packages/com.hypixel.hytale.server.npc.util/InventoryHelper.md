# InventoryHelper

Type: class | Package: com.hypixel.hytale.server.npc.util

public class InventoryHelper

Static utility class for NPC inventory operations: finding items by glob pattern, managing hotbar/off-hand slot selection, creating item stacks, equipping armor, counting items, and clearing hands.

## Constants

- public static final short DEFAULT_NPC_HOTBAR_SLOTS
- public static final short MAX_NPC_HOTBAR_SLOTS
- public static final short DEFAULT_NPC_INVENTORY_SLOTS
- public static final short DEFAULT_NPC_UTILITY_SLOTS
- public static final short MAX_NPC_UTILITY_SLOTS
- public static final short DEFAULT_NPC_TOOL_SLOTS
- public static final short MAX_NPC_INVENTORY_SLOTS

## Methods

- public static boolean matchesItem(@Nullable String pattern, @Nonnull ItemStack itemStack)
- public static boolean matchesItem(@Nullable List<String> patterns, @Nonnull ItemStack itemStack)
- public static boolean itemKeyExists(@Nullable String name)
- public static boolean itemKeyIsBlockType(@Nullable String name)
- public static boolean itemDropListKeyExists(@Nullable String name)
- public static byte findHotbarSlotWithItem(@Nonnull Inventory inventory, String name)
- public static short findHotbarSlotWithItem(@Nonnull Inventory inventory, List<String> name)
- public static byte findHotbarEmptySlot(@Nonnull Inventory inventory)
- public static short findInventorySlotWithItem(@Nonnull Inventory inventory, String name)
- public static short findInventorySlotWithItem(@Nonnull Inventory inventory, List<String> name)
- public static int countItems(@Nonnull ItemContainer container, List<String> name)
- public static int countFreeSlots(@Nonnull ItemContainer container)
- public static boolean hotbarContainsItem(@Nonnull Inventory inventory, String name)
- public static boolean hotbarContainsItem(@Nonnull Inventory inventory, List<String> name)
- public static boolean holdsItem(@Nonnull Inventory inventory, String name)
- public static boolean containsItem(@Nonnull Inventory inventory, String name)
- public static boolean containsItem(@Nonnull Inventory inventory, List<String> name)
- public static boolean clearItemInHand(@Nonnull Ref<EntityStore> ref, @Nonnull Inventory inventory, byte slotHint, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void removeItemInHand(@Nonnull Inventory inventory, int count)
- public static boolean useItem(@Nonnull Ref<EntityStore> ref, @Nonnull Inventory inventory, @Nullable String name, byte slotHint, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static boolean useItem(@Nonnull Ref<EntityStore> ref, @Nonnull Inventory inventory, @Nullable String name, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static ItemStack createItem(@Nullable String name)
- public static boolean useArmor(@Nonnull ItemContainer armorInventory, @Nullable String armorItem)
- public static boolean useArmor(@Nonnull ItemContainer armorInventory, @Nullable ItemStack itemStack)
- public static void setHotbarSlot(@Nonnull Ref<EntityStore> ref, @Nonnull Inventory inventory, byte slot, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void setOffHandSlot(@Nonnull Ref<EntityStore> ref, @Nonnull Inventory inventory, byte slot, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void setOffHandSlot(@Nonnull Holder<EntityStore> holder, @Nonnull Inventory inventory, byte slot)
- public static boolean setHotbarItem(@Nonnull Inventory inventory, @Nullable String name, byte slot)
- public static boolean setOffHandItem(@Nonnull Inventory inventory, @Nullable String name, byte slot)
