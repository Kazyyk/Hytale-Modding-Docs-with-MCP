---
title: "AssetEditorDeleteAssetPack"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorDeleteAssetPack"
api_surface: false
extends: ~
implements: ["Packet", "ToServerPacket", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
  - "packet"
  - "bidirectional"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class AssetEditorDeleteAssetPack implements Packet, ToServerPacket, ToClientPacket
```

Bidirectional packet (ID 317). Sent by the client to delete an asset pack.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 1 |
| `MAX_SIZE` | 16,384,006 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorDeleteAssetPack deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorDeleteAssetPack` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorDeleteAssetPack` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorDeleteAssetPack` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorDeleteAsset](AssetEditorDeleteAsset.md)
