---
title: "CombatActionEvaluatorConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator"
fqcn: "com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator.CombatActionEvaluatorConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "combat"
  - "evaluator"
---

**Package:** `com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator`

```java
public class CombatActionEvaluatorConfig
```

Configuration class for the NPC combat action evaluator. Defines available combat actions, action sets per substate, run conditions, utility thresholds, and predictability settings. Deserialized from JSON via a `BuilderCodec`.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `BuilderCodec<CombatActionEvaluatorConfig> CODEC =` | `BuilderCodec.builder( CombatActionEvaluatorConfig.class, CombatActionEvaluatorConfig::new )` |
| `public` | `Map<String, String>` | `getAvailableActions()` |
| `public` | `Map<String, CombatActionEvaluatorConfig.ActionSet>` | `getActionSets()` |
| `public` | `String[]` | `getRunConditions()` |
| `public` | `double` | `getMinRunUtility()` |
| `public` | `double` | `getMinActionUtility()` |
| `public` | `double[]` | `getPredictabilityRange()` |
| `public` | `String` | `toString()` |
| `public static final` | `BuilderCodec<CombatActionEvaluatorConfig.ActionSet> CODEC =` | `BuilderCodec.builder( CombatActionEvaluatorConfig.ActionSet.class, CombatActionEvaluatorConfig.ActionSet::new )` |
| `public` | `CombatActionEvaluatorConfig.BasicAttacks` | `getBasicAttacks()` |
| `public` | `String[]` | `getCombatActions()` |
| `public` | `String` | `toString()` |
| `public static final` | `BuilderCodec<CombatActionEvaluatorConfig.BasicAttacks> CODEC =` | `BuilderCodec.builder( CombatActionEvaluatorConfig.BasicAttacks.class, CombatActionEvaluatorConfig.BasicAttacks::new )` |
| `public` | `String[]` | `getAttacks()` |
| `public` | `boolean` | `isRandom()` |
| `public` | `double` | `getMaxRange()` |
| `public` | `double` | `getMaxRangeSquared()` |
| `public` | `float` | `getTimeout()` |
| `public` | `double[]` | `getCooldownRange()` |
| `public` | `Map<String, String>` | `getInteractionVars(InteractionContext c)` |
