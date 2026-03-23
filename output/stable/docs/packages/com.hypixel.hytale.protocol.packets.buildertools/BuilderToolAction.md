---
title: "BuilderToolAction"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolAction"
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
public enum BuilderToolAction
```

Actions available for the general builder tool packet.

## Enum Constants

| Constant | Value |
|---|---|
| `SelectionPosition1` | `0` |
| `SelectionPosition2` | `1` |
| `SelectionCopy` | `2` |
| `HistoryUndo` | `3` |
| `HistoryRedo` | `4` |
| `ActivateToolMode` | `5` |
| `DeactivateToolMode` | `6` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `BuilderToolAction[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `BuilderToolAction` | Returns the constant for the given value, throws `ProtocolException` if invalid |
