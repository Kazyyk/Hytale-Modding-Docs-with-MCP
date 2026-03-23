---
title: "EffectDirection"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EffectDirection"
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
public enum EffectDirection
```

Specifies the directional flow of a visual effect.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 |  |
| `BottomUp` | 1 |  |
| `TopDown` | 2 |  |
| `ToCenter` | 3 |  |
| `FromCenter` | 4 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EffectDirection` constant.

```java
public static EffectDirection fromValue(int value)
```

Returns the `EffectDirection` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
