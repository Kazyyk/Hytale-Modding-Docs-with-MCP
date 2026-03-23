---
title: "EntityStatUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityStatUpdate"
api_surface: true
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
public class EntityStatUpdate
```

Individual stat operation carrying the op type, predictability flag, value, and optional modifier data.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [EntityStatOp](EntityStatOp.md) | `op` | No |  Default: `EntityStatOp.Init`. |
| `boolean` | `predictable` | No |  |
| `float` | `value` | No |  |
| `Map<``String``, `[Modifier](Modifier.md)`>` | `modifiers` | Yes |  |
| `String` | `modifierKey` | Yes |  |
| [Modifier](Modifier.md) | `modifier` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 13 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 21 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityStatUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityStatUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityStatUpdate` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityStatUpdate` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EntityStatOp](EntityStatOp.md)
- [EntityStatsUpdate](EntityStatsUpdate.md)
