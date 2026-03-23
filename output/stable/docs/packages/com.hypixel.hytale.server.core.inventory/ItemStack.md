---
title: "ItemStack"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.ItemStack"
api_surface: true
extends: null
implements:
  - "NetworkSerializable<ItemWithAllMetadata>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "inventory"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class ItemStack implements NetworkSerializable<ItemWithAllMetadata>
```

Represents a quantity of a specific item, with durability tracking and optional BSON metadata. Instances are immutable-by-convention: mutating methods like `withQuantity()` and `withDurability()` return new instances. Supports codec-based serialization and network packet conversion.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ItemStack[]` | `EMPTY_ARRAY` |
| `public static final` | `BuilderCodec<ItemStack>` | `CODEC` |
| `public static final` | `ItemStack` | `EMPTY` |

## Constructors

| Signature |
|---|
| `ItemStack(String itemId, int quantity, BsonDocument metadata)` |
| `ItemStack(String itemId, int quantity, double durability, double maxDurability, BsonDocument metadata)` |
| `ItemStack(String itemId)` |
| `ItemStack(String itemId, int quantity)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getItemId()` |
| `public` | `int` | `getQuantity()` |
| `public` | `BsonDocument` | `getMetadata()` |
| `public` | `boolean` | `isUnbreakable()` |
| `public` | `boolean` | `isBroken()` |
| `public` | `double` | `getMaxDurability()` |
| `public` | `double` | `getDurability()` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `boolean` | `getOverrideDroppedItemAnimation()` |
| `public` | `void` | `setOverrideDroppedItemAnimation(boolean b)` |
| `public` | `String` | `getBlockKey()` |
| `public` | `Item` | `getItem()` |
| `public` | `boolean` | `isValid()` |
| `public` | `ItemStack` | `withDurability(double durability)` |
| `public` | `ItemStack` | `withMaxDurability(double maxDurability)` |
| `public` | `ItemStack` | `withIncreasedDurability(double inc)` |
| `public` | `ItemStack` | `withRestoredDurability(double maxDurability)` |
| `public` | `ItemStack` | `withState(String state)` |
| `public` | `ItemStack` | `withQuantity(int quantity)` |
| `public` | `ItemStack` | `withMetadata(BsonDocument metadata)` |
| `public` | `<T> ItemStack` | `withMetadata(KeyedCodec<T> keyedCodec, T data)` |
| `public` | `<T> ItemStack` | `withMetadata(String key, Codec<T> codec, T data)` |
| `public` | `ItemStack` | `withMetadata(String key, BsonValue bsonValue)` |
| `public` | `ItemWithAllMetadata` | `toPacket()` |
| `public` | `boolean` | `isStackableWith(ItemStack itemStack)` |
| `public` | `boolean` | `isEquivalentType(ItemStack itemStack)` |
| `public` | `<T> T` | `getFromMetadataOrNull(KeyedCodec<T> keyedCodec)` |
| `public` | `<T> T` | `getFromMetadataOrNull(String key, Codec<T> codec)` |
| `public` | `<T> T` | `getFromMetadataOrDefault(String key, BuilderCodec<T> codec)` |
| `public static` | `boolean` | `isEmpty(ItemStack itemFrom)` |
| `public static` | `boolean` | `isStackableWith(ItemStack a, ItemStack b)` |
| `public static` | `boolean` | `isEquivalentType(ItemStack a, ItemStack b)` |
| `public static` | `boolean` | `isSameItemType(ItemStack a, ItemStack b)` |
| `public static` | `ItemStack` | `fromPacket(ItemQuantity packet)` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `ItemStack.Metadata` | class | Contains the `BLOCK_STATE` metadata key constant |
