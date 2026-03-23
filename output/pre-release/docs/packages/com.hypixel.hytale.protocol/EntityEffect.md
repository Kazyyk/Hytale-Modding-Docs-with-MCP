---
title: "EntityEffect"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityEffect"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "entity"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class EntityEffect
```

Complete entity effect definition including visual application effects, model overrides, duration, buff/debuff classification, overlap behavior, and value scaling.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `String` | `name` | Yes |  |
| [ApplicationEffects](ApplicationEffects.md) | `applicationEffects` | Yes |  |
| `int` | `worldRemovalSoundEventIndex` | No |  |
| `int` | `localRemovalSoundEventIndex` | No |  |
| [ModelOverride](ModelOverride.md) | `modelOverride` | Yes |  |
| `float` | `duration` | No |  |
| `boolean` | `infinite` | No |  |
| `boolean` | `debuff` | No |  |
| `String` | `statusEffectIcon` | Yes |  |
| [OverlapBehavior](OverlapBehavior.md) | `overlapBehavior` | No |  Default: `OverlapBehavior.Extend`. |
| `double` | `damageCalculatorCooldown` | No |  |
| `Map<``Integer``, ``Float``>` | `statModifiers` | Yes |  |
| [ValueType](ValueType.md) | `valueType` | No |  Default: `ValueType.Percent`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 25 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 49 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 25 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityEffect deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityEffect` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityEffect` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityEffect` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ApplicationEffects](ApplicationEffects.md)
- [EntityEffectUpdate](EntityEffectUpdate.md)
