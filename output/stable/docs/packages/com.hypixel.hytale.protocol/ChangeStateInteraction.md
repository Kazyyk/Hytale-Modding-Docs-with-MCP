---
title: "ChangeStateInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChangeStateInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
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
public class ChangeStateInteraction extends SimpleBlockInteraction
```

An interaction (type ID 17) that changes a block's state. Extends SimpleBlockInteraction with no additional fields.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `Map<``String``, ``String``>` | `stateChanges` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 20 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 44 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ChangeStateInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ChangeStateInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ChangeStateInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ChangeStateInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
