---
title: "BlockMovementSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockMovementSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class BlockMovementSettings
```

Comprehensive physics configuration for entity movement on/through a block, including climbing, bouncing, drag, friction, speed multipliers, and jump force.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `isClimbable` | No |  |
| `float` | `climbUpSpeedMultiplier` | No |  |
| `float` | `climbDownSpeedMultiplier` | No |  |
| `float` | `climbLateralSpeedMultiplier` | No |  |
| `boolean` | `isBouncy` | No |  |
| `float` | `bounceVelocity` | No |  |
| `float` | `drag` | No |  |
| `float` | `friction` | No |  |
| `float` | `terminalVelocityModifier` | No |  |
| `float` | `horizontalSpeedMultiplier` | No |  |
| `float` | `acceleration` | No |  |
| `float` | `jumpForceMultiplier` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 42 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 42 |
| `MAX_SIZE` | 42 |

Binary layout: 42 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockMovementSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockMovementSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockMovementSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockMovementSettings` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockType](BlockType.md)
