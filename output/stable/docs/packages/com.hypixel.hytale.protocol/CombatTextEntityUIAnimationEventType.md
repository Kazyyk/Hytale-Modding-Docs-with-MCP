---
title: "CombatTextEntityUIAnimationEventType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CombatTextEntityUIAnimationEventType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum CombatTextEntityUIAnimationEventType
```

Identifies the type of animation applied to combat text UI elements.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Scale` | 0 |  |
| `Position` | 1 |  |
| `Opacity` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `CombatTextEntityUIAnimationEventType` constant.

```java
public static CombatTextEntityUIAnimationEventType fromValue(int value)
```

Returns the `CombatTextEntityUIAnimationEventType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [CombatTextEntityUIComponentAnimationEvent](CombatTextEntityUIComponentAnimationEvent.md)
