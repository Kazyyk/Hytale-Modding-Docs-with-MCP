---
title: "RootInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RootInteraction"
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
public class RootInteraction
```

Top-level interaction entry point (not in Interaction hierarchy)

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| `int``[]` | `interactions` | Yes | |
| [InteractionCooldown](InteractionCooldown.md) | `cooldown` | Yes | |
| `Map<`[GameMode](GameMode.md)`, `[RootInteractionSettings](RootInteractionSettings.md)`>` | `settings` | Yes | |
| [InteractionRules](InteractionRules.md) | `rules` | Yes | |
| `int``[]` | `tags` | Yes | |
| `float` | `clickQueuingTimeout` | No | |
| `boolean` | `requireNewClick` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 30 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static RootInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RootInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `RootInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `RootInteraction` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [GameMode](GameMode.md)
- [InteractionCooldown](InteractionCooldown.md)
- [InteractionRules](InteractionRules.md)
- [RootInteractionSettings](RootInteractionSettings.md)
