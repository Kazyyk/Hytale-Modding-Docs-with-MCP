---
title: "Asset"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Asset"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class Asset
```

Represents a content asset reference with a content hash for integrity verification and a human-readable name.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `hash` | No |  Default: `"`. |
| `String` | `name` | No |  Default: `"`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 64 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 64 |
| `MAX_SIZE` | 2,117 |

Binary layout: 64 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Asset deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Asset` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Asset` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Asset` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AssetIconProperties](AssetIconProperties.md)
