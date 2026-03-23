---
title: "InitialVelocity"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InitialVelocity"
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
public class InitialVelocity
```

Defines randomized initial velocity parameters with ranges for yaw, pitch, and speed.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Rangef](Rangef.md) | `yaw` | Yes |  |
| [Rangef](Rangef.md) | `pitch` | Yes |  |
| [Rangef](Rangef.md) | `speed` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 25 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 25 |
| `MAX_SIZE` | 25 |

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InitialVelocity deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InitialVelocity` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InitialVelocity` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InitialVelocity` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
