---
title: "ServerCameraSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ServerCameraSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "camera"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ServerCameraSettings
```

Protocol data structure in the Camera/View group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `positionLerpSpeed` | No | Default: `1.0F`. |
| `float` | `rotationLerpSpeed` | No | Default: `1.0F`. |
| `float` | `distance` | No | |
| `float` | `speedModifier` | No | Default: `1.0F`. |
| `boolean` | `allowPitchControls` | No | |
| `boolean` | `displayCursor` | No | |
| `boolean` | `displayReticle` | No | |
| [MouseInputTargetType](MouseInputTargetType.md) | `mouseInputTargetType` | No | Default: `MouseInputTargetType.Any`. |
| `boolean` | `sendMouseMotion` | No | |
| `boolean` | `skipCharacterPhysics` | No | |
| `boolean` | `isFirstPerson` | No | Default: `true`. |
| [MovementForceRotationType](MovementForceRotationType.md) | `movementForceRotationType` | No | Default: `MovementForceRotationType.AttachedToHead`. |
| [Direction](Direction.md) | `movementForceRotation` | Yes | |
| [AttachedToType](AttachedToType.md) | `attachedToType` | No | Default: `AttachedToType.LocalPlayer`. |
| `int` | `attachedToEntityId` | No | |
| `boolean` | `eyeOffset` | No | |
| [PositionDistanceOffsetType](PositionDistanceOffsetType.md) | `positionDistanceOffsetType` | No | Default: `PositionDistanceOffsetType.DistanceOffset`. |
| [Position](Position.md) | `positionOffset` | Yes | |
| [Direction](Direction.md) | `rotationOffset` | Yes | |
| [PositionType](PositionType.md) | `positionType` | No | Default: `PositionType.AttachedToPlusOffset`. |
| [Position](Position.md) | `position` | Yes | |
| [RotationType](RotationType.md) | `rotationType` | No | Default: `RotationType.AttachedToPlusOffset`. |
| [Direction](Direction.md) | `rotation` | Yes | |
| [CanMoveType](CanMoveType.md) | `canMoveType` | No | Default: `CanMoveType.AttachedToLocalPlayer`. |
| [ApplyMovementType](ApplyMovementType.md) | `applyMovementType` | No | Default: `ApplyMovementType.CharacterController`. |
| [Vector3f](Vector3f.md) | `movementMultiplier` | Yes | |
| [ApplyLookType](ApplyLookType.md) | `applyLookType` | No | Default: `ApplyLookType.LocalPlayerLookOrientation`. |
| [Vector2f](Vector2f.md) | `lookMultiplier` | Yes | |
| [MouseInputType](MouseInputType.md) | `mouseInputType` | No | Default: `MouseInputType.LookAtTarget`. |
| [Vector3f](Vector3f.md) | `planeNormal` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 154 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 154 |
| `MAX_SIZE` | 154 |

Binary layout: 1 null-bit byte + 154 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ServerCameraSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ServerCameraSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ServerCameraSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ServerCameraSettings` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ApplyLookType](ApplyLookType.md)
- [ApplyMovementType](ApplyMovementType.md)
- [AttachedToType](AttachedToType.md)
- [CanMoveType](CanMoveType.md)
- [Direction](Direction.md)
- [MouseInputTargetType](MouseInputTargetType.md)
- [MouseInputType](MouseInputType.md)
- [MovementForceRotationType](MovementForceRotationType.md)
- [Position](Position.md)
- [PositionDistanceOffsetType](PositionDistanceOffsetType.md)
- [PositionType](PositionType.md)
- [RotationType](RotationType.md)
- [Vector2f](Vector2f.md)
- [Vector3f](Vector3f.md)
