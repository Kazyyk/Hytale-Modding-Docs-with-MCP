---
title: "VelocityThresholdStyle"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.VelocityThresholdStyle"
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
public enum VelocityThresholdStyle
```

Enum with 2 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Linear` | 0 | Linear velocity threshold falloff. |
| `Exp` | 1 | Exponential velocity threshold falloff. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `VelocityThresholdStyle` constant.

```java
public static VelocityThresholdStyle fromValue(int value)
```

Returns the `VelocityThresholdStyle` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
