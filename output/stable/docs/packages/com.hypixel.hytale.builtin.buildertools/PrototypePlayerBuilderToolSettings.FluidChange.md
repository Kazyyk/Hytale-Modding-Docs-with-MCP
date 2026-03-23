---
title: "PrototypePlayerBuilderToolSettings.FluidChange"
kind: "record"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.PrototypePlayerBuilderToolSettings.FluidChange"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "clipboard"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public record FluidChange(int x, int y, int z, int fluidId, byte fluidLevel)
```

Inner record of [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) that stores a fluid position and state for clipboard transform operations. Created during selection copy/transform when fluid data is captured from the selection region. Coordinates are relative to the selection anchor.

## Record Components

| Component | Type | Description |
|---|---|---|
| `x` | `int` | X coordinate relative to the selection anchor. |
| `y` | `int` | Y coordinate relative to the selection anchor. |
| `z` | `int` | Z coordinate relative to the selection anchor. |
| `fluidId` | `int` | Numeric fluid type ID. |
| `fluidLevel` | `byte` | Fluid level at this position. |

## Related Types

- [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) -- enclosing class
- [PrototypePlayerBuilderToolSettings.EntityChange](PrototypePlayerBuilderToolSettings.EntityChange.md) -- companion record for entity data
