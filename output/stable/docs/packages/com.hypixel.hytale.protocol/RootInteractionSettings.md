---
title: "RootInteractionSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RootInteractionSettings"
api_surface: true
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
public class RootInteractionSettings
```

Protocol data structure in the Interaction System (extends Interaction/SimpleInteraction) group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `allowSkipChainOnClick` | No | |
| [InteractionCooldown](InteractionCooldown.md) | `cooldown` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 2 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 2 |
| `MAX_SIZE` | 32,768,028 |

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static RootInteractionSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RootInteractionSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `RootInteractionSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `RootInteractionSettings` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionCooldown](InteractionCooldown.md)
