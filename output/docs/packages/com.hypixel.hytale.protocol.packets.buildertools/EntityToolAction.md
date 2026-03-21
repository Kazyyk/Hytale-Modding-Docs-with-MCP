---
title: "EntityToolAction"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.EntityToolAction"
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
public enum EntityToolAction
```

Actions for the entity tool packet.

## Enum Constants

| Constant | Value |
|---|---|
| `Remove` | `0` |
| `Duplicate` | `1` |
| `Copy` | `2` |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `EntityToolAction[]` | Cached array of all enum constants |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getValue()` | `int` | Returns the integer value of this constant |
| `fromValue(int)` | `EntityToolAction` | Returns the constant for the given value, throws `ProtocolException` if invalid |
