---
title: "InteractionEffects"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionEffects"
api_surface: false
extends: ~
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
public class InteractionEffects
```

Visual and audio effects triggered during interaction execution: particles, trails, animations, camera shake, movement, and sound.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `firstPersonParticles` | Yes |  |
| `int` | `worldSoundEventIndex` | No |  |
| `int` | `localSoundEventIndex` | No |  |
| [ModelTrail](ModelTrail.md)`[]` | `trails` | Yes |  |
| `boolean` | `waitForAnimationToFinish` | No |  Default: `true`. |
| `String` | `itemPlayerAnimationsId` | Yes |  |
| `String` | `itemAnimationId` | Yes |  |
| `boolean` | `clearAnimationOnFinish` | No |  |
| `boolean` | `clearSoundEventOnFinish` | No |  |
| `CameraShakeEffect` | `cameraShake` | Yes |  |
| [MovementEffects](MovementEffects.md) | `movementEffects` | Yes |  |
| `float` | `startDelay` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 32 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 52 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 32 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionEffects deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionEffects` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionEffects` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionEffects` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CameraShake](CameraShake.md)
- [Interaction](Interaction.md)
