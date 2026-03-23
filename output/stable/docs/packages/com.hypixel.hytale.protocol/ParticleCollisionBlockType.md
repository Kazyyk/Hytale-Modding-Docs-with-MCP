---
title: "ParticleCollisionBlockType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleCollisionBlockType"
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
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum ParticleCollisionBlockType
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No block collision. |
| `Air` | 1 | Collide with air blocks. |
| `Solid` | 2 | Collide with solid blocks. |
| `All` | 3 | Collide with all block types. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ParticleCollisionBlockType` constant.

```java
public static ParticleCollisionBlockType fromValue(int value)
```

Returns the `ParticleCollisionBlockType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
