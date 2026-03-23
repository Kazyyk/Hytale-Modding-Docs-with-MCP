---
title: "InteractionRules"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionRules"
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
public class InteractionRules
```

Defines interaction blocking and interruption relationships with other interaction types.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [InteractionType](InteractionType.md)`[]` | `blockedBy` | Yes |  |
| [InteractionType](InteractionType.md)`[]` | `blocking` | Yes |  |
| [InteractionType](InteractionType.md)`[]` | `interruptedBy` | Yes |  |
| [InteractionType](InteractionType.md)`[]` | `interrupting` | Yes |  |
| `int` | `blockedByBypassIndex` | No |  |
| `int` | `blockingBypassIndex` | No |  |
| `int` | `interruptedByBypassIndex` | No |  |
| `int` | `interruptingBypassIndex` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 17 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 33 |
| `MAX_SIZE` | 16,384,053 |

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionRules deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionRules` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionRules` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionRules` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionType](InteractionType.md)
- [Interaction](Interaction.md)
