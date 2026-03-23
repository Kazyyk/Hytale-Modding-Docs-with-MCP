---
title: "UpdatePlayerInventory"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.inventory"
fqcn: "com.hypixel.hytale.protocol.packets.inventory.UpdatePlayerInventory"
api_surface: false
extends: "null"
implements: ["Packet", "ToClientPacket"]
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
public class UpdatePlayerInventory implements Packet, ToClientPacket
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
| `public` | `InventorySection` | `storage` |
| `public` | `InventorySection` | `armor` |
| `public` | `InventorySection` | `hotbar` |
| `public` | `InventorySection` | `utility` |
| `public` | `InventorySection` | `builderMaterial` |
| `public` | `InventorySection` | `tools` |
| `public` | `InventorySection` | `backpack` |
| `public` | `SortType` | `sortType` |
| `` | `UpdatePlayerInventory` | `obj` |
| `` | `byte` | `nullBits` |
| `` | `int` | `varPos0` |
| `` | `int` | `varPos1` |
| `` | `int` | `varPos2` |
| `` | `int` | `varPos3` |
| `` | `int` | `varPos4` |
| `` | `int` | `varPos5` |
| `` | `int` | `varPos6` |
| `` | `int` | `maxEnd` |
| `` | `int` | `fieldOffset0` |
| `` | `int` | `pos0` |
| `` | `int` | `fieldOffset1` |
| `` | `int` | `pos1` |
| `` | `int` | `fieldOffset2` |
| `` | `int` | `pos2` |
| `` | `int` | `fieldOffset3` |
| `` | `int` | `pos3` |
| `` | `int` | `fieldOffset4` |
| `` | `int` | `pos4` |
| `` | `int` | `fieldOffset5` |
| `` | `int` | `pos5` |
| `` | `int` | `fieldOffset6` |
| `` | `int` | `pos6` |
| `` | `int` | `startPos` |
| `` | `int` | `storageOffsetSlot` |
| `` | `int` | `armorOffsetSlot` |
| `` | `int` | `hotbarOffsetSlot` |
| `` | `int` | `utilityOffsetSlot` |
| `` | `int` | `builderMaterialOffsetSlot` |
| `` | `int` | `toolsOffsetSlot` |
| `` | `int` | `backpackOffsetSlot` |
| `` | `int` | `varBlockStart` |
| `` | `int` | `size` |
| `` | `int` | `storageOffset` |
| `` | `int` | `pos` |
| `` | `ValidationResult` | `storageResult` |
| `` | `int` | `armorOffset` |
| `` | `int` | `posx` |
| `` | `ValidationResult` | `armorResult` |
| `` | `int` | `hotbarOffset` |
| `` | `int` | `posxx` |
| `` | `ValidationResult` | `hotbarResult` |
| `` | `int` | `utilityOffset` |
| `` | `int` | `posxxx` |
| `` | `ValidationResult` | `utilityResult` |
| `` | `int` | `builderMaterialOffset` |
| `` | `int` | `posxxxx` |
| `` | `ValidationResult` | `builderMaterialResult` |
| `` | `int` | `toolsOffset` |
| `` | `int` | `posxxxxx` |
| `` | `ValidationResult` | `toolsResult` |
| `` | `int` | `backpackOffset` |
| `` | `int` | `posxxxxxx` |
| `` | `ValidationResult` | `backpackResult` |
| `` | `UpdatePlayerInventory` | `copy` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UpdatePlayerInventory()` |
| `public` | `UpdatePlayerInventory(@Nullable InventorySection storage,
        @Nullable InventorySection armor,
        @Nullable InventorySection hotbar,
        @Nullable InventorySection utility,
        @Nullable InventorySection builderMaterial,
        @Nullable InventorySection tools,
        @Nullable InventorySection backpack,
        @Nonnull SortType sortType)` |
| `public` | `UpdatePlayerInventory(@Nonnull UpdatePlayerInventory other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getId()` |
| `public` | `NetworkChannel` | `getChannel()` |
| `public static` | `UpdatePlayerInventory` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `` | `public static int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `` | `public static ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `` | `public UpdatePlayerInventory` | `clone()` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
