---
title: "AssetEditorUpdateJsonAsset"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorUpdateJsonAsset"
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
public class AssetEditorUpdateJsonAsset implements Packet, ToServerPacket
```

Client-to-server packet (ID 323). Uses Zstd compression. Sent by the client to update a JSON asset.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `assetType` | Yes |  |
| [AssetPath](AssetPath.md) | `path` | Yes |  |
| `int` | `assetIndex` | No |  |
| [JsonUpdateCommand](JsonUpdateCommand.md)[] | `commands` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 21 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorUpdateJsonAsset deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorUpdateJsonAsset` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorUpdateJsonAsset` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorUpdateJsonAsset` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetPath](AssetPath.md)
- [JsonUpdateCommand](JsonUpdateCommand.md)
