---
title: "SoftParticle"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SoftParticle"
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
public enum SoftParticle
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Enable` | 0 | Enable soft particle rendering. |
| `Disable` | 1 | Disable soft particle rendering. |
| `Require` | 2 | Require soft particle support. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `SoftParticle` constant.

```java
public static SoftParticle fromValue(int value)
```

Returns the `SoftParticle` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
