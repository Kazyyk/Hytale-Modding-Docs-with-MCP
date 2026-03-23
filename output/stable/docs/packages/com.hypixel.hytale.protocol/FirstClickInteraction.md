---
title: "FirstClickInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FirstClickInteraction"
api_surface: false
extends: "Interaction"
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
public class FirstClickInteraction extends Interaction
```

An interaction (type ID 18) that branches based on whether input is a click or sustained hold. Extends Interaction directly.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `click` | No |  Default: `Integer.MIN_VALUE`. |
| `int` | `held` | No |  Default: `Integer.MIN_VALUE`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 19 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 39 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static FirstClickInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `FirstClickInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `FirstClickInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `FirstClickInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
