---
title: "AssetEditorSetGameTime"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorSetGameTime"
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
public class AssetEditorSetGameTime implements Packet, ToServerPacket
```

Client-to-server packet (ID 352). Sent by the client to set the in-game time for preview purposes.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `InstantData` | `gameTime` | Yes |  |
| `boolean` | `paused` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 14 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 14 |
| `MAX_SIZE` | 14 |

Binary layout: 1 null-bit byte + 14 bytes of fixed fields + 0 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorSetGameTime deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorSetGameTime` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorSetGameTime` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorSetGameTime` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
