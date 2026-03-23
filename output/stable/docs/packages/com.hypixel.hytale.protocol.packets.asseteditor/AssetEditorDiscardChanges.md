---
title: "AssetEditorDiscardChanges"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorDiscardChanges"
api_surface: false
extends: ~
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
  - "packet"
  - "client-to-server"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class AssetEditorDiscardChanges implements Packet, ToServerPacket
```

Client-to-server packet (ID 330). Sent by the client to discard pending changes in the asset editor.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [TimestampedAssetReference](TimestampedAssetReference.md)[] | `assets` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 1 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorDiscardChanges deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorDiscardChanges` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorDiscardChanges` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorDiscardChanges` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [TimestampedAssetReference](TimestampedAssetReference.md)
