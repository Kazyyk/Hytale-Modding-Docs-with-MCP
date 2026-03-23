---
title: "EntityUIComponent"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityUIComponent"
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
public class EntityUIComponent
```

Defines an entity UI overlay component configuration for stat bars or combat text display.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [EntityUIType](EntityUIType.md) | `type` | No |  Default: `EntityUIType.EntityStat`. |
| [Vector2f](Vector2f.md) | `hitboxOffset` | Yes |  |
| `boolean` | `unknown` | No |  |
| `int` | `entityStatIndex` | No |  |
| [RangeVector2f](RangeVector2f.md) | `combatTextRandomPositionOffsetRange` | Yes |  |
| `float` | `combatTextViewportMargin` | No |  |
| `float` | `combatTextDuration` | No |  |
| `float` | `combatTextHitAngleModifierStrength` | No |  |
| `float` | `combatTextFontSize` | No |  |
| [Color](Color.md) | `combatTextColor` | Yes |  |
| [CombatTextEntityUIComponentAnimationEvent](CombatTextEntityUIComponentAnimationEvent.md)`[]` | `combatTextAnimationEvents` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 51 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 51 |
| `MAX_SIZE` | 139,264,056 |

Binary layout: 1 null-bit byte + 51 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityUIComponent deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityUIComponent` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityUIComponent` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityUIComponent` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EntityUIType](EntityUIType.md)
- [CombatTextEntityUIComponentAnimationEvent](CombatTextEntityUIComponentAnimationEvent.md)
