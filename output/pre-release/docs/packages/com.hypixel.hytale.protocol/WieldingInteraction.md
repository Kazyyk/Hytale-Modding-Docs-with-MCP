---
title: "WieldingInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WieldingInteraction"
api_surface: false
extends: "ChargingInteraction"
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
public class WieldingInteraction extends ChargingInteraction
```

An interaction type that extends `ChargingInteraction` with charge-up mechanics (type ID 10).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [DamageEffects](DamageEffects.md) | `blockedEffects` | Yes | |
| `boolean` | `hasModifiers` | No | |
| [AngledWielding](AngledWielding.md) | `angledWielding` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 58 |
| `VARIABLE_FIELD_COUNT` | 8 |
| `VARIABLE_BLOCK_START` | 90 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 2 null-bit bytes + 58 bytes of fixed fields + 8 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static WieldingInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `WieldingInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `WieldingInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `WieldingInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AngledWielding](AngledWielding.md)
- [ChargingInteraction](ChargingInteraction.md)
- [DamageEffects](DamageEffects.md)
- [Interaction](Interaction.md)
