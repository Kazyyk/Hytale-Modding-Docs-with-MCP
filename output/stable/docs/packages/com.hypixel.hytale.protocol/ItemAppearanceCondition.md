---
title: "ItemAppearanceCondition"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemAppearanceCondition"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "item"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ItemAppearanceCondition
```

Defines conditional visual overrides for an item based on a stat/value condition range, including model, texture, particles, and VFX replacements.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `firstPersonParticles` | Yes |  |
| `String` | `model` | Yes |  |
| `String` | `texture` | Yes |  |
| `String` | `modelVFXId` | Yes |  |
| [FloatRange](FloatRange.md) | `condition` | Yes |  |
| [ValueType](ValueType.md) | `conditionValueType` | No |  Default: `ValueType.Percent`. |
| `int` | `localSoundEventId` | No |  |
| `int` | `worldSoundEventId` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 18 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 38 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 18 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemAppearanceCondition deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemAppearanceCondition` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemAppearanceCondition` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemAppearanceCondition` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [FloatRange](FloatRange.md)
- [ItemBase](ItemBase.md)
