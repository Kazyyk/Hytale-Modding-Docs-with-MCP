---
title: "EntityStatEffects"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityStatEffects"
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
public class EntityStatEffects
```

Defines effects triggered when an entity stat reaches its min or max value, including sound and particles.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `triggerAtZero` | No |  |
| `int` | `soundEventIndex` | No |  |
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 6 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityStatEffects deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityStatEffects` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityStatEffects` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityStatEffects` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EntityStatType](EntityStatType.md)
