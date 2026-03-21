---
title: "AssetEditorUpdateModelPreview"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorUpdateModelPreview"
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
public class AssetEditorUpdateModelPreview implements Packet, ToClientPacket
```

Server-to-client packet (ID 355). Sends model preview settings to the client.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [AssetPath](AssetPath.md) | `assetPath` | Yes |  |
| `Model` | `model` | Yes |  |
| `BlockType` | `block` | Yes |  |
| [AssetEditorPreviewCameraSettings](AssetEditorPreviewCameraSettings.md) | `camera` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 30 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 42 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 30 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorUpdateModelPreview deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorUpdateModelPreview` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorUpdateModelPreview` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorUpdateModelPreview` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorPreviewCameraSettings](AssetEditorPreviewCameraSettings.md)
- [AssetPath](AssetPath.md)
