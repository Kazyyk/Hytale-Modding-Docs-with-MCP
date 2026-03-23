---
title: "BuilderToolArgType"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolArgType"
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
public enum BuilderToolArgType
```

Type discriminator for builder tool argument values.

## Enum Constants

| Constant | Value |
|---|---|
| `Bool` | `0` |
| `Float` | `1` |
| `Int` | `2` |
| `String` | `3` |
| `Block` | `4` |
| `Mask` | `5` |
| `BrushShape` | `6` |
| `BrushOrigin` | `7` |
| `BrushAxis` | `8` |
| `Rotation` | `9` |
| `Option` | `10` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `BuilderToolArgType[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `BuilderToolArgType` | Returns the constant for the given value, throws `ProtocolException` if invalid |
