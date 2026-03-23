---
title: "RotationDirection"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.RotationDirection"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packets"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol.packets.world`

```java
public enum RotationDirection
```

Direction of rotation (clockwise vs counterclockwise) for block and editor rotation operations.

## Values

| Name | Value |
|---|---|
| `Positive` | `0` |
| `Negative` | `1` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getValue()` |
| `public static` | `RotationDirection` | `fromValue(int value)` |
