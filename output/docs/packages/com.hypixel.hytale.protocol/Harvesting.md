---
title: "Harvesting"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Harvesting"
api_surface: true
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
public class Harvesting
```

Defines harvest parameters for a block including gather type, health, quantity, quality, and drop configuration.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `itemId` | Yes |  |
| `String` | `dropListId` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 32,768,019 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Harvesting deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Harvesting` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Harvesting` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Harvesting` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockGathering](BlockGathering.md)
- [BlockBreaking](BlockBreaking.md)
