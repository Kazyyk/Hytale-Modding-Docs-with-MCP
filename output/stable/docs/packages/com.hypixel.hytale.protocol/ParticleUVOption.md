---
title: "ParticleUVOption"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleUVOption"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
  - "particle"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum ParticleUVOption
```

Enum with 7 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No UV modification. |
| `RandomFlipU` | 1 | Randomly flip texture U coordinate. |
| `RandomFlipV` | 2 | Randomly flip texture V coordinate. |
| `RandomFlipUV` | 3 | Randomly flip both U and V coordinates. |
| `FlipU` | 4 | Always flip texture U coordinate. |
| `FlipV` | 5 | Always flip texture V coordinate. |
| `FlipUV` | 6 | Always flip both U and V coordinates. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ParticleUVOption` constant.

```java
public static ParticleUVOption fromValue(int value)
```

Returns the `ParticleUVOption` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`6`). The static `VALUES` array is used for O(1) lookup by ordinal.
