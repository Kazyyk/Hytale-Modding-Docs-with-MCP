---
title: "FluidFXMovementSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FluidFXMovementSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "fluid"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class FluidFXMovementSettings
```

Physics parameters for entity movement while submerged in a fluid.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `swimUpSpeed` | No |  |
| `float` | `swimDownSpeed` | No |  |
| `float` | `sinkSpeed` | No |  |
| `float` | `horizontalSpeedMultiplier` | No |  |
| `float` | `fieldOfViewMultiplier` | No |  |
| `float` | `entryVelocityMultiplier` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 24 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 24 |
| `MAX_SIZE` | 24 |

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static FluidFXMovementSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `FluidFXMovementSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `FluidFXMovementSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `FluidFXMovementSettings` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [FluidFX](FluidFX.md)
