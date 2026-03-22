---
title: "SwitchHotbarBlockSet"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.inventory"
fqcn: "com.hypixel.hytale.protocol.packets.inventory.SwitchHotbarBlockSet"
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
public class SwitchHotbarBlockSet implements Packet, ToServerPacket
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
| `public` | `String` | `itemId` |
| `` | `SwitchHotbarBlockSet` | `obj` |
| `` | `byte` | `nullBits` |
| `` | `int` | `pos` |
| `` | `int` | `itemIdLen` |
| `` | `int` | `itemIdVarLen` |
| `` | `int` | `sl` |
| `` | `int` | `size` |
| `` | `SwitchHotbarBlockSet` | `copy` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SwitchHotbarBlockSet()` |
| `public` | `SwitchHotbarBlockSet(@Nullable String itemId)` |
| `public` | `SwitchHotbarBlockSet(@Nonnull SwitchHotbarBlockSet other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getId()` |
| `public` | `NetworkChannel` | `getChannel()` |
| `public static` | `SwitchHotbarBlockSet` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `` | `public static int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `` | `public static ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `` | `public SwitchHotbarBlockSet` | `clone()` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
