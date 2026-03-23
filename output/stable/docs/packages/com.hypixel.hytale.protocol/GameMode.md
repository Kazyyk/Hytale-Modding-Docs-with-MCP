---
title: "GameMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.GameMode"
api_surface: true
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
public enum GameMode
```

Identifies the player's game mode.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Adventure` | 0 | Standard gameplay with survival mechanics and progression. |
| `Creative` | 1 | Unrestricted building mode with full block/item access. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `GameMode` constant.

```java
public static GameMode fromValue(int value)
```

Returns the `GameMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ConditionInteraction](ConditionInteraction.md)
- [InteractionConfiguration](InteractionConfiguration.md)
- [InteractionSettings](InteractionSettings.md)
