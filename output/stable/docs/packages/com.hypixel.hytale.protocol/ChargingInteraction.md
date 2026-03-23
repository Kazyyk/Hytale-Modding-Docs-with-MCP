---
title: "ChargingInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChargingInteraction"
api_surface: false
extends: "Interaction"
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
public class ChargingInteraction extends Interaction
```

An interaction (type ID 9) that implements charge-up mechanics with configurable delay and hold behavior. Extends Interaction directly.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `failed` | No |  Default: `Integer.MIN_VALUE`. |
| `boolean` | `allowIndefiniteHold` | No |  |
| `boolean` | `displayProgress` | No |  |
| `boolean` | `cancelOnOtherClick` | No |  |
| `boolean` | `failOnDamage` | No |  |
| `float` | `mouseSensitivityAdjustmentTarget` | No |  |
| `float` | `mouseSensitivityAdjustmentDuration` | No |  |
| `Map<``Float``, ``Integer``>` | `chargedNext` | Yes |  |
| `Map<`[InteractionType](InteractionType.md)`, ``Integer``>` | `forks` | Yes |  |
| [ChargingDelay](ChargingDelay.md) | `chargingDelay` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 47 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 75 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 47 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ChargingInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ChargingInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ChargingInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ChargingInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ChargingDelay](ChargingDelay.md)
- [Interaction](Interaction.md)
