---
title: "ApplyForceInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ApplyForceInteraction"
api_surface: false
extends: "SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ApplyForceInteraction extends SimpleInteraction
```

An interaction (type ID 26) that applies directional forces to entities over a duration, optionally waiting for ground contact. Extends SimpleInteraction.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [VelocityConfig](VelocityConfig.md) | `velocityConfig` | Yes |  |
| [ChangeVelocityType](ChangeVelocityType.md) | `changeVelocityType` | No |  Default: `ChangeVelocityType.Add`. |
| [AppliedForce](AppliedForce.md)`[]` | `forces` | Yes |  |
| `float` | `duration` | No |  |
| [FloatRange](FloatRange.md) | `verticalClamp` | Yes |  |
| `boolean` | `waitForGround` | No |  |
| `boolean` | `waitForCollision` | No |  |
| `float` | `groundCheckDelay` | No |  |
| `float` | `collisionCheckDelay` | No |  |
| `int` | `groundNext` | No |  |
| `int` | `collisionNext` | No |  |
| `float` | `raycastDistance` | No |  |
| `float` | `raycastHeightOffset` | No |  |
| [RaycastMode](RaycastMode.md) | `raycastMode` | No |  Default: `RaycastMode.FollowMotion`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 80 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 104 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 80 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ApplyForceInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ApplyForceInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ApplyForceInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ApplyForceInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AppliedForce](AppliedForce.md)
- [ApplyForceState](ApplyForceState.md)
- [Interaction](Interaction.md)
