---
title: "AssetEditorPreviewCameraSettings"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorPreviewCameraSettings"
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
public class AssetEditorPreviewCameraSettings
```

Camera position and orientation settings for the asset editor 3D preview.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `Vector3f` | `cameraPosition` | Yes |  |
| `Vector3f` | `cameraOrientation` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 29 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 29 |
| `MAX_SIZE` | 29 |

Binary layout: 1 null-bit byte + 29 bytes of fixed fields + 0 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorPreviewCameraSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorPreviewCameraSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorPreviewCameraSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorPreviewCameraSettings` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
