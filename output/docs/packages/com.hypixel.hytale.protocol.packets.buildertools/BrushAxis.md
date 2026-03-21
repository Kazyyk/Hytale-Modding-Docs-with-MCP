---
title: "BrushAxis"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BrushAxis"
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
public enum BrushAxis
```

Brush axis selection for builder tool brush operations.

## Enum Constants

| Constant | Value |
|---|---|
| `None` | `0` |
| `Auto` | `1` |
| `X` | `2` |
| `Y` | `3` |
| `Z` | `4` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `BrushAxis[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `BrushAxis` | Returns the constant for the given value, throws `ProtocolException` if invalid |
