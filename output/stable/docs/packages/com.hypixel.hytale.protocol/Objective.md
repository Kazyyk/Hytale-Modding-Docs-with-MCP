---
title: "Objective"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Objective"
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
public class Objective
```

Protocol data structure in the Objectives/UI group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `UUID` | `objectiveUuid` | No | Default: `new UUID(0L, 0L)`. |
| [FormattedMessage](FormattedMessage.md) | `objectiveTitleKey` | Yes | |
| [FormattedMessage](FormattedMessage.md) | `objectiveDescriptionKey` | Yes | |
| `String` | `objectiveLineId` | Yes | |
| [ObjectiveTask](ObjectiveTask.md)`[]` | `tasks` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 17 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 33 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Objective deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Objective` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Objective` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Objective` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [FormattedMessage](FormattedMessage.md)
- [ObjectiveTask](ObjectiveTask.md)
