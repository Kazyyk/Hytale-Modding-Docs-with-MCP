---
title: "TagPattern"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.TagPattern"
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
public class TagPattern
```

Protocol data structure in the Block/Connected Block Rules group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [TagPatternType](TagPatternType.md) | `type` | No | Default: `TagPatternType.Equals`. |
| `int` | `tagIndex` | No | |
| [TagPattern](TagPattern.md)`[]` | `operands` | Yes | |
| [TagPattern](TagPattern.md) | `not` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 14 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static TagPattern deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `TagPattern` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `TagPattern` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `TagPattern` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [TagPatternType](TagPatternType.md)
