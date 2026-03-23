---
title: "AssetEditorUpdateAssetPack"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorUpdateAssetPack"
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
public class AssetEditorUpdateAssetPack implements Packet, ToServerPacket, ToClientPacket
```

Bidirectional packet (ID 315). Sent by the client to update an asset pack manifest.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| [AssetPackManifest](AssetPackManifest.md) | `manifest` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorUpdateAssetPack deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorUpdateAssetPack` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorUpdateAssetPack` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorUpdateAssetPack` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorUpdateAsset](AssetEditorUpdateAsset.md)
- [AssetPackManifest](AssetPackManifest.md)
