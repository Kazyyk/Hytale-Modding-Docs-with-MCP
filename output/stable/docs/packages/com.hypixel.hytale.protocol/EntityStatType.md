---
title: "EntityStatType"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityStatType"
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
public class EntityStatType
```

Complete entity stat definition including identifier, value range, UI visibility, boundary effects, and reset behavior.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `float` | `value` | No |  |
| `float` | `min` | No |  |
| `float` | `max` | No |  |
| [EntityStatEffects](EntityStatEffects.md) | `minValueEffects` | Yes |  |
| [EntityStatEffects](EntityStatEffects.md) | `maxValueEffects` | Yes |  |
| [EntityStatResetBehavior](EntityStatResetBehavior.md) | `resetBehavior` | No |  Default: `EntityStatResetBehavior.InitialValue`. |
| `boolean` | `hideFromTooltip` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 15 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 27 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 15 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityStatType deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityStatType` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityStatType` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityStatType` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EntityStatEffects](EntityStatEffects.md)
- [EntityStatResetBehavior](EntityStatResetBehavior.md)
