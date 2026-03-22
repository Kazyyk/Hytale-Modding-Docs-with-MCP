---
title: "ParticleScaleRatioConstraint"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleScaleRatioConstraint"
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
public enum ParticleScaleRatioConstraint
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `OneToOne` | 0 | Scale ratio locked at 1:1. |
| `Preserved` | 1 | Original aspect ratio is preserved. |
| `None` | 2 | No scale ratio constraint. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ParticleScaleRatioConstraint` constant.

```java
public static ParticleScaleRatioConstraint fromValue(int value)
```

Returns the `ParticleScaleRatioConstraint` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
