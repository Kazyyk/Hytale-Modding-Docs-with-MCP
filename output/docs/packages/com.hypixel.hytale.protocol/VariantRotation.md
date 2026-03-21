---
title: "VariantRotation"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.VariantRotation"
api_surface: false
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
public enum VariantRotation
```

Enum with 8 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No variant rotation. |
| `Wall` | 1 | Wall-facing rotation variants. |
| `UpDown` | 2 | Up/down orientation variants. |
| `Pipe` | 3 | Single-axis pipe rotation. |
| `DoublePipe` | 4 | Dual-axis pipe rotation. |
| `NESW` | 5 | Four cardinal direction variants. |
| `UpDownNESW` | 6 | Six-direction variants (up, down, N, E, S, W). |
| `All` | 7 | All rotation variants. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `VariantRotation` constant.

```java
public static VariantRotation fromValue(int value)
```

Returns the `VariantRotation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`7`). The static `VALUES` array is used for O(1) lookup by ordinal.
