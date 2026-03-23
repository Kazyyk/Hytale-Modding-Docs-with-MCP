---
title: "AssetEditorAssetListUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorAssetListUpdate"
api_surface: false
extends: ~
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
  - "packet"
  - "server-to-client"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class AssetEditorAssetListUpdate implements Packet, ToClientPacket
```

Server-to-client packet (ID 320). Uses Zstd compression. Sends incremental additions and deletions to the asset list for a given pack.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `pack` | Yes |  |
| [AssetEditorFileEntry](AssetEditorFileEntry.md)[] | `additions` | Yes |  |
| [AssetEditorFileEntry](AssetEditorFileEntry.md)[] | `deletions` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorAssetListUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorAssetListUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorAssetListUpdate` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorAssetListUpdate` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorAsset](AssetEditorAsset.md)
- [AssetEditorFileEntry](AssetEditorFileEntry.md)
