---
title: "TimestampedAssetReference"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.TimestampedAssetReference"
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
public class TimestampedAssetReference
```

An asset reference with an associated timestamp for tracking modifications.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [AssetPath](AssetPath.md) | `path` | Yes |  |
| `String` | `timestamp` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 49,152,033 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static TimestampedAssetReference deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `TimestampedAssetReference` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `TimestampedAssetReference` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `TimestampedAssetReference` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetPath](AssetPath.md)
