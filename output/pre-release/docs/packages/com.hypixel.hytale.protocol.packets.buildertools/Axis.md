---
title: "Axis"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.Axis"
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
public enum Axis
```

Axis enum representing the three spatial dimensions.

## Enum Constants

| Constant | Value |
|---|---|
| `X` | `0` |
| `Y` | `1` |
| `Z` | `2` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `Axis[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `Axis` | Returns the constant for the given value, throws `ProtocolException` if invalid |
