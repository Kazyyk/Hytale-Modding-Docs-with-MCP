---
title: "AssetEditorCreateAsset"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorCreateAsset"
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
public class AssetEditorCreateAsset implements Packet, ToServerPacket
```

Client-to-server packet (ID 327). Sent by the client to create a new asset at the specified path with given data.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [AssetPath](AssetPath.md) | `path` | Yes |  |
| `byte`[] | `data` | Yes |  |
| [AssetEditorRebuildCaches](AssetEditorRebuildCaches.md) | `rebuildCaches` | Yes |  |
| `String` | `buttonId` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 10 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 22 |
| `MAX_SIZE` | 53,248,051 |

Binary layout: 1 null-bit byte + 10 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorCreateAsset deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorCreateAsset` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorCreateAsset` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorCreateAsset` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorRebuildCaches](AssetEditorRebuildCaches.md)
- [AssetPath](AssetPath.md)
