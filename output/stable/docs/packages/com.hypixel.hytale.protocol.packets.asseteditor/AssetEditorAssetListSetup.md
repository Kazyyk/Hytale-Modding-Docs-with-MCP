---
title: "AssetEditorAssetListSetup"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorAssetListSetup"
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
public class AssetEditorAssetListSetup implements Packet, ToClientPacket
```

Server-to-client packet (ID 319). Uses Zstd compression. Initializes the client-side asset list with file entries for a given pack and file tree.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `pack` | Yes |  |
| `boolean` | `isReadOnly` | No |  |
| `boolean` | `canBeDeleted` | No |  |
| [AssetEditorFileTree](AssetEditorFileTree.md) | `tree` | No |  |
| [AssetEditorFileEntry](AssetEditorFileEntry.md)[] | `paths` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 12 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 4 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorAssetListSetup deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorAssetListSetup` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorAssetListSetup` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorAssetListSetup` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorAsset](AssetEditorAsset.md)
- [AssetEditorFileEntry](AssetEditorFileEntry.md)
- [AssetEditorFileTree](AssetEditorFileTree.md)
