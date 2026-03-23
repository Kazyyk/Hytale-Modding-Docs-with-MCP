---
title: "StaticModifier.CalculationType"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.modifier.StaticModifier.CalculationType"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "modifiers"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.modifier`

```java
public static enum StaticModifier.CalculationType
```

Defines how a `StaticModifier` transforms a stat bound value.

## Enum Constants

| Constant | Formula | Description |
|---|---|---|
| `ADDITIVE` | `value + amount` | Adds the amount to the bound. |
| `MULTIPLICATIVE` | `value * amount` | Multiplies the bound by the amount. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `compute(float value, float amount)` | `float` | Applies the calculation to the given inputs. |
| `createKey(String armor)` | `String` | Creates a modifier map key by appending `_ADDITIVE` or `_MULTIPLICATIVE`. |
