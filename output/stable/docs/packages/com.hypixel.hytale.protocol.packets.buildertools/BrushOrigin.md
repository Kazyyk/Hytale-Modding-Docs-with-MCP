---
title: "BrushOrigin"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BrushOrigin"
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
public enum BrushOrigin
```

Origin point for brush placement in builder tools.

## Enum Constants

| Constant | Value |
|---|---|
| `Center` | `0` |
| `Bottom` | `1` |
| `Top` | `2` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `BrushOrigin[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `BrushOrigin` | Returns the constant for the given value, throws `ProtocolException` if invalid |
