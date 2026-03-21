---
title: "ShadingMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ShadingMode"
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
public enum ShadingMode
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Standard` | 0 | Standard lighting and shading. |
| `Flat` | 1 | Flat shading with no lighting gradients. |
| `Fullbright` | 2 | Fully lit, ignores lighting. |
| `Reflective` | 3 | Reflective surface shading. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ShadingMode` constant.

```java
public static ShadingMode fromValue(int value)
```

Returns the `ShadingMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
