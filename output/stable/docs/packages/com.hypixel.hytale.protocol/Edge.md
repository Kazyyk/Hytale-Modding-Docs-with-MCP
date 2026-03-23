---
title: "Edge"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Edge"
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
public class Edge
```

Defines a visual edge/outline with color and width.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ColorAlpha](ColorAlpha.md) | `color` | Yes |  |
| `float` | `width` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 9 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Edge deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Edge` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Edge` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Edge` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
