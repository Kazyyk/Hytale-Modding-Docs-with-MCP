---
title: "MaterialQuantity"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.MaterialQuantity"
api_surface: true
extends: null
implements:
  - "NetworkSerializable<com.hypixel.hytale.protocol.MaterialQuantity>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "inventory"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class MaterialQuantity implements NetworkSerializable<com.hypixel.hytale.protocol.MaterialQuantity>
```

Represents a quantity of a material identified by item ID, resource type ID, and/or item tag. Used in crafting recipes and material requirements. Can be converted to an [ItemStack](ItemStack.md) or [ResourceQuantity](ResourceQuantity.md).

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `MaterialQuantity[]` | `EMPTY_ARRAY` |
| `public static final` | `BuilderCodec<MaterialQuantity>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getItemId()` |
| `public` | `String` | `getResourceTypeId()` |
| `public` | `int` | `getTagIndex()` |
| `public` | `int` | `getQuantity()` |
| `public` | `BsonDocument` | `getMetadata()` |
| `public` | `MaterialQuantity` | `clone(int quantity)` |
| `public` | `ItemStack` | `toItemStack()` |
| `public` | `ResourceQuantity` | `toResource()` |
| `public` | `com.hypixel.hytale.protocol.MaterialQuantity` | `toPacket()` |
