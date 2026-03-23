---
title: "StateEvaluator"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.stateevaluator"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.stateevaluator.StateEvaluator"
api_surface: false
extends: "Evaluator<StateOption>"
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.decisionmaker.stateevaluator`

```java
public class StateEvaluator extends Evaluator<StateOption> implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `rawOptions` | `StateOption[]` | StateOption[] field. |
| `executeFrequency` | `double` | double field. |
| `stateChangeCooldown` | `double` | double field. |
| `minimumUtility` | `double` | double field. |
| `timeUntilNextExecute` | `double` | double field. |
| `active` | `boolean` | boolean field. |

## Constructors

| Constructor | Description |
|---|---|
| `StateEvaluator()` | Creates a new StateEvaluator instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, StateEvaluator>` | static public method. |
| `isActive()` | `boolean` | public method. |
| `setActive(boolean active)` | `void` | public method. |
| `getEvaluationContext()` | `EvaluationContext` | public method. |
| `prepareOptions(@Nonnull StateMappingHelper stateHelper)` | `void` | public method. |
| `shouldExecute(double interval)` | `boolean` | public method. |
| `prepareEvaluationContext(@Nonnull EvaluationContext context)` | `void` | public method. |
| `onStateSwitched()` | `void` | public method. |
| `toString()` | `String` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
