---
title: "EasingType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EasingType"
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
public enum EasingType
```

Standard easing function library with 31 functions covering linear, polynomial (quad through quint), trigonometric, exponential, circular, elastic, back, and bounce curves.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Linear` | 0 |  |
| `QuadIn` | 1 |  |
| `QuadOut` | 2 |  |
| `QuadInOut` | 3 |  |
| `CubicIn` | 4 |  |
| `CubicOut` | 5 |  |
| `CubicInOut` | 6 |  |
| `QuartIn` | 7 |  |
| `QuartOut` | 8 |  |
| `QuartInOut` | 9 |  |
| `QuintIn` | 10 |  |
| `QuintOut` | 11 |  |
| `QuintInOut` | 12 |  |
| `SineIn` | 13 |  |
| `SineOut` | 14 |  |
| `SineInOut` | 15 |  |
| `ExpoIn` | 16 |  |
| `ExpoOut` | 17 |  |
| `ExpoInOut` | 18 |  |
| `CircIn` | 19 |  |
| `CircOut` | 20 |  |
| `CircInOut` | 21 |  |
| `ElasticIn` | 22 |  |
| `ElasticOut` | 23 |  |
| `ElasticInOut` | 24 |  |
| `BackIn` | 25 |  |
| `BackOut` | 26 |  |
| `BackInOut` | 27 |  |
| `BounceIn` | 28 |  |
| `BounceOut` | 29 |  |
| `BounceInOut` | 30 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EasingType` constant.

```java
public static EasingType fromValue(int value)
```

Returns the `EasingType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`30`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [EasingConfig](EasingConfig.md)
