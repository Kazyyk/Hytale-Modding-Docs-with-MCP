---
title: "com.hypixel.hytale.procedurallib.condition"
package: "com.hypixel.hytale.procedurallib.condition"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
---

**Package:** `com.hypixel.hytale.procedurallib.condition`

## Interfaces

| Type | Description |
|---|---|
| [IBlockFluidCondition](IBlockFluidCondition.md) | Condition evaluating block and fluid IDs |
| [ICoordinateCondition](ICoordinateCondition.md) | Condition evaluating seed and coordinates |
| [ICoordinateRndCondition](ICoordinateRndCondition.md) | Condition evaluating seed, coordinates, and Random |
| [IDoubleCondition](IDoubleCondition.md) | Condition evaluating a double value |
| [IDoubleThreshold](IDoubleThreshold.md) | Threshold evaluating double with optional factor |
| [IHeightThresholdInterpreter](IHeightThresholdInterpreter.md) | Interpolated height-based threshold provider |
| [IIntCondition](IIntCondition.md) | Condition evaluating an integer value |

## Classes

| Type | Description |
|---|---|
| [BasicHeightThresholdInterpreter](BasicHeightThresholdInterpreter.md) | Height threshold interpreter with interpolated values |
| [ConstantBlockFluidCondition](ConstantBlockFluidCondition.md) | Constant-result block/fluid condition |
| [ConstantIntCondition](ConstantIntCondition.md) | Constant-result integer condition |
| [DefaultCoordinateCondition](DefaultCoordinateCondition.md) | Default constant-result coordinate condition |
| [DefaultCoordinateRndCondition](DefaultCoordinateRndCondition.md) | Default constant-result coordinate random condition |
| [DefaultDoubleCondition](DefaultDoubleCondition.md) | Default constant-result double condition |
| [DefaultDoubleThresholdCondition](DefaultDoubleThresholdCondition.md) | Default constant-result double threshold condition |
| [DoubleThreshold](DoubleThreshold.md) | Double threshold with Single and Multiple inner classes |
| [DoubleThresholdCondition](DoubleThresholdCondition.md) | Double condition backed by an IDoubleThreshold |
| [HeightCondition](HeightCondition.md) | Height condition using threshold interpreter with random |
| [HeightThresholdCoordinateCondition](HeightThresholdCoordinateCondition.md) | Height threshold as coordinate condition using hash-based random |
| [NoiseHeightThresholdInterpreter](NoiseHeightThresholdInterpreter.md) | Noise-modulated height threshold interpreter |
| [NoiseMaskCondition](NoiseMaskCondition.md) | Coordinate condition using noise mask with double condition |
| [SingleDoubleCondition](SingleDoubleCondition.md) | Double condition checking if value is below threshold |
