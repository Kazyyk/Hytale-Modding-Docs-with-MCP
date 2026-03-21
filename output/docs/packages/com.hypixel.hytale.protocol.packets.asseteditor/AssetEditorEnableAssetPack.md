---
title: "AssetEditorEnableAssetPack"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorEnableAssetPack"
api_surface: false
extends: ~
implements: ["Packet"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class AssetEditorEnableAssetPack implements Packet
```

Sent by the client to enable or disable an asset pack.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `boolean` | `enabled` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 2 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 2 |
| `MAX_SIZE` | 16,384,007 |

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorEnableAssetPack deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorEnableAssetPack` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorEnableAssetPack` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorEnableAssetPack` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
