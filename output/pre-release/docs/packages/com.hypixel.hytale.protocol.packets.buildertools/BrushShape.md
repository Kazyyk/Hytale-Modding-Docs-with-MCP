---
title: "BrushShape"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BrushShape"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "protocol"
  - "buildertools"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol.packets.buildertools`

```java
public enum BrushShape
```

Shape presets for builder tool brush operations.

## Enum Constants

| Constant | Value |
|---|---|
| `Cube` | `0` |
| `Sphere` | `1` |
| `Cylinder` | `2` |
| `Cone` | `3` |
| `InvertedCone` | `4` |
| `Pyramid` | `5` |
| `InvertedPyramid` | `6` |
| `Dome` | `7` |
| `InvertedDome` | `8` |
| `Diamond` | `9` |
| `Torus` | `10` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `BrushShape[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `BrushShape` | Returns the constant for the given value, throws `ProtocolException` if invalid |
