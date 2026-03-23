---
title: "StatsConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.StatsConditionInteraction"
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
public class StatsConditionInteraction extends SimpleInteraction
```

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 14).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `Map<``Integer``, ``Float``>` | `costs` | Yes | |
| `boolean` | `lessThan` | No | |
| `boolean` | `lenient` | No | |
| [ValueType](ValueType.md) | `valueType` | No | Default: `ValueType.Percent`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 22 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 46 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static StatsConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `StatsConditionInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `StatsConditionInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `StatsConditionInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
- [SimpleInteraction](SimpleInteraction.md)
- [ValueType](ValueType.md)
