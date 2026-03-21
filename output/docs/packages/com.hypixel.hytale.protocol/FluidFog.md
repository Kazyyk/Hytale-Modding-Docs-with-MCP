---
title: "FluidFog"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FluidFog"
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
public enum FluidFog
```

Identifies the fog color source when submerged in a fluid.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Color` | 0 |  |
| `ColorLight` | 1 |  |
| `EnvironmentTint` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `FluidFog` constant.

```java
public static FluidFog fromValue(int value)
```

Returns the `FluidFog` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [FluidFX](FluidFX.md)
- [Color](Color.md)
