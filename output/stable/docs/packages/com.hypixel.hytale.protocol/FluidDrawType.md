---
title: "FluidDrawType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FluidDrawType"
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
public enum FluidDrawType
```

Determines how a fluid is visually rendered.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 |  |
| `Liquid` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `FluidDrawType` constant.

```java
public static FluidDrawType fromValue(int value)
```

Returns the `FluidDrawType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [Fluid](Fluid.md)
