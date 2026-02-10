---
title: ItemStack
kind: class
package: com.hypixel.hytale.server.core.inventory
api_surface: true
extends: ~
implements:
  - NetworkSerializable<ItemWithAllMetadata>
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - inventory
  - item
  - codec
  - serialization
  - immutable-style
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class ItemStack implements NetworkSerializable<ItemWithAllMetadata>
```

Represents a stack of items in the Hytale inventory system. `ItemStack` follows an immutable-style pattern: all `with*` methods return a new `ItemStack` instance rather than mutating the current one. This makes `ItemStack` safe to pass around without defensive copying, though the class itself is not strictly immutable (fields are `protected`, and the `BuilderCodec` mutates fields during deserialization).

Each `ItemStack` is identified by a string `itemId` that corresponds to an asset-defined item type. The special item ID `"Empty"` is reserved for the singleton `EMPTY` instance and cannot be used to construct normal stacks.

## Static Fields

### EMPTY_ARRAY

```java
@Nonnull
public static final ItemStack[] EMPTY_ARRAY = new ItemStack[0]
```

Shared empty array constant to avoid unnecessary allocations.

### CODEC

```java
@Nonnull
public static final BuilderCodec<ItemStack> CODEC
```

Serialization codec for `ItemStack`. Encodes and decodes the following keyed fields:

| Key | Codec | Validation |
|---|---|---|
| `"Id"` | `Codec.STRING` | Non-null; must pass `Item.VALIDATOR_CACHE` |
| `"Quantity"` | `Codec.INTEGER` | Greater than 0 |
| `"Durability"` | `Codec.DOUBLE` | Greater than or equal to 0.0 |
| `"MaxDurability"` | `Codec.DOUBLE` | Greater than or equal to 0.0 |
| `"Metadata"` | `Codec.BSON_DOCUMENT` | None |
| `"OverrideDroppedItemAnimation"` | `Codec.BOOLEAN` | None |

The codec uses `BuilderCodec.builder()` with a no-arg constructor, so deserialization creates an empty `ItemStack` and sets fields directly via lambda setters.

### EMPTY

```java
@Nonnull
public static final ItemStack EMPTY
```

Singleton empty item stack. Has `itemId = "Empty"`. Use `isEmpty()` to check whether an `ItemStack` is the empty sentinel.

## Constructors

### Primary Constructor

```java
public ItemStack(@Nonnull String itemId, int quantity, @Nullable BsonDocument metadata)
```

Creates an item stack with the given item ID, quantity, and optional metadata. Durability is initialized from the item's asset definition (`Item.getMaxDurability()`).

**Throws:**
- `IllegalArgumentException` if `quantity <= 0`
- `IllegalArgumentException` if `itemId` is `null`
- `IllegalArgumentException` if `itemId` equals `"Empty"`

### Full Constructor

```java
public ItemStack(@Nonnull String itemId, int quantity, double durability, double maxDurability, @Nullable BsonDocument metadata)
```

Creates an item stack with explicit durability values. Delegates to the primary constructor, then overrides `durability` and `maxDurability`.

### Convenience Constructors

```java
public ItemStack(@Nonnull String itemId)
```

Creates a stack of 1 with no metadata. Equivalent to `new ItemStack(itemId, 1, null)`.

```java
public ItemStack(@Nonnull String itemId, int quantity)
```

Creates a stack with the given quantity and no metadata. Equivalent to `new ItemStack(itemId, quantity, null)`.

## Instance Methods

### Identity and State

```java
@Nonnull
public String getItemId()
```

Returns the string item identifier (e.g., `"hytale:wooden_sword"`).

```java
public int getQuantity()
```

Returns the number of items in this stack.

```java
public boolean isEmpty()
```

Returns `true` if this is the empty sentinel (`itemId` equals `"Empty"`).

```java
@Nonnull
public Item getItem()
```

Resolves the `Item` asset definition for this stack's `itemId`. Returns `Item.UNKNOWN` if the item ID does not match any registered asset.

```java
public boolean isValid()
```

Returns `true` if this stack is empty or its item ID resolves to a known asset.

```java
@Nullable
public String getBlockKey()
```

Returns the block ID associated with this item if it has a block type (e.g., a placeable block item), `"Empty"` if the stack is empty, or `null` if the item has no associated block type.

### Durability

```java
public boolean isUnbreakable()
```

Returns `true` if `maxDurability <= 0.0`. An unbreakable item cannot be broken through durability loss.

```java
public boolean isBroken()
```

Returns `true` if the item is breakable and its durability has reached `0.0`. Always returns `false` for unbreakable items.

```java
public double getMaxDurability()
```

Returns the maximum durability value for this stack.

```java
public double getDurability()
```

Returns the current durability value.

### Immutable-Style Transformations

All `with*` methods return a new `ItemStack` instance. The original is not modified.

```java
@Nonnull
public ItemStack withDurability(double durability)
```

Returns a new stack with durability clamped to `[0.0, maxDurability]`.

```java
@Nonnull
public ItemStack withMaxDurability(double maxDurability)
```

Returns a new stack with the given max durability. Current durability is clamped to `min(durability, maxDurability)`.

```java
@Nonnull
public ItemStack withIncreasedDurability(double inc)
```

Returns a new stack with durability increased by `inc`. Internally calls `withDurability(this.durability + inc)`, so the result is clamped.

```java
@Nonnull
public ItemStack withRestoredDurability(double maxDurability)
```

Returns a new stack with both durability and max durability set to the given value. Effectively "fully repairs" the item with a new max.

```java
@Nonnull
public ItemStack withState(@Nonnull String state)
```

Returns a new stack with the item ID changed to the ID for the given state. For example, a tool item may have different item IDs for different visual states. Throws `IllegalArgumentException` if the state is not valid for this item.

```java
@Nullable
public ItemStack withQuantity(int quantity)
```

Returns a new stack with the given quantity. Returns `null` if `quantity == 0` (the stack is consumed). Returns `this` if the quantity is unchanged.

### Metadata

Metadata is stored as a `BsonDocument`. Individual metadata values can be accessed through `KeyedCodec` or raw key/codec pairs.

```java
@Nonnull
public ItemStack withMetadata(@Nullable BsonDocument metadata)
```

Returns a new stack with the given metadata document, replacing any existing metadata.

```java
@Nonnull
public <T> ItemStack withMetadata(@Nonnull KeyedCodec<T> keyedCodec, @Nullable T data)
```

Returns a new stack with the metadata value for the given `KeyedCodec` set (or removed if `data` is `null`).

```java
@Nonnull
public <T> ItemStack withMetadata(@Nonnull String key, @Nonnull Codec<T> codec, @Nullable T data)
```

Returns a new stack with the metadata value at the given key set (or removed if `data` is `null` or encodes to an empty/null BSON value). If removing the last key results in an empty document, metadata is set to `null`.

```java
@Nullable
public <T> T getFromMetadataOrNull(@Nonnull KeyedCodec<T> keyedCodec)
```

Returns the metadata value decoded by the given `KeyedCodec`, or `null` if not present.

```java
@Nullable
public <T> T getFromMetadataOrNull(@Nonnull String key, @Nonnull Codec<T> codec)
```

Returns the metadata value at the given key decoded by the given `Codec`, or `null` if not present.

### Stack Comparison

```java
public boolean isStackableWith(@Nullable ItemStack itemStack)
```

Returns `true` if this stack can be merged with the given stack. Two stacks are stackable when they have the same item ID, same durability, same max durability, and equal metadata. Quantity is not compared -- only identity and state matter.

```java
public boolean isEquivalentType(@Nullable ItemStack itemStack)
```

Returns `true` if this stack is the same "type" as the given stack. Like `isStackableWith`, but ignores durability values. Compares item ID and metadata only.

### Network Serialization

```java
public ItemWithAllMetadata toPacket()
```

Converts this stack to an `ItemWithAllMetadata` protocol packet for network transmission. The result is cached -- repeated calls return the same packet instance. The cache is invalidated implicitly because `with*` methods create new `ItemStack` instances rather than mutating this one.

### Dropped Item Animation

```java
public boolean getOverrideDroppedItemAnimation()
```

Returns whether the dropped item animation override flag is set.

```java
public void setOverrideDroppedItemAnimation(boolean b)
```

Sets the dropped item animation override flag. This is one of the few mutable operations on `ItemStack`.

## Static Methods

```java
public static boolean isEmpty(@Nullable ItemStack itemFrom)
```

Null-safe emptiness check. Returns `true` if the stack is `null` or `isEmpty()`.

```java
public static boolean isStackableWith(@Nullable ItemStack a, ItemStack b)
```

Null-safe stackability check. Returns `true` if `a == b` or `a.isStackableWith(b)`.

```java
public static boolean isEquivalentType(@Nullable ItemStack a, ItemStack b)
```

Null-safe type equivalence check. Returns `true` if `a == b` or `a.isEquivalentType(b)`.

```java
public static boolean isSameItemType(@Nullable ItemStack a, @Nullable ItemStack b)
```

Returns `true` if both stacks have the same `itemId`. Does not compare metadata, durability, or quantity.

```java
@Nullable
public static ItemStack fromPacket(@Nullable ItemQuantity packet)
```

Creates an `ItemStack` from an `ItemQuantity` protocol packet. Returns `null` if the packet is `null` or has a quantity of 0 or less.

## Inner Classes

### Metadata

```java
public static class Metadata
```

Contains metadata key constants.

| Constant | Value |
|---|---|
| `BLOCK_STATE` | `"BlockState"` |

## Equality and Hashing

`ItemStack` overrides `equals()` and `hashCode()`. Two stacks are equal when they have the same item ID, quantity, durability, max durability, and metadata. This is a stricter comparison than `isStackableWith()`, which ignores quantity.

## Related Types

- `Item` -- asset definition for item types; resolved via `getItem()`
- `BuilderCodec` -- codec framework used for serialization/deserialization
- `KeyedCodec` -- typed key for accessing individual metadata fields within the BSON document
- `Codec` -- base codec interface for encoding/decoding values
- `NetworkSerializable` -- interface for types that can be serialized to protocol packets
- `ItemWithAllMetadata` -- protocol packet type carrying full item stack data
- `ItemQuantity` -- lightweight protocol packet carrying only item ID and quantity
- `MathUtil` -- utility class providing `clamp()` used by durability methods
- [Store](Store.md) -- ECS store; inventory components on entities hold `ItemStack` instances
- [Entity](Entity.md) -- game entities that carry inventory components containing item stacks
