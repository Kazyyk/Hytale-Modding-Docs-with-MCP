---
title: "UVMotionCurveType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.UVMotionCurveType"
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
public enum UVMotionCurveType
```

Enum with 9 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Constant` | 0 | Constant speed UV motion. |
| `IncreaseLinear` | 1 | Linearly increasing speed. |
| `IncreaseQuartIn` | 2 | Quartic ease-in increasing speed. |
| `IncreaseQuartInOut` | 3 | Quartic ease-in-out increasing speed. |
| `IncreaseQuartOut` | 4 | Quartic ease-out increasing speed. |
| `DecreaseLinear` | 5 | Linearly decreasing speed. |
| `DecreaseQuartIn` | 6 | Quartic ease-in decreasing speed. |
| `DecreaseQuartInOut` | 7 | Quartic ease-in-out decreasing speed. |
| `DecreaseQuartOut` | 8 | Quartic ease-out decreasing speed. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `UVMotionCurveType` constant.

```java
public static UVMotionCurveType fromValue(int value)
```

Returns the `UVMotionCurveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`8`). The static `VALUES` array is used for O(1) lookup by ordinal.
