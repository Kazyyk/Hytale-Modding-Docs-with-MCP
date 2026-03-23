---
title: "ParticleCollisionAction"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleCollisionAction"
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
public enum ParticleCollisionAction
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Expire` | 0 | Particle expires on collision. |
| `LastFrame` | 1 | Particle plays its last animation frame on collision. |
| `Linger` | 2 | Particle lingers at the collision point. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ParticleCollisionAction` constant.

```java
public static ParticleCollisionAction fromValue(int value)
```

Returns the `ParticleCollisionAction` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
