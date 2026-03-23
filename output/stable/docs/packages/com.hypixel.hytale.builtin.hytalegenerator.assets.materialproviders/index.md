---
title: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders"
kind: "package"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "material"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders`

Material provider asset definitions for the Hytale world generator. Each subclass configures how block materials are selected during terrain generation, supporting constant, weighted, depth-based, density-based, striped, and imported material strategies.

## Types

| Type | Kind | Description |
|---|---|---|
| [MaterialProviderAsset](MaterialProviderAsset.md) | class | Abstract base for all material provider assets. |
| [ConstantMaterialProviderAsset](ConstantMaterialProviderAsset.md) | class | Returns a single constant material for every position. |
| [DownwardDepthMaterialProviderAsset](DownwardDepthMaterialProviderAsset.md) | class | Applies a delegate material provider only within a configured depth measured downward from a surface. |
| [DownwardSpaceMaterialProviderAsset](DownwardSpaceMaterialProviderAsset.md) | class | Applies a delegate material provider only within a configured space measured downward from an air pocket. |
| [FieldFunctionMaterialProviderAsset](FieldFunctionMaterialProviderAsset.md) | class | Selects materials based on a density field function. |
| [ImportedMaterialProviderAsset](ImportedMaterialProviderAsset.md) | class | References a material provider exported by another asset via its name. |
| [QueueMaterialProviderAsset](QueueMaterialProviderAsset.md) | class | Applies a sequence of material providers in order, producing a `QueueMaterialProvider`. |
| [SimpleHorizontalMaterialProviderAsset](SimpleHorizontalMaterialProviderAsset.md) | class | Restricts a delegate material provider to a horizontal band defined by top and bottom Y coordinates, optionally offset by named decimal constants. |
| [SolidityMaterialProviderAsset](SolidityMaterialProviderAsset.md) | class | Selects between two material providers based on whether the terrain position is solid or empty. |
| [StripedMaterialProviderAsset](StripedMaterialProviderAsset.md) | class | Applies a material provider within horizontal stripe bands defined by top and bottom Y values. |
| [TerrainDensityMaterialProviderAsset](TerrainDensityMaterialProviderAsset.md) | class | Selects materials based on terrain density value ranges, similar to `FieldFunctionMaterialProviderAsset` but using the built-in terrain density. |
| [UpwardDepthMaterialProviderAsset](UpwardDepthMaterialProviderAsset.md) | class | Applies a delegate material provider only within a configured depth measured upward from a surface. |
| [UpwardSpaceMaterialProviderAsset](UpwardSpaceMaterialProviderAsset.md) | class | Applies a delegate material provider only within a configured space measured upward from an air pocket. |
| [WeightedMaterialProviderAsset](WeightedMaterialProviderAsset.md) | class | Selects a material provider randomly from a weighted list, with an optional skip chance and seed for deterministic randomness. |
