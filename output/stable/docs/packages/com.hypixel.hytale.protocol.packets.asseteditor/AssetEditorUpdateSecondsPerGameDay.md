---
title: "AssetEditorUpdateSecondsPerGameDay"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorUpdateSecondsPerGameDay"
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
public class AssetEditorUpdateSecondsPerGameDay implements Packet, ToClientPacket
```

Server-to-client packet (ID 353). Sent by the client to update the seconds-per-game-day preview setting.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `nighttimeDurationSeconds` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 8 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 8 |
| `MAX_SIZE` | 8 |

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorUpdateSecondsPerGameDay deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorUpdateSecondsPerGameDay` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorUpdateSecondsPerGameDay` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorUpdateSecondsPerGameDay` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
