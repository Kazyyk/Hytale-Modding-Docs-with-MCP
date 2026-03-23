---
title: "AssetEditorFetchJsonAssetWithParentsReply"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorFetchJsonAssetWithParentsReply"
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
public class AssetEditorFetchJsonAssetWithParentsReply implements Packet, ToClientPacket
```

Server-to-client packet (ID 313). Uses Zstd compression. Server reply containing a JSON asset and its parent chain.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `Map<AssetPath, String>` | `assets` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorFetchJsonAssetWithParentsReply deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorFetchJsonAssetWithParentsReply` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorFetchJsonAssetWithParentsReply` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorFetchJsonAssetWithParentsReply` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorFetchJsonAssetWithParents](AssetEditorFetchJsonAssetWithParents.md)
- [AssetPath](AssetPath.md)
