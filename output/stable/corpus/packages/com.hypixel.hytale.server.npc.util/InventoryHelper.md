# InventoryHelper

Type: class | Package: com.hypixel.hytale.server.npc.util

public class InventoryHelper

Static utility class for NPC inventory management. Provides methods for finding items by pattern/name, checking hotbar/inventory contents, equipping items, and managing armor slots.

## Key Methods

- public static boolean matchesItem(String pattern, ItemStack itemStack)
- public static boolean matchesItem(List<String> patterns, ItemStack itemStack)
- public static boolean itemKeyExists(String name)
- public static boolean itemKeyIsBlockType(String name)
- public static boolean itemDropListKeyExists(String name)
- public static byte findHotbarSlotWithItem(Inventory inventory, String name)
- public static short findHotbarSlotWithItem(Inventory inventory, List<String> name)
- public static byte findHotbarEmptySlot(Inventory inventory)
- public static short findInventorySlotWithItem(Inventory inventory, String name)
- public static short findInventorySlotWithItem(Inventory inventory, List<String> name)
- public static int countItems(ItemContainer container, List<String> name)
- public static int countFreeSlots(ItemContainer container)
- public static boolean hotbarContainsItem(Inventory inventory, String name)
- public static boolean hotbarContainsItem(Inventory inventory, List<String> name)
- public static boolean holdsItem(Inventory inventory, String name)
- public static boolean containsItem(Inventory inventory, String name)
- public static boolean containsItem(Inventory inventory, List<String> name)
- public static boolean clearItemInHand(Inventory inventory, byte slotHint)
- public static void removeItemInHand(Inventory inventory, int count)
- public static boolean checkHotbarSlot(Inventory inventory, byte slot)

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 3 more)

Complete API:
  public static boolean matchesItem(String pattern, ItemStack itemStack)
  public static boolean matchesItem(List<String> patterns, ItemStack itemStack)
  protected static boolean matchesPatterns(List<String> patterns, String name)
  public static boolean itemKeyExists(String name)
  public static boolean itemKeyIsBlockType(String name)
  public static boolean itemDropListKeyExists(String name)
  public static byte findHotbarSlotWithItem(Inventory inventory, String name)
  public static short findHotbarSlotWithItem(Inventory inventory, List<String> name)
  public static byte findHotbarEmptySlot(Inventory inventory)
  public static short findInventorySlotWithItem(Inventory inventory, String name)
  public static short findInventorySlotWithItem(Inventory inventory, List<String> name)
  public static int countItems(ItemContainer container, List<String> name)
  public static int countFreeSlots(ItemContainer container)
  public static boolean hotbarContainsItem(Inventory inventory, String name)
  public static boolean hotbarContainsItem(Inventory inventory, List<String> name)
  public static boolean holdsItem(Inventory inventory, String name)
  public static boolean containsItem(Inventory inventory, String name)
  public static boolean containsItem(Inventory inventory, List<String> name)
  public static boolean clearItemInHand(Inventory inventory, byte slotHint)
  public static void removeItemInHand(Inventory inventory, int count)
  public static boolean checkHotbarSlot(Inventory inventory, byte slot)
  public static boolean checkOffHandSlot(Inventory inventory, byte slot)
  public static void setHotbarSlot(Inventory inventory, byte slot)
  public static void setOffHandSlot(Inventory inventory, byte slot)
  public static boolean setHotbarItem(Inventory inventory, String name, byte slot)
  public static boolean setOffHandItem(Inventory inventory, String name, byte slot)
  public static boolean useItem(Inventory inventory, String name, byte slotHint)
  public static ItemStack createItem(String name)
  public static boolean useItem(Inventory inventory, String name)
  public static boolean useArmor(ItemContainer armorInventory, String armorItem)
  public static boolean useArmor(ItemContainer armorInventory, ItemStack itemStack)

Fields:
public static final short DEFAULT_NPC_HOTBAR_SLOTS
public static final short MAX_NPC_HOTBAR_SLOTS
public static final short DEFAULT_NPC_INVENTORY_SLOTS
public static final short DEFAULT_NPC_UTILITY_SLOTS
public static final short MAX_NPC_UTILITY_SLOTS
public static final short DEFAULT_NPC_TOOL_SLOTS
public static final short MAX_NPC_INVENTORY_SLOTS
