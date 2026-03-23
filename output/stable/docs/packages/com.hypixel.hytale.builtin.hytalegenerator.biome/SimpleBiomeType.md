---
title: "SimpleBiomeType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.biome"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.biome.SimpleBiomeType"
api_surface: false
extends: null
implements: ["BiomeType"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "biome"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.biome`

```java
public class SimpleBiomeType implements BiomeType
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Density` | `terrainDensity` |
| `private final` | `MaterialProvider<Material>` | `materialProvider` |
| `private final` | `List<PropField>` | `propFields` |
| `private final` | `EnvironmentProvider` | `environmentProvider` |
| `private final` | `TintProvider` | `tintProvider` |
| `private final` | `String` | `biomeName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `addPropFieldTo(PropField propField)` |
| `@Override public` | `MaterialProvider<Material>` | `getMaterialProvider()` |
| `@Nonnull @Override public` | `Density` | `getTerrainDensity()` |
| `@Override public` | `String` | `getBiomeName()` |
| `@Override public` | `List<PropField>` | `getPropFields()` |
| `@Override public` | `EnvironmentProvider` | `getEnvironmentProvider()` |
| `@Override public` | `TintProvider` | `getTintProvider()` |
| `@Override public` | `List<Assignments>` | `getAllPropDistributions()` |
