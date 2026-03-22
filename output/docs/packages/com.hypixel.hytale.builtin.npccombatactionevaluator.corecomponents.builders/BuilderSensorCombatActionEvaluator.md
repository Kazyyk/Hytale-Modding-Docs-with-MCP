---
title: "BuilderSensorCombatActionEvaluator"
kind: "class"
package: "com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents.builders"
fqcn: "com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents.builders.BuilderSensorCombatActionEvaluator"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builders"
---

**Package:** `com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents.builders`

```java
public class BuilderSensorCombatActionEvaluator extends BuilderSensorBase
```

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Fields

| Field | Type | Description |
|---|---|---|
| `minRangeStoreSlot` | `ToIntFunction<BuilderSupport>` | ToIntFunction<BuilderSupport> field. |
| `maxRangeStoreSlot` | `ToIntFunction<BuilderSupport>` | ToIntFunction<BuilderSupport> field. |
| `positioningAngleStoreSlot` | `ToIntFunction<BuilderSupport>` | ToIntFunction<BuilderSupport> field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(@Nonnull BuilderSupport builderSupport)` | `Sensor` | public method. |
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `BuilderSensorCombatActionEvaluator` | public method. |
| `isTargetInRange(@Nonnull BuilderSupport support)` | `boolean` | public method. |
| `getMinRangeStoreSlot(BuilderSupport support)` | `int` | public method. |
| `getMaxRangeStoreSlot(BuilderSupport support)` | `int` | public method. |
| `getPositioningAngleStoreSlot(BuilderSupport support)` | `int` | public method. |
| `getAllowableDeviation(@Nonnull BuilderSupport support)` | `double` | public method. |
| `getTargetSlot(@Nonnull BuilderSupport support)` | `int` | public method. |
