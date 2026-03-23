---
title: "com.hypixel.hytale.builtin.hytalegenerator.props"
package: "com.hypixel.hytale.builtin.hytalegenerator.props"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props`

This package defines prop types for the Hytale world generator. Props are procedural placement operations that scan voxel space for valid positions and place materials, block structures, or composite arrangements.

## Classes

| Type | Description |
|---|---|
| `BoxProp` | Prop that places a filled box of material at scanned positions |
| `ClusterProp` | Prop that places clusters of weighted child props using density and seed-based randomization |
| `ColumnProp` | Prop that places vertical columns with configurable height, material, and directionality |
| [DensityProp](DensityProp.md) | Prop that places material based on a density field evaluation at each voxel position |
| [OffsetProp](OffsetProp.md) | Wrapper prop that offsets a child prop's placement by a fixed vector |
| `PositionListScanResult` | Scan result containing a list of valid placement positions |
| `PositionScanResult` | Scan result containing a single valid placement position |
| [Prop](Prop.md) | Abstract base class for all world generator props |
| [QueueProp](QueueProp.md) | Prop that executes a list of child props in sequence at the same position |
| [UnionProp](UnionProp.md) | Prop that combines multiple child props, executing all that produce valid scan results |
| [WeightedProp](WeightedProp.md) | Prop that randomly selects a child prop from a weighted distribution using seed-based randomization |

## Interfaces

| Type | Description |
|---|---|
| `ScanResult` | Interface for prop scan results indicating whether placement is valid |
