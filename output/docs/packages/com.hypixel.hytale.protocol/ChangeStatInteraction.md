---
title: "ChangeStatInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChangeStatInteraction"
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
public class ChangeStatInteraction extends SimpleInteraction
```

An interaction (type ID 30) that modifies an entity stat using a specified behavior and value type. Extends SimpleInteraction.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [InteractionTarget](InteractionTarget.md) | `entityTarget` | No |  Default: `InteractionTarget.User`. |
| [ValueType](ValueType.md) | `valueType` | No |  Default: `ValueType.Percent`. |
| `Map<``Integer``, ``Float``>` | `statModifiers` | Yes |  |
| [ChangeStatBehaviour](ChangeStatBehaviour.md) | `changeStatBehaviour` | No |  Default: `ChangeStatBehaviour.Add`. |

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
public static ChangeStatInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ChangeStatInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ChangeStatInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ChangeStatInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ChangeStatBehaviour](ChangeStatBehaviour.md)
- [InteractionTarget](InteractionTarget.md)
- [Interaction](Interaction.md)
