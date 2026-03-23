---
title: "StaticModifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.modifier.StaticModifier"
api_surface: true
extends: "Modifier"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "modifiers"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.modifier`

```java
public class StaticModifier extends Modifier
```

A concrete `Modifier` that applies a fixed additive or multiplicative adjustment to a stat bound. This is the only modifier type supported on the client for network replication.

## Fields

| Field | Type | JSON Key | Description |
|---|---|---|---|
| `calculationType` | `CalculationType` | `CalculationType` | How the amount is applied. |
| `amount` | `float` | `Amount` | The modifier value. |

## Constructors

```java
public StaticModifier(Modifier.ModifierTarget target, StaticModifier.CalculationType calculationType, float amount)
```

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getCalculationType()` | `CalculationType` | Returns the calculation type. |
| `getAmount()` | `float` | Returns the modifier amount. |
| `apply(float statValue)` | `float` | Applies `calculationType.compute(statValue, amount)`. |
| `toPacket()` | `Modifier` (protocol) | Converts to protocol format with `CalculationType` and `amount`. |

## Inner Types

- [StaticModifier.CalculationType](StaticModifier.CalculationType.md)
