---
title: "ModelTexture"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ModelTexture"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "model"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ModelTexture
```

Protocol data structure in the Model/Rendering group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `texture` | Yes | |
| `float` | `weight` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 16,384,010 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ModelTexture deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ModelTexture` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ModelTexture` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ModelTexture` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
