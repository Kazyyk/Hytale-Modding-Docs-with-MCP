---
title: "AssetEditorFetchJsonAssetWithParents"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorFetchJsonAssetWithParents"
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
public class AssetEditorFetchJsonAssetWithParents implements Packet, ToServerPacket
```

Client-to-server packet (ID 311). Requests a JSON asset along with its parent assets in the inheritance chain.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [AssetPath](AssetPath.md) | `path` | Yes |  |
| `boolean` | `isFromOpenedTab` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 6 |
| `MAX_SIZE` | 32,768,025 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorFetchJsonAssetWithParents deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorFetchJsonAssetWithParents` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorFetchJsonAssetWithParents` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorFetchJsonAssetWithParents` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetPath](AssetPath.md)
