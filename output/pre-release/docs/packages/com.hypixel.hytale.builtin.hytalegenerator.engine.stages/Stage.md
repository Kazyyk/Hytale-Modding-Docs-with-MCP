---
title: "Stage"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.stages.Stage"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "stages"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.stages`

```java
public interface Stage
```

Defines a single step in the staged chunk generation pipeline. Each stage declares its input buffer types with required bounds, output buffer types, and a `run` method that reads from input buffers and writes to output buffers. Implementations: [BiomeStage](BiomeStage.md), [BiomeDistanceStage](BiomeDistanceStage.md), [TerrainStage](TerrainStage.md), [EnvironmentStage](EnvironmentStage.md), [TintStage](TintStage.md), [PropStage](PropStage.md).

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [Stage.Context](Stage.Context.md) | class | Execution context providing buffer access and worker ID |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `void` | `run(@Nonnull Stage.Context var1)` |
| `@Nonnull` | `Map<BufferType, Bounds3i>` | `getInputTypesAndBounds_bufferGrid()` |
| `@Nonnull` | `List<BufferType>` | `getOutputTypes()` |
| `@Nonnull` | `String` | `getName()` |
