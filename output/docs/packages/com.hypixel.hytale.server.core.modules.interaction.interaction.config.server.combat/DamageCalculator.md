---
title: "DamageCalculator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DamageCalculator"
api_surface: true
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "combat"
---
**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public class DamageCalculator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `DamageCalculator.Type` | `type` |
| `protected` | `DamageClass` | `damageClass` |
| `protected` | `Object2FloatMap<String>` | `baseDamageRaw` |
| `protected` | `float` | `sequentialModifierStep` |
| `protected` | `float` | `sequentialModifierMinimum` |
| `protected` | `float` | `randomPercentageModifier` |
| `protected transient` | `Int2FloatMap` | `baseDamage` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `DamageCalculator()` |
| `public` | `Object2FloatMap<DamageCause>` | `calculateDamage(double durationSeconds)` |
| `private` | `float` | `scaleDamage(double durationSeconds, float damage)` |
| `public` | `DamageCalculator.Type` | `getType()` |
| `public` | `DamageClass` | `getDamageClass()` |
| `public` | `float` | `getSequentialModifierStep()` |
| `public` | `float` | `getSequentialModifierMinimum()` |
| `public` | `boolean` | `equals(Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
