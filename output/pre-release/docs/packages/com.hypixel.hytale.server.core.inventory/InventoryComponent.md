---
title: "InventoryComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:38Z"
tags:
  - "inventory"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public abstract class InventoryComponent implements Component<EntityStore>
```

Abstract base for all inventory section components (hotbar, storage, armor, utility, tools, backpack). Each concrete subclass represents one inventory section attached to an entity via the ECS. Manages dirty tracking, change event registration, and codec-based serialization. Provides static helper methods to retrieve combined inventory views across multiple sections.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `byte` | `INACTIVE_SLOT_INDEX` | `-1` |
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

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<InventoryComponent>` | `CODEC` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `HOTBAR_STORAGE_BACKPACK` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `HOTBAR_FIRST` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `STORAGE_FIRST` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `BACKPACK_STORAGE_HOTBAR` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `BACKPACK_HOTBAR_STORAGE` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `STORAGE_HOTBAR_BACKPACK` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `ARMOR_HOTBAR_UTILITY_STORAGE` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `HOTBAR_UTILITY_CONSUMABLE_STORAGE` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>[]` | `EVERYTHING` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `InventoryComponent()` |
| `public` | `InventoryComponent(short capacity)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `ensureCapacity(short capacity, List<ItemStack> remainder)` |
| `public` | `void` | `markDirty()` |
| `public` | `boolean` | `consumeIsDirty()` |
| `public` | `boolean` | `consumeNeedsSaving()` |
| `public` | `ItemContainer` | `getInventory()` |
| `public` | `ConcurrentLinkedQueue<ItemContainer.ItemContainerChangeEvent>` | `getChangeEvents()` |
| `public abstract` | `Component<EntityStore>` | `clone()` |
| `public static` | `void` | `setupCombined(ComponentType<EntityStore, Storage> storageInventoryComponentType, ComponentType<EntityStore, Armor> armorInventoryComponentType, ComponentType<EntityStore, Hotbar> hotbarInventoryComponentType, ComponentType<EntityStore, Utility> utilityInventoryComponentType, ComponentType<EntityStore, Backpack> backpackInventoryComponentType, ComponentType<EntityStore, Tool> toolInventoryComponentType)` |
| `public static` | `ComponentType<EntityStore, ? extends InventoryComponent>` | `getComponentTypeById(int id)` |
| `public static` | `CombinedItemContainer` | `getCombined(ComponentAccessor<EntityStore> accessor, Ref<EntityStore> ref, ComponentType<EntityStore, ? extends InventoryComponent>... types)` |
| `public static` | `CombinedItemContainer` | `getCombined(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index, ComponentType<EntityStore, ? extends InventoryComponent>... types)` |
| `public static` | `ItemStack` | `getItemInHand(ComponentAccessor<EntityStore> accessor, Ref<EntityStore> ref)` |

## Inner Classes

| Class | Description |
|---|---|
| [InventoryComponent.Armor](InventoryComponent.Armor.md) | Armor inventory section with slot filters |
| [InventoryComponent.Backpack](InventoryComponent.Backpack.md) | Resizable backpack inventory section |
| [InventoryComponent.Combined](InventoryComponent.Combined.md) | Cache for combined multi-section item containers |
| [InventoryComponent.Hotbar](InventoryComponent.Hotbar.md) | Hotbar inventory section with active slot tracking |
| [InventoryComponent.Storage](InventoryComponent.Storage.md) | Main storage inventory section |
| [InventoryComponent.Tool](InventoryComponent.Tool.md) | Tool inventory section with active slot and wielding state |
| [InventoryComponent.Utility](InventoryComponent.Utility.md) | Utility inventory section with slot filters and active slot |

## Relationships

- Implements `Component<EntityStore>`
- Change events dispatched as [InventoryChangeEvent](InventoryChangeEvent.md) by [InventorySystems](InventorySystems.md)
