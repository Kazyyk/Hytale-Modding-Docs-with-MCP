---
title: "FXRenderMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FXRenderMode"
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
public enum FXRenderMode
```

Identifies the rendering blend mode for visual effects.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `BlendLinear` | 0 |  |
| `BlendAdd` | 1 |  |
| `Erosion` | 2 |  |
| `Distortion` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `FXRenderMode` constant.

```java
public static FXRenderMode fromValue(int value)
```

Returns the `FXRenderMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
