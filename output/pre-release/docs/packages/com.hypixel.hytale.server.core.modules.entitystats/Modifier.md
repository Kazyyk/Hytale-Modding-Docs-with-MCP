---
title: "Modifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.modifier.Modifier"
api_surface: true
implements:
  - "NetworkSerializable<Modifier>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "modifiers"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.modifier`

```java
public abstract class Modifier implements NetworkSerializable<Modifier>
```

Abstract base class for stat value modifiers. A modifier targets either the `MIN` or `MAX` bound of a stat value. Concrete implementations define how the modifier transforms the bound.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `CodecMapCodec<Modifier>` | Polymorphic codec. Registered types: "Boost" and "Static" (both `StaticModifier`). |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `apply(float)` | `float` | Abstract. Applies this modifier to a stat bound value. |
| `getTarget()` | `ModifierTarget` | Returns whether this modifier targets `MIN` or `MAX`. |
| `toPacket()` | `Modifier` (protocol) | Converts to protocol format. Only `StaticModifier` is supported on the client. |

## Inner Types

- [Modifier.ModifierTarget](Modifier.ModifierTarget.md)

## Related Types

- [StaticModifier](StaticModifier.md) -- concrete modifier with additive/multiplicative calculation
- [DefaultModifiers](DefaultModifiers.md) -- well-known modifier key constants
