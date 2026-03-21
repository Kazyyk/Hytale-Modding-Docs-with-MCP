---
title: "AssetEditorFetchAutoCompleteData"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetEditorFetchAutoCompleteData"
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
public class AssetEditorFetchAutoCompleteData implements Packet, ToServerPacket
```

Client-to-server packet (ID 331). Requests auto-complete data for the asset editor.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `dataset` | Yes |  |
| `String` | `query` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 32,768,023 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetEditorFetchAutoCompleteData deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetEditorFetchAutoCompleteData` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetEditorFetchAutoCompleteData` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetEditorFetchAutoCompleteData` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
