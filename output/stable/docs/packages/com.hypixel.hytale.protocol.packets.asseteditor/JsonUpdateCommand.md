---
title: "JsonUpdateCommand"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.JsonUpdateCommand"
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
public class JsonUpdateCommand
```

Describes a single JSON update operation (add, replace, remove, etc.) at a specific JSON path.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [JsonUpdateType](JsonUpdateType.md) | `type` | No |  |
| `String`[] | `path` | Yes |  |
| `String` | `value` | Yes |  |
| `String` | `previousValue` | Yes |  |
| `String`[] | `firstCreatedProperty` | Yes |  |
| [AssetEditorRebuildCaches](AssetEditorRebuildCaches.md) | `rebuildCaches` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 7 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 23 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 7 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static JsonUpdateCommand deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `JsonUpdateCommand` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `JsonUpdateCommand` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `JsonUpdateCommand` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetEditorRebuildCaches](AssetEditorRebuildCaches.md)
- [JsonUpdateType](JsonUpdateType.md)
