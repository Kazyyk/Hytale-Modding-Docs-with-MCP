---
title: "SimpleBiome"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.biome"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.biome.SimpleBiome"
api_surface: false
extends: null
implements: ["Biome"]
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
public class SimpleBiome implements Biome
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
| `@Nonnull @Override public` | `MaterialProvider<Material>` | `getMaterialProvider()` |
| `@Nonnull @Override public` | `Density` | `getTerrainDensity()` |
| `@Nonnull @Override public` | `String` | `getBiomeName()` |
| `@Nonnull @Override public` | `List<PropField>` | `getPropFields()` |
| `@Nonnull @Override public` | `EnvironmentProvider` | `getEnvironmentProvider()` |
| `@Nonnull @Override public` | `TintProvider` | `getTintProvider()` |
| `@Nonnull @Override public` | `List<Assignments>` | `getAllPropDistributions()` |
