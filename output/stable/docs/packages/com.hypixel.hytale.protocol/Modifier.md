---
title: "Modifier"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Modifier"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class Modifier
```

Protocol data structure in the Modifier System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ModifierTarget](ModifierTarget.md) | `target` | No | Default: `ModifierTarget.Min`. |
| [CalculationType](CalculationType.md) | `calculationType` | No | Default: `CalculationType.Additive`. |
| `float` | `amount` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 6 |
| `MAX_SIZE` | 6 |

Binary layout: 6 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Modifier deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Modifier` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Modifier` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Modifier` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CalculationType](CalculationType.md)
- [ModifierTarget](ModifierTarget.md)
