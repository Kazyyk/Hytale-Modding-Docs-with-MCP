---
title: "AssetEditorCapabilities"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorCapabilities"
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
public class AssetEditorCapabilities implements Packet, ToClientPacket
```

Server-to-client packet (ID 304). Sends the set of asset editor capabilities (permissions) to the client.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `canEditAssets` | No |  |
| `boolean` | `canCreateAssetPacks` | No |  |
| `boolean` | `canEditAssetPacks` | No |  |
| `boolean` | `canDeleteAssetPacks` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 5 |

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorCapabilities deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorCapabilities` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorCapabilities` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorCapabilities` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
