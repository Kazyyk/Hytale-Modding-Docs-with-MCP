---
title: "NPCCombatActionEvaluatorPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.npccombatactionevaluator"
fqcn: "com.hypixel.hytale.builtin.npccombatactionevaluator.NPCCombatActionEvaluatorPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npccombatactionevaluator"
---

**Package:** `com.hypixel.hytale.builtin.npccombatactionevaluator`

```java
public class NPCCombatActionEvaluatorPlugin extends JavaPlugin
```

Plugin that registers NPC combat action evaluation components, systems, asset stores, and conditions.

## Constants

| Type | Name |
|---|---|
| `String` | `CAE_MARKED_TARGET_SLOT` |
| `String` | `CAE_MIN_RANGE_PARAMETER` |
| `String` | `CAE_MAX_RANGE_PARAMETER` |
| `String` | `CAE_POSITIONING_ANGLE_PARAMETER` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `NPCCombatActionEvaluatorPlugin` | `get()` |
| `protected` | `void` | `setup()` |
| `public` | `ComponentType<EntityStore, TargetMemory>` | `getTargetMemoryComponentType()` |
| `public` | `ComponentType<EntityStore, CombatActionEvaluator>` | `getCombatActionEvaluatorComponentType()` |
| `public` | `ComponentType<EntityStore, CombatActionEvaluatorSystems.CombatConstructionData>` | `getCombatConstructionDataComponentType()` |
| `public` | `ComponentType<EntityStore, DamageMemory>` | `getDamageMemoryComponentType()` |
