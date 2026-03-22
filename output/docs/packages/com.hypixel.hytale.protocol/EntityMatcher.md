---
title: "EntityMatcher"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityMatcher"
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
public class EntityMatcher
```

Defines an entity matching rule by type with optional inversion.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [EntityMatcherType](EntityMatcherType.md) | `type` | No |  Default: `EntityMatcherType.Server`. |
| `boolean` | `invert` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 2 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 2 |
| `MAX_SIZE` | 2 |

Binary layout: 2 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityMatcher deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityMatcher` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityMatcher` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityMatcher` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EntityMatcherType](EntityMatcherType.md)
- [HitEntity](HitEntity.md)
