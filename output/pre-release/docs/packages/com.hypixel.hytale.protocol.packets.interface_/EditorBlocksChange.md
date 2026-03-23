---
title: "EditorBlocksChange"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.interface_"
fqcn: "com.hypixel.hytale.protocol.packets.interface_.EditorBlocksChange"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Packet"
  - "ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "protocol"
  - "packet"
  - "editor"
---

**Package:** `com.hypixel.hytale.protocol.packets.interface_`

```java
public class EditorBlocksChange implements Packet, ToClientPacket
```

Server-to-client packet that transmits editor block, fluid, and entity changes. Carries an optional `EditorSelection`, arrays of `BlockChange`, `FluidChange`, and `ClipboardEntityChange` entries, a total blocks count, and flags controlling advanced preview and preview rebuild behavior. The packet is compressed and uses nullable bit fields to omit absent arrays.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `222` |
| `IS_COMPRESSED` | `true` |
| `MAX_SIZE` | `1677721600` |

## Fields

| Field | Type | Nullable | Description |
|---|---|---|---|
| `selection` | `EditorSelection` | yes | The editor selection region |
| `blocksChange` | `BlockChange[]` | yes | Array of block changes (max 4,096,000) |
| `fluidsChange` | `FluidChange[]` | yes | Array of fluid changes (max 4,096,000) |
| `entityChanges` | `ClipboardEntityChange[]` | yes | Array of entity changes (max 4,096,000) |
| `blocksCount` | `int` | no | Total number of blocks affected |
| `advancedPreview` | `boolean` | no | Whether advanced preview is enabled |
| `skipPreviewRebuild` | `boolean` | no | Whether to skip rebuilding the preview |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`222`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static EditorBlocksChange deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes an `EditorBlocksChange` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the number of bytes consumed by this packet in the buffer.

```java
@Override
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this packet into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates buffer structure without full deserialization.

```java
public EditorBlocksChange clone()
```

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- `EditorSelection` -- selection region data
- `BlockChange` -- individual block change entry
- `FluidChange` -- individual fluid change entry
- `ClipboardEntityChange` -- entity change entry from clipboard operations
