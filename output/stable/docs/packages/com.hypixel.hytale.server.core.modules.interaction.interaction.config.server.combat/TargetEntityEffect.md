---
title: "TargetEntityEffect"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.TargetEntityEffect"
api_surface: false
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
public class TargetEntityEffect
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `duration` |
| `protected` | `double` | `chance` |
| `protected` | `Object2DoubleMap<String>` | `entityTypeDurationModifiers` |
| `protected` | `OverlapBehavior` | `overlapBehavior` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `TargetEntityEffect(float duration, double chance, Object2DoubleMap<String> entityTypeDurationModifiers, OverlapBehavior overlapBehavior)` |
| `protected` | `` | `TargetEntityEffect()` |
| `public` | `float` | `getDuration()` |
| `public` | `double` | `getChance()` |
| `public` | `Object2DoubleMap<String>` | `getEntityTypeDurationModifiers()` |
| `public` | `OverlapBehavior` | `getOverlapBehavior()` |
| `public` | `String` | `toString()` |
