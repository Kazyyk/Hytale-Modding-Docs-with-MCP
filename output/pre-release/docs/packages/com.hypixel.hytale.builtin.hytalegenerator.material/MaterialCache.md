---
title: "MaterialCache"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.material"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.material.MaterialCache"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "material"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.material`

```java
public class MaterialCache
```

Thread-safe cache for `Material`, `SolidMaterial`, and `FluidMaterial` instances. Deduplicates material objects by their content hash using `ConcurrentHashMap` stores. Pre-caches commonly used materials as public fields (e.g., `EMPTY_AIR`, `ROCK_STONE`, `SOIL_GRASS`, `FLUID_WATER`). Provides lookup methods by block name string, rotation tuple, and raw IDs. Used by `TerrainStage` and `PropStage` during material assignment.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `ConcurrentHashMap<Integer, SolidMaterial>` | `hashToSolidMap` |
| `@Nonnull private final` | `ConcurrentHashMap<Integer, FluidMaterial>` | `hashToFluidMap` |
| `@Nonnull private final` | `ConcurrentHashMap<Integer, Material>` | `hashToMaterialMap` |
| `@Nullable public final` | `SolidMaterial` | `EMPTY_AIR` |
| `@Nullable public final` | `SolidMaterial` | `ROCK_STONE` |
| `@Nullable public final` | `SolidMaterial` | `SOIL_GRASS` |
| `@Nullable public final` | `SolidMaterial` | `SOIL_DIRT` |
| `@Nullable public final` | `SolidMaterial` | `SOIL_MUD` |
| `@Nullable public final` | `SolidMaterial` | `SOIL_NEEDLES` |
| `@Nullable public final` | `SolidMaterial` | `SOIL_GRAVEL` |
| `@Nullable public final` | `SolidMaterial` | `ROCK_QUARTZITE` |
| `@Nullable public final` | `SolidMaterial` | `ROCK_MARBLE` |
| `@Nullable public final` | `SolidMaterial` | `ROCK_SHALE` |
| `@Nullable public final` | `SolidMaterial` | `FLUID_WATER` |
| `@Nullable public final` | `SolidMaterial` | `BEDROCK` |
| `@Nullable public final` | `FluidMaterial` | `UNKNOWN_FLUID` |
| `@Nullable public final` | `FluidMaterial` | `EMPTY_FLUID` |
| `@Nonnull public final` | `Material` | `EMPTY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Material` | `getMaterial(@Nonnull SolidMaterial solidMaterial, @Nonnull FluidMaterial fluidMaterial)` |
| `@Nonnull public` | `Material` | `getMaterialRotated(@Nonnull Material material, @Nonnull RotationTuple rotation)` |
| `@Nullable public` | `FluidMaterial` | `getFluidMaterial(@Nonnull String fluidString)` |
| `@Nullable public` | `FluidMaterial` | `getFluidMaterial(int fluidId, byte level)` |
| `@Nonnull private` | `FluidMaterial` | `getOrRegisterFluid(int fluidId, byte level)` |
| `@Nullable public` | `SolidMaterial` | `getSolidMaterial(@Nonnull String solidString, @Nonnull RotationTuple rotation)` |
| `@Nullable public` | `SolidMaterial` | `getSolidMaterial(@Nonnull String solidString)` |
| `@Nonnull public` | `SolidMaterial` | `getSolidMaterialRotatedY(@Nonnull SolidMaterial solidMaterial, @Nonnull Rotation rotation)` |
| `@Nullable public` | `SolidMaterial` | `getSolidMaterial(int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder)` |
