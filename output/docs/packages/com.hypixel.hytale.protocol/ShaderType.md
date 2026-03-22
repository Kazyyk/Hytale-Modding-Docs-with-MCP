---
title: "ShaderType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ShaderType"
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
public enum ShaderType
```

Enum with 10 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No special shader. |
| `Wind` | 1 | Wind animation shader. |
| `WindAttached` | 2 | Wind shader attached to surface. |
| `WindRandom` | 3 | Randomized wind shader. |
| `WindFractal` | 4 | Fractal wind pattern shader. |
| `Ice` | 5 | Ice surface shader. |
| `Water` | 6 | Water surface shader. |
| `Lava` | 7 | Lava surface shader. |
| `Slime` | 8 | Slime surface shader. |
| `Ripple` | 9 | Ripple effect shader. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ShaderType` constant.

```java
public static ShaderType fromValue(int value)
```

Returns the `ShaderType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`9`). The static `VALUES` array is used for O(1) lookup by ordinal.
