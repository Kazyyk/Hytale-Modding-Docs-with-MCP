---
title: "ColorLight"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ColorLight"
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
public class ColorLight
```

RGB color with a light emission radius. Used for dynamic lighting and colored light sources.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `byte` | `radius` | No |  |
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
public static ColorLight deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ColorLight` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ColorLight` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ColorLight` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [DynamicLightUpdate](DynamicLightUpdate.md)
- [BlockType](BlockType.md)
