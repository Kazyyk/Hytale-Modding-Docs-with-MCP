---
title: "Inventory"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.Inventory"
api_surface: true
extends: null
implements:
  - "NetworkSerializable<UpdatePlayerInventory>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "inventory"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class Inventory implements NetworkSerializable<UpdatePlayerInventory>
```

Manages a living entity's item inventory. Contains multiple section containers (storage, armor, hotbar, utility, tools, backpack) and tracks the currently active slots. Dispatches `LivingEntityInventoryChangeEvent` when any section changes. Supports item movement between sections, smart-move logic based on item type and player settings, armor equipping, sorting, and serialization via `BuilderCodec`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `short` | `DEFAULT_HOTBAR_CAPACITY` | `9` |
| `public static final` | `short` | `DEFAULT_UTILITY_CAPACITY` | `4` |
| `public static final` | `short` | `DEFAULT_TOOLS_CAPACITY` | `23` |
| `public static final` | `short` | `DEFAULT_ARMOR_CAPACITY` | `(short)ItemArmorSlot.VALUES.length` |
| `public static final` | `short` | `DEFAULT_STORAGE_ROWS` | `4` |
| `public static final` | `short` | `DEFAULT_STORAGE_COLUMNS` | `9` |
| `public static final` | `short` | `DEFAULT_STORAGE_CAPACITY` | `36` |
| `public static final` | `int` | `HOTBAR_SECTION_ID` | `-1` |
| `public static final` | `int` | `STORAGE_SECTION_ID` | `-2` |
| `public static final` | `int` | `ARMOR_SECTION_ID` | `-3` |
| `public static final` | `int` | `UTILITY_SECTION_ID` | `-5` |
| `public static final` | `int` | `TOOLS_SECTION_ID` | `-8` |
| `public static final` | `int` | `BACKPACK_SECTION_ID` | `-9` |
| `public static final` | `byte` | `INACTIVE_SLOT_INDEX` | `-1` |
| `public static final` | `int` | `VERSION` | `4` |
| `public static final` | `BuilderCodec<Inventory>` | `CODEC` | |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `moveItem(int fromSectionId, int fromSlotId, int quantity, int toSectionId, int toSlotId)` |
| `public` | `void` | `smartMoveItem(int fromSectionId, int fromSlotId, int quantity, SmartMoveType moveType, PlayerSettings settings)` |
| `public` | `ListTransaction<MoveTransaction<ItemStackTransaction>>` | `takeAll(int inventorySectionId, PlayerSettings settings)` |
| `public` | `ListTransaction<MoveTransaction<ItemStackTransaction>>` | `takeAllWithPriority(ItemContainer fromContainer, PlayerSettings settings)` |
| `public` | `ListTransaction<MoveTransaction<ItemStackTransaction>>` | `putAll(int inventorySectionId)` |
| `public` | `ListTransaction<MoveTransaction<ItemStackTransaction>>` | `quickStack(int inventorySectionId)` |
| `public` | `List<ItemStack>` | `dropAllItemStacks()` |
| `public` | `void` | `clear()` |
| `public` | `ItemContainer` | `getStorage()` |
| `public` | `ItemContainer` | `getArmor()` |
| `public` | `ItemContainer` | `getHotbar()` |
| `public` | `ItemContainer` | `getUtility()` |
| `public` | `ItemContainer` | `getTools()` |
| `public` | `ItemContainer` | `getBackpack()` |
| `public` | `void` | `resizeBackpack(short capacity, List<ItemStack> remainder)` |
| `public` | `CombinedItemContainer` | `getCombinedHotbarFirst()` |
| `public` | `CombinedItemContainer` | `getCombinedStorageFirst()` |
| `public` | `CombinedItemContainer` | `getCombinedBackpackStorageHotbar()` |
| `public` | `CombinedItemContainer` | `getCombinedBackpackStorageHotbarFirst()` |
| `public` | `CombinedItemContainer` | `getCombinedArmorHotbarUtilityStorage()` |
| `public` | `CombinedItemContainer` | `getCombinedHotbarUtilityConsumableStorage()` |
| `public` | `CombinedItemContainer` | `getCombinedEverything()` |
| `public` | `ItemContainer` | `getContainerForItemPickup(Item item, PlayerSettings playerSettings)` |
| `public` | `ItemContainer` | `getContainerForItemPickup(Item item, PlayerSettings playerSettings, PickupLocation overridePickupLocation)` |
| `public` | `void` | `setActiveSlot(int inventorySectionId, byte slot)` |
| `public` | `byte` | `getActiveSlot(int inventorySectionId)` |
| `public` | `byte` | `getActiveHotbarSlot()` |
| `public` | `void` | `setActiveHotbarSlot(byte slot)` |
| `public` | `ItemStack` | `getActiveHotbarItem()` |
| `public` | `ItemStack` | `getActiveToolItem()` |
| `public` | `ItemStack` | `getItemInHand()` |
| `public` | `byte` | `getActiveUtilitySlot()` |
| `public` | `void` | `setActiveUtilitySlot(byte slot)` |
| `public` | `ItemStack` | `getUtilityItem()` |
| `public` | `byte` | `getActiveToolsSlot()` |
| `public` | `void` | `setActiveToolsSlot(byte slot)` |
| `public` | `ItemStack` | `getToolsItem()` |
| `public` | `ItemContainer` | `getSectionById(int id)` |
| `public` | `boolean` | `consumeIsDirty()` |
| `public` | `boolean` | `consumeNeedsSaving()` |
| `public` | `void` | `setEntity(LivingEntity entity)` |
| `public` | `void` | `sortStorage(SortType type)` |
| `public` | `void` | `setSortType(SortType type)` |
| `public` | `boolean` | `containsBrokenItem()` |
| `public` | `UpdatePlayerInventory` | `toPacket()` |
| `public` | `void` | `doMigration(Function<String, String> blockMigration)` |
| `public` | `void` | `setUsingToolsItem(boolean value)` |
| `public` | `boolean` | `usingToolsItem()` |
| `public static` | `Inventory` | `ensureCapacity(Inventory inventory, List<ItemStack> remainder)` |
| `public` | `void` | `unregister()` |
| `public` | `void` | `markChanged()` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `Inventory.ItemPickupType` | enum | Pickup types: `PASSIVE`, `INTERACTION` |
