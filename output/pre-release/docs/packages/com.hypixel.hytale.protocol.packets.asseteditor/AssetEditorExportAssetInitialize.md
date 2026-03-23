---
title: "AssetEditorExportAssetInitialize"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorExportAssetInitialize"
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
public class AssetEditorExportAssetInitialize implements Packet, ToClientPacket
```

Server-to-client packet (ID 343). Initializes an asset export, specifying the asset to export and its total size.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [AssetEditorAsset](AssetEditorAsset.md) | `asset` | Yes |  |
| [AssetPath](AssetPath.md) | `oldPath` | Yes |  |
| `int` | `size` | No |  |
| `boolean` | `failed` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 14 |
| `MAX_SIZE` | 81,920,066 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorExportAssetInitialize deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorExportAssetInitialize` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorExportAssetInitialize` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorExportAssetInitialize` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorAsset](AssetEditorAsset.md)
- [AssetPath](AssetPath.md)
