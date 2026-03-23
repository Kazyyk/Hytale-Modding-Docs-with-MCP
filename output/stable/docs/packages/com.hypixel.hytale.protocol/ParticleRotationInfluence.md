---
title: "ParticleRotationInfluence"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleRotationInfluence"
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
public enum ParticleRotationInfluence
```

Enum with 5 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No rotation influence. |
| `Billboard` | 1 | Billboard facing (always faces camera). |
| `BillboardY` | 2 | Billboard on Y-axis only. |
| `BillboardVelocity` | 3 | Billboard aligned with velocity direction. |
| `Velocity` | 4 | Rotation follows velocity direction. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ParticleRotationInfluence` constant.

```java
public static ParticleRotationInfluence fromValue(int value)
```

Returns the `ParticleRotationInfluence` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
