---
title: "MoveItemStack"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.inventory"
fqcn: "com.hypixel.hytale.protocol.packets.inventory.MoveItemStack"
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
public class MoveItemStack implements Packet, ToServerPacket
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
| `public` | `int` | `fromSectionId` |
| `public` | `int` | `fromSlotId` |
| `public` | `int` | `quantity` |
| `public` | `int` | `toSectionId` |
| `public` | `int` | `toSlotId` |
| `` | `MoveItemStack` | `obj` |
| `` | `MoveItemStack` | `copy` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MoveItemStack()` |
| `public` | `MoveItemStack(int fromSectionId, int fromSlotId, int quantity, int toSectionId, int toSlotId)` |
| `public` | `MoveItemStack(@Nonnull MoveItemStack other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getId()` |
| `public` | `NetworkChannel` | `getChannel()` |
| `public static` | `MoveItemStack` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `` | `public static int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `` | `public static ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `` | `public MoveItemStack` | `clone()` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
