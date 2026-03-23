---
title: "SelectInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SelectInteraction"
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
public class SelectInteraction extends SimpleInteraction
```

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 6).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Selector](Selector.md) | `selector` | Yes | |
| `boolean` | `ignoreOwner` | No | |
| `int` | `hitEntity` | No | |
| [HitEntity](HitEntity.md)`[]` | `hitEntityRules` | Yes | |
| [FailOnType](FailOnType.md) | `failOn` | No | Default: `FailOnType.Neither`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 25 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 53 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 25 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SelectInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SelectInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SelectInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `SelectInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [FailOnType](FailOnType.md)
- [HitEntity](HitEntity.md)
- [Interaction](Interaction.md)
- [Selector](Selector.md)
- [SimpleInteraction](SimpleInteraction.md)
