---
title: "ItemStackItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.ItemStackItemContainer"
api_surface: false
extends: "ItemContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "nested"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class ItemStackItemContainer extends ItemContainer
```

A container whose storage lives inside an `ItemStack`'s BSON metadata in a parent container. When slots change, the modified item array is written back into the parent item stack's metadata. This enables items such as bags or pouches to hold other items.

Thread safety is provided by a `ReentrantReadWriteLock`. Does not support `clone()` -- throws `UnsupportedOperationException`.

## Fields

| Type | Name | Description |
|---|---|---|
| `ItemContainer` | `parentContainer` | The parent container holding the item stack that stores this container's data. |
| `short` | `itemStackSlot` | The slot in the parent container that holds the backing item stack. |
| `ItemStack` | `originalItemStack` | The original item stack used to verify the backing item has not changed. |
| `short` | `capacity` | The number of slots in this nested container. |
| `ItemStack[]` | `items` | The item array stored in the item stack's metadata. |

## Methods

```java
public ItemContainer getParentContainer()
```

Returns the parent container.

```java
public short getItemStackSlot()
```

Returns the slot index in the parent container.

```java
public ItemStack getOriginalItemStack()
```

Returns the original item stack reference.

```java
public boolean isItemStackValid()
```

Returns `true` if the item stack in the parent container still matches the original.

```java
@Nullable
public static ItemStackItemContainer getContainer(@Nonnull ItemContainer itemContainer, short slot)
```

Reads an existing nested container from the item stack at the given slot. Returns `null` if the item stack has no container metadata.

```java
@Nonnull
public static ItemStackItemContainer makeContainerWithCapacity(@Nonnull ItemContainer itemContainer, short slot, short capacity)
```

Creates a new nested container in the item stack at the given slot. Throws `IllegalStateException` if a container already exists.

```java
@Nullable
public static ItemStackItemContainer ensureContainer(@Nonnull ItemContainer itemContainer, short slot, short capacity)
```

Returns the existing nested container if present, otherwise creates one.

```java
@Nullable
public static ItemStackItemContainer ensureConfiguredContainer(@Nonnull ItemContainer itemContainer, short slot, @Nonnull ItemStackContainerConfig config)
```

Ensures a nested container exists and applies global filter and tag filters from the given config.

```java
public static void writeToItemStack(@Nonnull ItemContainer itemContainer, short slot, ItemStack originalItemStack, ItemStack[] items)
```

Writes the items array back into the item stack's BSON metadata.
