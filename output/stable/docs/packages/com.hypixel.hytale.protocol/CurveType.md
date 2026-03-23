---
title: "CurveType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CurveType"
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
public enum CurveType
```

Identifies an interpolation curve type for animation or easing.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Linear` | 0 |  |
| `QuartIn` | 1 |  |
| `QuartOut` | 2 |  |
| `QuartInOut` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `CurveType` constant.

```java
public static CurveType fromValue(int value)
```

Returns the `CurveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
