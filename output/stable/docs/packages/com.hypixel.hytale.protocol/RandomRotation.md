---
title: "RandomRotation"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RandomRotation"
api_surface: true
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
public enum RandomRotation
```

Enum with 5 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No random rotation. |
| `YawPitchRollStep1` | 1 | Random yaw, pitch, and roll in 1-degree steps. |
| `YawStep1` | 2 | Random yaw in 1-degree steps. |
| `YawStep1XZ` | 3 | Random yaw in 1-degree steps on XZ plane. |
| `YawStep90` | 4 | Random yaw in 90-degree steps. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `RandomRotation` constant.

```java
public static RandomRotation fromValue(int value)
```

Returns the `RandomRotation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
