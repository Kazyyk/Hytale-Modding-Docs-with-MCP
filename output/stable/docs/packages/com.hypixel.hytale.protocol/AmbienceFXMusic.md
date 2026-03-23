---
title: "AmbienceFXMusic"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXMusic"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "ambience"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class AmbienceFXMusic
```

Defines music track configuration within an ambience effect, including track selection and volume.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String``[]` | `tracks` | Yes |  |
| `float` | `volume` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFXMusic deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFXMusic` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFXMusic` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFXMusic` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceFX](AmbienceFX.md)
