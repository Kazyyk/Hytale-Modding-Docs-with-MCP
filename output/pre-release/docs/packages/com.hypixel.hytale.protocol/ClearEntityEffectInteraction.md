---
title: "ClearEntityEffectInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ClearEntityEffectInteraction"
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
public class ClearEntityEffectInteraction extends SimpleInteraction
```

An interaction (type ID 28) that removes an entity effect from a target. Extends SimpleInteraction.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `effectId` | No |  |
| [InteractionTarget](InteractionTarget.md) | `entityTarget` | No |  Default: `InteractionTarget.User`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 24 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 44 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 24 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ClearEntityEffectInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ClearEntityEffectInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ClearEntityEffectInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ClearEntityEffectInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionTarget](InteractionTarget.md)
- [EntityEffect](EntityEffect.md)
- [Interaction](Interaction.md)
