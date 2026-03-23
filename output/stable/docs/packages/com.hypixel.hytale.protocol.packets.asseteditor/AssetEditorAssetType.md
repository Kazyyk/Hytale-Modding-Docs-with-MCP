---
title: "AssetEditorAssetType"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorAssetType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class AssetEditorAssetType
```

Defines an asset type with its identifier, icon, file path pattern, extension, and editor type.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `String` | `icon` | Yes |  |
| `boolean` | `isColoredIcon` | No |  |
| `String` | `path` | Yes |  |
| `String` | `fileExtension` | Yes |  |
| [AssetEditorEditorType](AssetEditorEditorType.md) | `editorType` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 19 |
| `MAX_SIZE` | 65,536,039 |

Binary layout: 1 null-bit byte + 3 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorAssetType deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorAssetType` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorAssetType` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorAssetType` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorAsset](AssetEditorAsset.md)
- [AssetEditorEditorType](AssetEditorEditorType.md)
