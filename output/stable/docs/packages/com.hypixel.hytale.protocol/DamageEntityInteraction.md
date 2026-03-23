---
title: "DamageEntityInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DamageEntityInteraction"
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
public class DamageEntityInteraction extends Interaction
```

An interaction (type ID 21) that deals damage to entities with directional angle-based effects and branching outcomes. Extends Interaction directly.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `next` | No |  Default: `Integer.MIN_VALUE`. |
| `int` | `failed` | No |  Default: `Integer.MIN_VALUE`. |
| `int` | `blocked` | No |  Default: `Integer.MIN_VALUE`. |
| [DamageEffects](DamageEffects.md) | `damageEffects` | Yes |  |
| [AngledDamage](AngledDamage.md)`[]` | `angledDamage` | Yes |  |
| `Map<``String``, `[TargetedDamage](TargetedDamage.md)`>` | `targetedDamage` | Yes |  |
| [EntityStatOnHit](EntityStatOnHit.md)`[]` | `entityStatsOnHit` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 24 |
| `VARIABLE_FIELD_COUNT` | 9 |
| `VARIABLE_BLOCK_START` | 60 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 2 null-bit bytes + 24 bytes of fixed fields + 9 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static DamageEntityInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `DamageEntityInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `DamageEntityInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `DamageEntityInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [DamageEffects](DamageEffects.md)
- [AngledDamage](AngledDamage.md)
- [Interaction](Interaction.md)
