---
title: "CombatTextEntityUIComponentAnimationEvent"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CombatTextEntityUIComponentAnimationEvent"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "entity"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class CombatTextEntityUIComponentAnimationEvent
```

Defines a single animation keyframe for combat text display, including timing, scale, position offset, and opacity.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [CombatTextEntityUIAnimationEventType](CombatTextEntityUIAnimationEventType.md) | `type` | No |  Default: `CombatTextEntityUIAnimationEventType.Scale`. |
| `float` | `startAt` | No |  |
| `float` | `endAt` | No |  |
| `float` | `startScale` | No |  |
| `float` | `endScale` | No |  |
| [Vector2f](Vector2f.md) | `positionOffset` | Yes |  |
| `float` | `startOpacity` | No |  |
| `float` | `endOpacity` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 34 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 34 |
| `MAX_SIZE` | 34 |

Binary layout: 1 null-bit byte + 34 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CombatTextEntityUIComponentAnimationEvent deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CombatTextEntityUIComponentAnimationEvent` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CombatTextEntityUIComponentAnimationEvent` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CombatTextEntityUIComponentAnimationEvent` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CombatTextEntityUIAnimationEventType](CombatTextEntityUIAnimationEventType.md)
- [EntityUIComponent](EntityUIComponent.md)
