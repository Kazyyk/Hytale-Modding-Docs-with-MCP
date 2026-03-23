---
title: "PaletteType"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.PaletteType"
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
public enum PaletteType
```

Palette encoding type for chunk data serialization. Determines the bit width of block/fluid indices in a palette-compressed chunk section.

## Values

| Name | Value |
|---|---|
| `Empty` | `0` |
| `HalfByte` | `1` |
| `Byte` | `2` |
| `Short` | `3` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getValue()` |
| `public static` | `PaletteType` | `fromValue(int value)` |
