---
title: "ObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ObjectiveTask"
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
public class ObjectiveTask
```

Protocol data structure in the Objectives/UI group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [FormattedMessage](FormattedMessage.md) | `taskDescriptionKey` | Yes | |
| `int` | `currentCompletion` | No | |
| `int` | `completionNeeded` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ObjectiveTask deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ObjectiveTask` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ObjectiveTask` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ObjectiveTask` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [FormattedMessage](FormattedMessage.md)
