---
title: "ItemReticleClientEvent"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemReticleClientEvent"
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
public enum ItemReticleClientEvent
```

Identifies client-side events that can trigger reticle animations.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `OnHit` | 0 |  |
| `Wielding` | 1 |  |
| `OnMovementLeft` | 2 |  |
| `OnMovementRight` | 3 |  |
| `OnMovementBack` | 4 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ItemReticleClientEvent` constant.

```java
public static ItemReticleClientEvent fromValue(int value)
```

Returns the `ItemReticleClientEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ItemReticleConfig](ItemReticleConfig.md)
