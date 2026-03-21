---
title: "SetCreativeItem"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.inventory"
fqcn: "com.hypixel.hytale.protocol.packets.inventory.SetCreativeItem"
api_surface: false
extends: "null"
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packets"
  - "inventory"
  - "class"
---

**Package:** `com.hypixel.hytale.protocol.packets.inventory`

```java
public class SetCreativeItem implements Packet, ToServerPacket
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `PACKET_ID` |
| `public static final` | `boolean` | `IS_COMPRESSED` |
| `public static final` | `int` | `NULLABLE_BIT_FIELD_SIZE` |
| `public static final` | `int` | `FIXED_BLOCK_SIZE` |
| `public static final` | `int` | `VARIABLE_FIELD_COUNT` |
| `public static final` | `int` | `VARIABLE_BLOCK_START` |
| `public static final` | `int` | `MAX_SIZE` |
| `public` | `int` | `inventorySectionId` |
| `public` | `int` | `slotId` |
| `public` | `ItemQuantity` | `item` |
| `public` | `boolean` | `override` |
| `` | `SetCreativeItem` | `obj` |
| `` | `int` | `pos` |
| `` | `int` | `size` |
| `` | `ValidationResult` | `itemResult` |
| `` | `SetCreativeItem` | `copy` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SetCreativeItem()` |
| `public` | `SetCreativeItem(int inventorySectionId, int slotId, @Nonnull ItemQuantity item, boolean override)` |
| `public` | `SetCreativeItem(@Nonnull SetCreativeItem other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getId()` |
| `public` | `NetworkChannel` | `getChannel()` |
| `public static` | `SetCreativeItem` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `` | `public static int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `` | `public static ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `` | `public SetCreativeItem` | `clone()` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
