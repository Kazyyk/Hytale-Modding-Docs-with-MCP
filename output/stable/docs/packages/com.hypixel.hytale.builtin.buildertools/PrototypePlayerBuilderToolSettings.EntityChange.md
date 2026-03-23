---
title: "PrototypePlayerBuilderToolSettings.EntityChange"
kind: "record"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.PrototypePlayerBuilderToolSettings.EntityChange"
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
public record EntityChange(double x, double y, double z, Holder<EntityStore> entityHolder)
```

Inner record of [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) that stores an entity's position and cloned holder data for clipboard transform operations. Created during selection copy/transform when entities are captured from the selection region.

## Record Components

| Component | Type | Description |
|---|---|---|
| `x` | `double` | World X coordinate of the entity. |
| `y` | `double` | World Y coordinate of the entity. |
| `z` | `double` | World Z coordinate of the entity. |
| `entityHolder` | `Holder<EntityStore>` | Cloned entity holder containing all entity components. |

## Related Types

- [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) -- enclosing class
- [PrototypePlayerBuilderToolSettings.FluidChange](PrototypePlayerBuilderToolSettings.FluidChange.md) -- companion record for fluid data
