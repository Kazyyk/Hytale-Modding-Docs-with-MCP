---
title: "AppliedForce"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AppliedForce"
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
public class AppliedForce
```

Defines a directional force vector with optional vertical adjustment, used by ApplyForceInteraction to push entities.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `direction` | Yes |  |
| `boolean` | `adjustVertical` | No |  |
| `float` | `force` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 18 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 18 |
| `MAX_SIZE` | 18 |

Binary layout: 1 null-bit byte + 18 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AppliedForce deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AppliedForce` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AppliedForce` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AppliedForce` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ApplyForceInteraction](ApplyForceInteraction.md)
