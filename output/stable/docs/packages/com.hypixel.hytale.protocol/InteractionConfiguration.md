---
title: "InteractionConfiguration"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionConfiguration"
api_surface: false
extends: ~
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
public class InteractionConfiguration
```

Top-level interaction system configuration including outline display, per-game-mode use distances, and per-type priorities.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `displayOutlines` | No |  Default: `true`. |
| `boolean` | `debugOutlines` | No |  |
| `Map<`[GameMode](GameMode.md)`, ``Float``>` | `useDistance` | Yes |  |
| `boolean` | `allEntities` | No |  |
| `Map<`[InteractionType](InteractionType.md)`, `[InteractionPriority](InteractionPriority.md)`>` | `priorities` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 12 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 4 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionConfiguration deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionConfiguration` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionConfiguration` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionConfiguration` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [GameMode](GameMode.md)
- [InteractionType](InteractionType.md)
- [InteractionPriority](InteractionPriority.md)
