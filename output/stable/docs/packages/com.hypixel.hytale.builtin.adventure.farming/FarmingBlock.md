---
title: "FarmingBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.states"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.states.FarmingBlock"
api_surface: false
extends: null
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "component"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.states`

```java
public class FarmingBlock implements Component<ChunkStore>
```

A `ChunkStore` component tracking the growth state of a farming block. Stores the current stage set name, growth progress (float for sub-stage interpolation), the last game-time tick, a generation counter (incremented on each stage advance for deterministic randomization), an optional previous block type (for prefab stages), the spread rate, and the execution counter (for spread stages).

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `String` | `DEFAULT_STAGE_SET` | `"Default"` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private` | `String` | `currentStageSet` | `"Default"` |
| `private` | `float` | `growthProgress` | `0.0F` |
| `private` | `Instant` | `lastTickGameTime` | `null` |
| `private` | `int` | `generation` | `0` |
| `private` | `String` | `previousBlockType` | `null` |
| `private` | `float` | `spreadRate` | `1.0F` |
| `private` | `int` | `executions` | `0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, FarmingBlock>` | `getComponentType()` |
| `@Nonnull public` | `String` | `getCurrentStageSet()` |
| `public` | `void` | `setCurrentStageSet(@Nullable String currentStageSet)` |
| `public` | `float` | `getGrowthProgress()` |
| `public` | `void` | `setGrowthProgress(float growthProgress)` |
| `public` | `Instant` | `getLastTickGameTime()` |
| `public` | `void` | `setLastTickGameTime(Instant lastTickGameTime)` |
| `public` | `int` | `getGeneration()` |
| `public` | `void` | `setGeneration(int generation)` |
| `public` | `String` | `getPreviousBlockType()` |
| `public` | `void` | `setPreviousBlockType(String previousBlockType)` |
| `public` | `float` | `getSpreadRate()` |
| `public` | `void` | `setSpreadRate(float spreadRate)` |
| `public` | `int` | `getExecutions()` |
| `public` | `void` | `setExecutions(int executions)` |
| `@Nullable public` | `Component<ChunkStore>` | `clone()` |
