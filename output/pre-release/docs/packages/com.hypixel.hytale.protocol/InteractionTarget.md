---
title: "InteractionTarget"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionTarget"
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
public enum InteractionTarget
```

Identifies the target entity for an interaction effect.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `User` | 0 |  |
| `Owner` | 1 |  |
| `Target` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `InteractionTarget` constant.

```java
public static InteractionTarget fromValue(int value)
```

Returns the `InteractionTarget` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ApplyEffectInteraction](ApplyEffectInteraction.md)
- [ClearEntityEffectInteraction](ClearEntityEffectInteraction.md)
- [ChangeStatInteraction](ChangeStatInteraction.md)
- [EffectConditionInteraction](EffectConditionInteraction.md)
