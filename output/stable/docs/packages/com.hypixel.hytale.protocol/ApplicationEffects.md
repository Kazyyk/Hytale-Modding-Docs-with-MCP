---
title: "ApplicationEffects"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ApplicationEffects"
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
public class ApplicationEffects
```

Comprehensive effect configuration applied when an entity effect is active. Controls visual tints, animations, particles, screen effects, sound, model VFX, movement modifications, mouse sensitivity, and ability restrictions.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Color](Color.md) | `entityBottomTint` | Yes |  |
| [Color](Color.md) | `entityTopTint` | Yes |  |
| `String` | `entityAnimationId` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `firstPersonParticles` | Yes |  |
| `String` | `screenEffect` | Yes |  |
| `float` | `horizontalSpeedMultiplier` | No |  |
| `int` | `soundEventIndexLocal` | No |  |
| `int` | `soundEventIndexWorld` | No |  |
| `String` | `modelVFXId` | Yes |  |
| [MovementEffects](MovementEffects.md) | `movementEffects` | Yes |  |
| `float` | `mouseSensitivityAdjustmentTarget` | No |  |
| `float` | `mouseSensitivityAdjustmentDuration` | No |  |
| [AbilityEffects](AbilityEffects.md) | `abilityEffects` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 35 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 59 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 2 null-bit bytes + 35 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ApplicationEffects deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ApplicationEffects` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ApplicationEffects` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ApplicationEffects` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [AbilityEffects](AbilityEffects.md)
- [EntityEffect](EntityEffect.md)
