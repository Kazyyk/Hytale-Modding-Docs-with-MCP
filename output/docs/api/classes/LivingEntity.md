---
title: "LivingEntity"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
api_surface: "public"
extends:
  - "Entity"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - "entity"
  - "class"
---

> Package: `com.hypixel.hytale.server.core.entity`

```java
public abstract class LivingEntity extends Entity
```

Abstract base class for entities that are "alive" -- entities with health, inventories, stat modifiers, and fall damage mechanics. Extends [Entity](Entity.md) with inventory management, item durability tracking, breathing logic, and stat modifier infrastructure.

[Player](Player.md) is the primary concrete subclass. NPC and mob entity types also extend `LivingEntity`.

## Methods

### Inventory

```java
protected abstract Inventory createDefaultInventory();
```

Creates the default inventory for this entity type. Each subclass defines its own inventory layout and capacity. Called during entity initialization when no saved inventory data is available.

```java
public Inventory getInventory()
```

Returns this entity's current inventory.

```java
@Nonnull
public Inventory setInventory(Inventory inventory)
```

Replaces this entity's inventory with the given inventory. Returns the previous inventory.

```java
@Nonnull
public Inventory setInventory(Inventory inventory, boolean ensureCapacity)
```

Replaces this entity's inventory. When `ensureCapacity` is `true`, the new inventory is validated to have at least the capacity required by this entity type. Returns the previous inventory.

### Breathing

```java
public boolean canBreathe(@Nonnull Ref<EntityStore> ref, @Nonnull BlockMaterial breathingMaterial, int fluidId, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns whether this entity can breathe in the given material and fluid context. Used by the suffocation/drowning system to determine whether the entity should take breathing damage. The default implementation checks the entity's breathing capabilities against the block material at its head position.

### Item Durability

```java
public boolean canDecreaseItemStackDurability(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns whether this entity's item usage should consume durability. Some game modes or entity states may disable durability loss.

```java
@Nullable
public ItemStackSlotTransaction decreaseItemStackDurability(@Nonnull Ref<EntityStore> ref, @Nullable ItemStack itemStack, int inventoryId, int slotId, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Decreases the durability of the item stack at the specified inventory slot. Returns an `ItemStackSlotTransaction` representing the change, or `null` if durability could not be decreased (item is null, entity cannot decrease durability, or item has no durability).

```java
@Nullable
public ItemStackSlotTransaction updateItemStackDurability(@Nonnull Ref<EntityStore> ref, @Nonnull ItemStack itemStack, ItemContainer container, int slotId, double durabilityChange, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Applies a durability change (positive or negative) to the given item stack. Handles item breaking when durability reaches zero. Returns an `ItemStackSlotTransaction` representing the change, or `null` if the update could not be applied.

### Stat Modifiers

```java
@Nonnull
public StatModifiersManager getStatModifiersManager()
```

Returns the stat modifiers manager for this entity. `StatModifiersManager` tracks active stat modifiers (e.g., speed boosts, damage buffs, resistance effects) and computes effective stat values by combining base stats with active modifiers.

### Fall Damage

```java
public double getCurrentFallDistance()
```

Returns the current accumulated fall distance in blocks. Fall distance accumulates while the entity is falling and resets when the entity lands. Used by the fall damage system to calculate damage on landing. The damage calculation considers the entity's stat modifiers (e.g., fall damage resistance).

## Serialization

`LivingEntity` has a `BuilderCodec` CODEC that extends `Entity.CODEC` with additional fields for inventory state, stat modifiers, and fall distance tracking.

## Related Types

- [Entity](Entity.md) -- parent class providing identity, lifecycle, and world membership
- [Player](Player.md) -- concrete player entity extending `LivingEntity`
- `Inventory` -- container for the entity's items
- `ItemStack` -- a stack of items within an inventory
- `ItemStackSlotTransaction` -- records an inventory slot mutation for durability changes
- `ItemContainer` -- abstraction over inventory containers
- `BlockMaterial` -- block material used in breathing checks
- `StatModifiersManager` -- manages active stat modifiers and effective stat computation
- [Store](Store.md) -- the `EntityStore` containing this entity's component data
- [Ref](Ref.md) -- entity reference passed to most methods
- [ComponentType](ComponentType.md) -- type key for ECS component access
