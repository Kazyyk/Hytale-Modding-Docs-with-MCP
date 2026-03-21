---
title: "ColorAlpha"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ColorAlpha"
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
public class ColorAlpha
```

RGBA color value with byte-precision components including alpha transparency.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `byte` | `alpha` | No |  |
| `byte` | `red` | No |  |
| `byte` | `green` | No |  |
| `byte` | `blue` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 4 |
| `MAX_SIZE` | 4 |

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ColorAlpha deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ColorAlpha` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ColorAlpha` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ColorAlpha` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [ColorLight](ColorLight.md)
